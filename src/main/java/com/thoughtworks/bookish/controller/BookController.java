package com.thoughtworks.bookish.controller;

import com.thoughtworks.bookish.model.Book;
import com.thoughtworks.bookish.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getById(@PathVariable long id) {
        return bookService.getById(id);
    }
}
