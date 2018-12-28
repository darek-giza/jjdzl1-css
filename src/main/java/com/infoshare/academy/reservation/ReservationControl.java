package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationControl {
    public static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static SimpleDateFormat getDateFormatter() {
        return dateFormatter;
    }
    public static Reservation addReservation(Integer carId, Integer userId, Date startDate, Date endDate) {
        Reservation reservation = new Reservation(carId, userId, startDate, endDate);
        StringBuilder newRow = new StringBuilder();
        newRow.append(reservation.id+ ",");
        newRow.append(reservation.carId+",");
        newRow.append(reservation.userId+",");
        newRow.append(dateFormatter.format(reservation.startDate)+",");
        newRow.append(dateFormatter.format(reservation.endDate));
        FileIO.writeLine(FilePath.getReservationPath(), newRow.toString());

        return reservation;

    }
    public static Boolean checkIfCarAvailable(Integer idCar, Date startDate, Date endDate) {
        String reservations = FileIO.readFile(FilePath.getReservationPath()).toString();
        for (String row : reservations.split("\n")) {
            if (row.isEmpty()) {
                continue;
            }
            String[] data = row.split(",");
            try {
                Reservation reservation = new Reservation((data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), ReservationControl.dateFormatter.parse(data[3]), ReservationControl.dateFormatter.parse(data[4]));

                boolean isStartDateContained = reservation.getStartDate().compareTo(startDate) <= 0 && reservation.getEndDate().compareTo(startDate) >= 0;
                boolean isEndDateContained = reservation.getStartDate().compareTo(endDate) <= 0 && reservation.getEndDate().compareTo(endDate) >= 0;
                if (idCar == reservation.getCarId() && (isStartDateContained || isEndDateContained)) {
                    return false;

                }

            } catch (ParseException e) {
                System.out.println("Cannot Parse Data");
            }
        }


        return true;
    }


}
