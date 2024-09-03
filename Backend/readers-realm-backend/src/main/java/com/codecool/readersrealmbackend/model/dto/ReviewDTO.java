package com.codecool.readersrealmbackend.model.dto;


import com.codecool.readersrealmbackend.model.User;

public record ReviewDTO(long id,
                        User writer,
                        String review) {
}
