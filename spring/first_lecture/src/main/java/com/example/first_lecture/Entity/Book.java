package com.example.first_lecture.Entity;

import lombok.*;
import org.springframework.stereotype.Component;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@Getter
@Setter
public class Book {
    private Long id;
    private String title;
    private String author;
    private Double price;
}