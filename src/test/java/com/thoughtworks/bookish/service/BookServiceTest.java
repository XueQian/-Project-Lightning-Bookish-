package com.thoughtworks.bookish.service;

import com.thoughtworks.bookish.Application;
import com.thoughtworks.bookish.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    public void shouldGetAllBooksCorrectly() {

        List<Book> books = bookService.getAll();

        assertThat(books.size(), greaterThan(0));
    }

    @Test
    public void shouldGetOneBookByIdCorrectly() {

        Book book = bookService.getById((long) 9);

        assertThat(book.getTitle(), is("重构:改善既有代码的设计"));
    }
}




