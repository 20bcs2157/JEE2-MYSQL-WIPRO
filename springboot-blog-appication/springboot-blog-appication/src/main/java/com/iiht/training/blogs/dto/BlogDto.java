package com.iiht.training.blogs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDto {
    private Long id;

    @NotBlank(message = "Blog title cannot be empty")
    @Size(min = 3, max = 100, message = "Blog title must be between 3 and 100 characters")
    private String title;

    @NotBlank(message = "Blog content cannot be empty")
    @Size(min = 3, max = 200, message = "Blog content must be between 3 and 200 characters")
    private String content;
}
//	@Override
//	public int hashCode() {
//		return Objects.hash(content, id, title);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		BlogDto other = (BlogDto) obj;
//		return Objects.equals(content, other.content) && Objects.equals(id, other.id)
//				&& Objects.equals(title, other.title);
//	}
//}
