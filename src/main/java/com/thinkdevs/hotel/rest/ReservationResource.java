package com.thinkdevs.hotel.rest;

import com.thinkdevs.hotel.model.request.ReservationRequest;
import com.thinkdevs.hotel.model.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static com.thinkdevs.hotel.rest.ResourceConstants.ROOM_RESERVATION_V1;

@RestController
@RequestMapping(ROOM_RESERVATION_V1)
public class ReservationResource {

    @GetMapping(path = "")
    public ResponseEntity<ReservationResponse> getAvailableRooms(
            @RequestParam(value = "checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    LocalDate checkin,
            @RequestParam(value = "checkout")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    LocalDate checkout) {

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);

    }

    @PostMapping("")
    public ResponseEntity<ReservationResponse> createReservation(
           @RequestBody ReservationRequest reservationRequest
    ){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<ReservationResponse> update(
            @RequestBody ReservationRequest reservationRequest
    ){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @DeleteMapping("/{reservationId}")
    public ResponseEntity<Void> deleteReservation(
            @PathVariable long reservationId
    ){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
