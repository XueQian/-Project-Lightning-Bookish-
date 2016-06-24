package com.thoughtworks.bookish.service;

import com.thoughtworks.bookish.model.Book;
import com.thoughtworks.bookish.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
//@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }
}
