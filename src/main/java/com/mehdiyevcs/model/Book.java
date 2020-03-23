package com.mehdiyevcs.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "books")
public @Data
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "author_fullname")
    private String authorFullName;

    @Column(name = "book_name")
    private String bookName;

}
