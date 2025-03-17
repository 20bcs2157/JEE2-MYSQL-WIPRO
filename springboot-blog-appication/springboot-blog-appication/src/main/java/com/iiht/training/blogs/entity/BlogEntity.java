package com.iiht.training.blogs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blogs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Blog title cannot be empty")
    @Size(min = 3, max = 100, message = "Blog title must be between 3 and 100 characters")
    private String title;

    @NotBlank(message = "Blog content cannot be empty")
    @Size(min = 3, max = 200, message = "Blog content must be between 3 and 200 characters")
    private String content;
}
