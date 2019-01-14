package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;
import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.carsservice.CarMaker;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReservationControl {
    static Scanner in = new Scanner(System.in);
    static List idList = new ArrayList();

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


    public static void getUserDataInput() {
        Date startDate = getDate("Wpisz datę rozpoczęcia rezerwacji( YYYY-MM-DD )");
        Date endDate = getDate("Wpisz datę zakończenia rezerwacji( YYYY-MM-DD )");
        if (startDate.compareTo(endDate) > 0) {
            System.out.println("Data końcowa nie może być mniejsza niż data końcowa");
            getUserDataInput();
            return;
        }
        System.out.println("Lista dostępnych samochodów w podanym przedziale czasowym");
        for (Car car : CarMaker.readCar()) {
            if (checkIfCarAvailable(car.getId(), startDate, endDate)) {
                System.out.println(car);
                idList.add(car.getId());
            }
        }

        Integer carId = getId("Wybierz id auta");

        // user na sztywno bo nie ma logowania

        Reservation reservation = addReservation(carId, 1, startDate, endDate);
        System.out.println("Dokonano rezerwacji " + reservation);


    }

    public static Date getDate(String message) {
        System.out.println(message);
        Date date = new Date();
        try {
            date = Reservation.dateFormatter.parse(in.nextLine());
        } catch (ParseException e) {
            System.out.println("Nieprawidłowa data spróbuj ponownie");
            getDate(message);
        }
        return date;
    }

    public static Integer getId(String messege) {
        System.out.println(messege);
        Integer id = Integer.parseInt(in.nextLine());
        if (idList.contains(id)) {
            return id;
        }
        System.out.println("Nieprawidłowy wybór");

        return getId(messege);
    }
}
