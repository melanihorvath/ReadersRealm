package com.codecool.readersrealmbackend.repository;

import com.codecool.readersrealmbackend.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Long> {
}
