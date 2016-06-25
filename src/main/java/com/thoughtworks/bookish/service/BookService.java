package com.thoughtworks.bookish.service;

import com.thoughtworks.bookish.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book getById(Long id);
}
