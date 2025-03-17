package com.iiht.training.blogs.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.iiht.training.blogs.dto.BlogDto;
import com.iiht.training.blogs.entity.BlogEntity;
import com.iiht.training.blogs.exception.BlogNotFoundException;
import com.iiht.training.blogs.repository.BlogRepository;
import com.iiht.training.blogs.service.BlogService;

import jakarta.transaction.Transactional;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<BlogDto> getAllBlogs(){
		List<BlogEntity> blogEntities = blogRepository.findAll();
		
		// Convert List<BlogEntity> to List<BlogDto>
	    return blogEntities.stream()
	            .map(this::mapToDto)
	            .collect(Collectors.toList());
	}
	
	
	@Override
	public BlogDto createBlog(BlogDto blogDto) {
	    	// Convert DTO to Entity
	        BlogEntity blogEntity = mapToEntity(blogDto);
	        // Save to DB
	        blogEntity = blogRepository.save(blogEntity);
	        // Convert back to DTO and return
	        return mapToDto(blogEntity);
	}

	@Override
	public BlogDto getBlogById(Long id) {
		// Find Blog by ID
		BlogEntity blogEntity = blogRepository.findById(id)
				.orElseThrow(() -> new BlogNotFoundException("Blog with ID " + id + " not found."));
		// Convert to DTO and return
		return mapToDto(blogEntity);
	}
	//.orElseThrow(() -> new BlogNotFoundException("Blog not found with ID: " + id));
	
	
	@Transactional
	@Override
	public BlogDto updateBlog(Long id, BlogDto blogDto) {
		// Find Blog by ID
	    BlogEntity existingBlog = blogRepository.findById(id)
	    		.orElseThrow(() -> new BlogNotFoundException("Blog with ID " + id + " not found."));

	    
//	    existingBlog.setTitle(blogDto.getTitle());
//	    existingBlog.setContent(blogDto.getContent());
	    
	    modelMapper.map(blogDto,existingBlog);
	        existingBlog = blogRepository.save(existingBlog);
	        // Convert to DTO and return
	        return mapToDto(existingBlog);
	   
	}

	@Override
	public Boolean deleteBlog(Long id) {
		// Check if Blog Exists
		Optional<BlogEntity> blogEntity = blogRepository.findById(id);
		if (blogEntity.isPresent()) {
			// Delete Blog
			blogRepository.deleteById(id);
			return true;			
		}
		throw new BlogNotFoundException("Blog not found with ID: " + id);		
	}

	// Helper Methods for Conversion
	private BlogDto mapToDto(BlogEntity blogEntity) {
//		BlogDto dto = new BlogDto();
//		dto.setId(blogEntity.getId());
//		dto.setTitle(blogEntity.getTitle());
//		dto.setContent(blogEntity.getContent());
//		return dto;
		
		return modelMapper.map(blogEntity, BlogDto.class);
	}

	private BlogEntity mapToEntity(BlogDto blogDto) {
//		BlogEntity entity = new BlogEntity();
//		entity.setTitle(blogDto.getTitle());
//		entity.setContent(blogDto.getContent());
//		return entity;
		return modelMapper.map(blogDto, BlogEntity.class);
	}
}
