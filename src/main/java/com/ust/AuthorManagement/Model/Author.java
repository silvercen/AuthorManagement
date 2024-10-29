package com.ust.AuthorManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    private Integer authorId;
    private String authorName;
    private String authorEmail;
}
