package com.capstone.service;


import java.util.List;

import com.capstone.dto.CommentDto;

public interface CommentService {

	public CommentDto postComment(CommentDto commentDto);
	List<CommentDto> getCommentsByBlogId(Long blogId);

}