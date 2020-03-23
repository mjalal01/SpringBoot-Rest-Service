package com.mehdiyevcs.dao;


import com.mehdiyevcs.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookDao extends JpaRepository<Book,Integer> {
}
