package com.codecool.readersrealmbackend.model.dto.newDTO;

import com.codecool.readersrealmbackend.model.User;

public record NewReviewDTO(User writer,
                           String review) {
}
