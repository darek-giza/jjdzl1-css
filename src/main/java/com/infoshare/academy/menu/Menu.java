package com.infoshare.academy.menu;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.infoshare.academy.model.cars.Car;
import com.infoshare.academy.model.carsservice.CarMaker;
import com.infoshare.academy.reservation.ReservationControl;

public class Menu {
    static Scanner in = new Scanner(System.in);

    public static void getUserDataInput() {
       Date startDate = Menu.getDate("Wpisz datę rozpoczęcia rezerwacji( YYYY-MM-DD )");
       Date endDate = Menu.getDate("Wpisz datę zakończenia rezerwacji( YYYY-MM-DD )");
       if (startDate.compareTo(endDate) > 0) {
          System.out.println("Data końcowa nie może być mniejsza niż data końcowa");
            Menu.getUserDataInput();
            return;
       }
        System.out.println("Wybierz auto");
        for(Car car: CarMaker.readCar()){
            if(ReservationControl.checkIfCarAvailable(car.getId(),startDate,endDate)){
                System.out.println(car);
            }
        }

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
}