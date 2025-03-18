package com.capstone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.dto.BlogDto;
import com.capstone.dto.CommentDto;
import com.capstone.exception.BlogNotFoundException;
import com.capstone.service.BlogService;
import com.capstone.service.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/blogs")
//@Validated
public class BlogController {

	@Autowired
	private BlogService blogService;

	@Autowired
	private CommentService commentService;
	
	//Fetch all Blogs
	@GetMapping
	public List<BlogDto> getAllBlogs(){
		return blogService.getAllBlogs();
	}

	// Create a Blog
	@PostMapping
	public ResponseEntity<BlogDto> createBlog(@Valid @RequestBody BlogDto blogDto) {
		BlogDto createdBlog = blogService.createBlog(blogDto);
		return new ResponseEntity<>(createdBlog, HttpStatus.CREATED);
	}

	// Get Blog by ID
	@GetMapping("/{id}")
	public ResponseEntity<BlogDto> getBlogById(@PathVariable Long id) {
		BlogDto blogDto = blogService.getBlogById(id);
		return new ResponseEntity<>(blogDto, HttpStatus.OK);
	}

	// Update Blog by ID
	@PutMapping("/{id}")
	public ResponseEntity<BlogDto> updateBlog(@PathVariable Long id, @Valid @RequestBody BlogDto blogDto) {
		BlogDto updatedBlog = blogService.updateBlog(id, blogDto);
		return new ResponseEntity<>(updatedBlog, HttpStatus.OK);
	}

	// Delete Blog by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteBlog(@PathVariable Long id) {
		boolean isDeleted = blogService.deleteBlog(id);
		return new ResponseEntity<>(isDeleted, HttpStatus.OK);
	}

	// Post a Comment on a Blog
	@PostMapping("/comment")
	public ResponseEntity<CommentDto> postComment(@Valid @RequestBody CommentDto commentDto) {
		CommentDto postedComment = commentService.postComment(commentDto);
		return new ResponseEntity<>(postedComment, HttpStatus.OK);
	}

	// Exception Handler for Blog Not Found
	@ExceptionHandler(BlogNotFoundException.class)
	public ResponseEntity<String> handleBlogNotFoundException(BlogNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/comment/{id}")
	public ResponseEntity<Map<String, Object>> getBlogWithComments(@PathVariable Long id) {
	    // Retrieve Blog
	    BlogDto blogDto = blogService.getBlogById(id);

	    // Retrieve Comments
	    List<CommentDto> comments = commentService.getCommentsByBlogId(id);

	    // Prepare Response
	    Map<String, Object> response = new HashMap<>();
	    response.put("blog", blogDto);

	    if (comments.isEmpty()) {
	        response.put("comments", "There are no comments on this blog");
	    } else {
	        response.put("comments", comments);
	    }

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}

}