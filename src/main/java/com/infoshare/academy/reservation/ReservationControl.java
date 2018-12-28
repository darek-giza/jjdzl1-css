package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationControl {
    public static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static SimpleDateFormat getDateFormatter() {
        return dateFormatter;
    }
    public static Reservation addReservation(Integer carId, Integer userId, Date startDate, Date endDate) {
        Reservation reservation = new Reservation(carId, userId, startDate, endDate);

        FileIO.writeLine(FilePath.getReservationPath(), reservation.reservationToString());

        return reservation;

    }
    public static Boolean checkIfCarAvailable(Integer idCar, Date startDate, Date endDate) {
        String reservations = FileIO.readFile(FilePath.getReservationPath()).toString();
        for (String row : reservations.split("\n")) {
            if (row.isEmpty()) {
                continue;
            }
            Reservation reservation=Reservation.stringToReservation(row);
            if (reservation == null) {
                continue;
            }
            boolean isStartDateContained = reservation.getStartDate().compareTo(startDate) <= 0 && reservation.getEndDate().compareTo(startDate) >= 0;
            boolean isEndDateContained = reservation.getStartDate().compareTo(endDate) <= 0 && reservation.getEndDate().compareTo(endDate) >= 0;
            if (idCar == reservation.getCarId() && (isStartDateContained || isEndDateContained)) {
                return false;
            }
        }
        return true;
    }


}
