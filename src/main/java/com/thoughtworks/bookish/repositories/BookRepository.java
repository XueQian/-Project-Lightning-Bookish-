package com.thoughtworks.bookish.repositories;

import com.thoughtworks.bookish.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}