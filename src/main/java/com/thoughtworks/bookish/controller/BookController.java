package com.thoughtworks.bookish.controller;

import com.thoughtworks.bookish.model.Book;
import com.thoughtworks.bookish.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    BookService bookService;

//    @RequestMapping(method = RequestMethod.GET)
//    public Page<Book> getAll(@PageableDefault(value = 4, sort = {"id"}, direction = Sort.Direction.DESC)
//                             Pageable pageable) {
//        System.out.println("******************");
//        System.out.println(pageable.getPageNumber());
//        System.out.println(pageable.getPageSize());
//        return bookService.getAll(pageable);
//    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<Book> getAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(page, 6, sort);
        return bookService.getAll(pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getById(@PathVariable Long id) {
        return bookService.getById(id);
    }
}
