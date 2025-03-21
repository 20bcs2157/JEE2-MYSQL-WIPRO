package com.iiht.training.blogs.service;

import java.util.List;

import com.iiht.training.blogs.dto.BlogDto;

public interface BlogService {

	public BlogDto createBlog(BlogDto blogDto);

	public BlogDto getBlogById(Long id);

	public BlogDto updateBlog(Long id, BlogDto blogDto);

	public Boolean deleteBlog(Long id);
	
	// OPTIONALS
	public List<BlogDto> getAllBlogs();
}