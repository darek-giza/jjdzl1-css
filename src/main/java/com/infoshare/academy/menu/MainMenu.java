package com.infoshare.academy.menu;

import com.infoshare.academy.model.carsservice.CarMaker;
import com.infoshare.academy.reservation.ReservationControl;

import java.util.Scanner;

public class MainMenu {

    public static void appStart() {
        System.out.println(MessagesEnum.APP_START.getMessage());
        System.out.println(MessagesEnum.WELCOME.getMessage());
        //TODO: add user login here
        showMainMenu();
    }

    public static void showMainMenu() {
        Scanner in = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            // Display the menu
            System.out.println("\n*MENU*");
            System.out.println("1\t Lista samochodów");
            System.out.println("2\t Szczegóły samochodu");
            System.out.println("3\t Rezerwacja");
            System.out.println("4\t Koniec");
            System.out.print("Wybór: ");

            //Get user's input choice
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(MessagesEnum.LIST_OF_CARS.getMessage());
                    //TODO: Implement listing all types of cars
                    carPassengerList();
                    break;
                case "2":
                    System.out.println(MessagesEnum.PRINT_DESCRIPTION.getMessage());
                    //TODO: Implement showing car details
                    break;
                case "3":
                    System.out.println(MessagesEnum.RESERVATION.getMessage());
                    ReservationControl.getUserDateInput();
                    break;
                case "4":
                    quit = true;
                    System.out.println(MessagesEnum.END.getMessage());
                    break;
                default:
                    System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
            }
        }
    }

    public static void carPassengerList() {
        CarMaker.createCarPassengerList().stream()
                .map(CarPassenger -> "Samochód osobowy o id=" + CarPassenger.getId() + ": " + CarPassenger.getMake() + " " + CarPassenger.getModel() + ", rok produkcji: " + CarPassenger.getYear())
                .forEach(System.out::println);
    }
}