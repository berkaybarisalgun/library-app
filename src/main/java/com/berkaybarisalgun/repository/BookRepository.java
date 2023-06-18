package com.berkaybarisalgun.repository;

import com.berkaybarisalgun.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class BookRepository extends JpaRepository<Book,Long>, JpaSpecificationExecutor<Book> {

}
