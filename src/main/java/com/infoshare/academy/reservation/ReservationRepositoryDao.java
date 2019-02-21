package com.infoshare.academy.reservation;

import java.util.List;

public interface ReservationRepositoryDao {
    List<Reservation> getReservationList();
    List<Reservation> getReservationByUserId(int user);
    List<Reservation> getReservationByCarId(int car);
}

