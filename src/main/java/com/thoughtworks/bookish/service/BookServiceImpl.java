package com.thoughtworks.bookish.service;

import com.thoughtworks.bookish.model.Book;
import com.thoughtworks.bookish.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
//@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Page<Book> getAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findOne(id);
    }
}
