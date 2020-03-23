package com.mehdiyevcs.service;

import com.mehdiyevcs.dao.BookDao;
import com.mehdiyevcs.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {


    @Autowired
    BookDao bookDao;


    public Iterable<Book> getAllBooks(){
        return bookDao.findAll();
    }

    public Optional<Book> getBookById(Integer integer){
        return bookDao.findById(integer);
    }

    public void deleteBookById(Integer integer){
        bookDao.deleteById(integer);
    }

    public void deleteBook(Book book){
        bookDao.delete(book);
    }

    public void addBook(Book book){
        bookDao.save(book);
    }

    public void updateBook(Book book){
        bookDao.save(book);
    }

}
