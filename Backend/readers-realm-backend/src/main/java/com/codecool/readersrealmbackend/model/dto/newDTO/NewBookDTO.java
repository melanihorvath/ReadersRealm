package com.codecool.readersrealmbackend.model.dto.newDTO;

import com.codecool.readersrealmbackend.model.Label;
import com.codecool.readersrealmbackend.model.Review;
import com.codecool.readersrealmbackend.model.User;

import java.util.Set;

public record NewBookDTO(String title,
                         String author,
                         String series,
                         String publisher,
                         long ISBN,
                         long numberOfPages,
                         String details) {
}
