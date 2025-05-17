package com.example.UberProject_EntityService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class PassengerRating extends Review{
    @Column(nullable = false)
    private String passengerReviewContent;

    @Column(nullable = false)
    private String passengerRating;
}
