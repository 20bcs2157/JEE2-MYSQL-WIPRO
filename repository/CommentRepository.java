package com.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.entity.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
	
	List<CommentEntity> findByBlogId(Long blogId);
}
