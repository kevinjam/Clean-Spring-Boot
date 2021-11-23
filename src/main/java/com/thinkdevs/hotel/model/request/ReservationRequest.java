package com.thinkdevs.hotel.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ReservationRequest {
    private Long id;
    @JsonIgnore
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;
    @JsonIgnore
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;

    public ReservationRequest() {
    }

    public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }
}
