package com.thinkdevs.hotel.model.response;

import com.thinkdevs.hotel.model.Links;

public class ReservationResponse {
    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links link;

    public ReservationResponse() {
    }

    public ReservationResponse(Long id, Integer roomNumber, Integer price, Links link) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.price = price;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public Links getLink() {
        return link;
    }
}
