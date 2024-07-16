package com.shokr.book.book;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {
        private Integer id;
        private String title;
        private String authorName;
        private String isbn;
        private String synopsis;
        private String owner;
        private byte[] cover;
        private boolean shareable;
        private boolean archived;
        private double rate;

}
