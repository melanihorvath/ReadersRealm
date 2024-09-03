package com.codecool.readersrealmbackend.model.dto;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.Gender;

import java.time.LocalDate;
import java.util.Set;

public record UserDTO(long id,
                      String userName,
                      String name,
                      Gender gender,
                      String emailAddress,
                      String password,
                      LocalDate birthDate,
                      LocalDate registrationDate) {
}
