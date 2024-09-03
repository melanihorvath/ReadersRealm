package com.codecool.readersrealmbackend.repository;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
