package com.mehdiyevcs.controller;

import com.mehdiyevcs.model.Book;
import com.mehdiyevcs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getBooks")
    public Iterable<Book> getBooks(){
        Iterable<Book> book=null;
        return bookService.getAllBooks();
    }

    @GetMapping(value = "/getBook/{id}")
    public Optional<Book> getBook(@PathVariable("id") Integer  bookId){
        Optional<Book> book=null;
        book= bookService.getBookById(bookId);
        return  book;
    }

    @PostMapping(value = "/addBook")
    public Book addBook(@RequestBody Book book){
        bookService.addBook(book);
        return book;
    }

    @PutMapping(value = "/updateBook")
    public Book updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        return book;
    }

    @DeleteMapping(value = "/deleteBook")
    public Book deleteBook(@RequestBody Book book){
        bookService.deleteBook(book);
        return book;
    }

    @DeleteMapping(value = "/deleteBook/{id}")
    public Optional<Book> deleteBook(@PathVariable("id") Integer integer){
        Optional<Book> book = bookService.getBookById(integer);
        bookService.deleteBookById(integer);
        return book;
    }


}
