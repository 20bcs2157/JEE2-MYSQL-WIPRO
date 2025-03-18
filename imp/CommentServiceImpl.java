package com.capstone.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.dto.CommentDto;
import com.capstone.entity.CommentEntity;
import com.capstone.exception.BlogNotFoundException;
import com.capstone.repository.BlogRepository;
import com.capstone.repository.CommentRepository;
import com.capstone.service.CommentService;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto postComment(CommentDto commentDto) {
		// Check if the Blog ID exists
		if (!blogRepository.existsById(commentDto.getBlogId())) {
			throw new BlogNotFoundException("Blog not found with ID: " + commentDto.getBlogId());
		}

		// Convert DTO to Entity
		CommentEntity commentEntity = mapToEntity(commentDto);

		// Save Comment to Database
		commentEntity = commentRepository.save(commentEntity);

		// Convert back to DTO and return
		return mapToDto(commentEntity);
	}
	
	
	@Override
	public List<CommentDto> getCommentsByBlogId(Long blogId) {
	    // Check if Blog exists
	    if (!blogRepository.existsById(blogId)) {
	        throw new BlogNotFoundException("Blog not found with ID: " + blogId);
	    }

	    // Fetch Comments
//	    List<CommentEntity> comments = commentRepository.findByBlogId(blogId);
	    // Convert Entities to DTOs
//	    return comments.stream().map(this::mapToDto).collect(Collectors.toList());
	    
	 // Fetch Comments and Convert to DTOs
        return commentRepository.findByBlogId(blogId)
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
	}


	// Helper Methods for Conversion
	private CommentDto mapToDto(CommentEntity commentEntity) {
//		CommentDto dto = new CommentDto();
//		dto.setId(commentEntity.getId());
//		dto.setBlogId(commentEntity.getBlogId());
//		dto.setComment(commentEntity.getComment());
//		return dto;
		return modelMapper.map(commentEntity, CommentDto.class);
	}

	private CommentEntity mapToEntity(CommentDto commentDto) {
//		CommentEntity entity = new CommentEntity();
//		entity.setBlogId(commentDto.getBlogId());
//		entity.setComment(commentDto.getComment());
//		return entity;
		return modelMapper.map(commentDto, CommentEntity.class);
	}
}
