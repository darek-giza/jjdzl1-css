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

    public static void showMainMenu() {
        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Lista samochodów");
        System.out.println("2\t Szczegóły samochodu");
        System.out.println("3\t Rezerwacja");
        System.out.println("4\t Koniec");
        System.out.println("Wybór:");
        //Get user's choice
        String choice = in.nextLine();
        //Display the title of the chosen position
        switch (choice) {
            case "1":
                System.out.println(MessagesEnum.LIST_OF_CARS.getMessage());
                //implementation printListOfCar method
                break;
            case "2":
                System.out.println(MessagesEnum.PRINT_DESCRIPTION.getMessage());
                break;
            case "3":
                System.out.println(MessagesEnum.RESERVATION.getMessage());
                break;
            case "4":
                System.out.println(MessagesEnum.END.getMessage());
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        }
    }

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
            date = Reservation.dateFormatter.parse(in.nextLine());
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