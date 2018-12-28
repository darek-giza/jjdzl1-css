package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;
import com.infoshare.academy.reservation.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationControl {
    public static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public static SimpleDateFormat getDateFormatter() {
        return dateFormatter;
    }

    public static Reservation addReservation() {
        Date startDate = new Date(2019, 1, 1);
        Date endDate = new Date(2019, 1, 30);
        int carId = 1;
        int userId = 1;

        System.out.println(FileIO.readFile(FilePath.getCarData()));

        return new Reservation(1, 1, 1, startDate, endDate);
    }

    public static Boolean checkIfCarAvailable(Integer idCar,Date startDate, Date endDate) {
        String reservations = FileIO.readFile(FilePath.getReservationPath()).toString();
        for (String row : reservations.split("\n")) {
            String[] data = row.split(",");
            try {
               Reservation reservation = new Reservation(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), ReservationControl.dateFormatter.parse(data[3]), ReservationControl.dateFormatter.parse(data[4]));

               boolean isStartDateContained = reservation.getStartDate().compareTo(startDate) <= 0 && reservation.getEndDate().compareTo(startDate) >= 0;
               boolean isEndDateContained = reservation.getStartDate().compareTo(endDate) <= 0 && reservation.getEndDate().compareTo(endDate) >= 0;
               if(idCar == reservation.getCarId() && (isStartDateContained || isEndDateContained)){
                   return false;

               }

            } catch (ParseException e) {
                System.out.println("Cannot Parse Data");
            }
        }


        return true;
    }

}
