package com.codecool.readersrealmbackend.model.dto.newDTO;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.Gender;

import java.time.LocalDate;
import java.util.Set;

public record NewUserDTO(String userName,
                         String name,
                         Gender gender,
                         String emailAddress,
                         String password,
                         LocalDate birthDate,
                         LocalDate registrationDate) {
}
