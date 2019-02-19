package com.infoshare.academy.reservation;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;
import java.util.List;

public interface ReservationRepositoryDao {
    List<Reservation> getReservationList();
    List<Reservation> getReservationByUserId(int userId);
    List<Reservation> getReservationByCarId(int carId);
}

