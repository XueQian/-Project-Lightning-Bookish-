package com.thoughtworks.bookish.service;

import com.thoughtworks.bookish.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Page<Book> getAll(Pageable pageable);

    Book getById(Long id);
}
