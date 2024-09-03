package com.codecool.readersrealmbackend.repository;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b JOIN b.labels l WHERE l.id = :labelId")
    List<Book> getBooksByLabelId(@Param("id") long labelId);
}
