package com.codecool.readersrealmbackend.model.dto;

import com.codecool.readersrealmbackend.model.Label;
import com.codecool.readersrealmbackend.model.Review;
import com.codecool.readersrealmbackend.model.User;

import java.util.Set;

public record BookDTO(long id,
                      String title,
                      String author,
                      String series,
                      String publisher,
                      long ISBN,
                      long numberOfPages,
                      String details) {
}
