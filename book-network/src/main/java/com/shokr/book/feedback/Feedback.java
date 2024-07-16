package com.shokr.book.feedback;

import com.shokr.book.book.Book;
import com.shokr.book.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Feedback extends BaseEntity {


    private Double note; // 1 to 5

    private String comment;

    @ManyToOne()
    @JoinColumn(name = "book_id")
    private Book book;






}
