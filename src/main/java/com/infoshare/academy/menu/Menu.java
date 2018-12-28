package com.infoshare.academy.menu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.carsservice.CarMaker;
import com.infoshare.academy.reservation.Reservation;
import com.infoshare.academy.reservation.ReservationControl;

public class Menu {
    static Scanner in = new Scanner(System.in);
    static List idList = new ArrayList();

    public static void getUserDataInput() {
        Date startDate = Menu.getDate("Wpisz datę rozpoczęcia rezerwacji( YYYY-MM-DD )");
        Date endDate = Menu.getDate("Wpisz datę zakończenia rezerwacji( YYYY-MM-DD )");
        if (startDate.compareTo(endDate) > 0) {
            System.out.println("Data końcowa nie może być mniejsza niż data końcowa");
            Menu.getUserDataInput();
            return;
        }
        System.out.println("Lista dostępnych samochodów w podanym przedziale czasowym");
        for (Car car : CarMaker.readCar()) {
            if (ReservationControl.checkIfCarAvailable(car.getId(), startDate, endDate)) {
                System.out.println(car);
                idList.add(car.getId());
            }
        }

        Integer carId = getId("Wybierz id auta");

        // user na sztywno bo nie ma logowania

        Reservation reservation = ReservationControl.addReservation(carId, 1, startDate, endDate);
        System.out.println("Dokonano rezerwacji " + reservation);


    }

    public static Date getDate(String message) {
        System.out.println(message);
        Date date = new Date();
        try {
            date = ReservationControl.getDateFormatter().parse(in.nextLine());
        } catch (ParseException e) {
            System.out.println("Nieprawidłowa data spróbuj ponownie");
            Menu.getDate(message);
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