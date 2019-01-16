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
            System.out.println("4\t Wyjście");
            System.out.print("Wybór: ");

            //Get user's input choice
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(MessagesEnum.LIST_OF_CARS.getMessage());
                    //TODO: Implement listing all types of cars
                    chooseCarType();
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

    public static void carOffRoadList() {
        CarMaker.createCarOffRoadList().stream()
                .map(CarOffRoad -> "Samochód terenowy o id=" + CarOffRoad.getId() + ": " + CarOffRoad.getMake() + " " + CarOffRoad.getModel() + ", rok produkcji: " + CarOffRoad.getYear())
                .forEach(System.out::println);
    }

    public static void carTruckList() {
        CarMaker.createCarTruckList().stream()
                .map(CarTruck -> "Samochód terenowy o id=" + CarTruck.getId() + ": " + CarTruck.getMake() + " " + CarTruck.getModel() + ", rok produkcji: " + CarTruck.getYear())
                .forEach(System.out::println);
    }

    public static void showChooseCarTypeMenuMessages(){
        System.out.println(MessagesEnum.CHOOSE_CAR_TYPE.getMessage());
        System.out.println("1\t Samochód osobowy");
        System.out.println("2\t Samochód terenowy");
        System.out.println("3\t Samochód ciężarowy");
        System.out.println("4\t Powrót do głównego Menu");
        System.out.print(MessagesEnum.CHOICE.getMessage());
    }


    public static String chooseCarType() {
        Scanner in = new Scanner(System.in);
        showChooseCarTypeMenuMessages();
        String choice = in.nextLine();
        switch (choice) {
            case "1":
                carPassengerList();
                break;
            case "2":
                carOffRoadList();
                break;
            case "3":
                carTruckList();
                break;
            case "4":
                showMainMenu();
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        }
        return choice;
    }
}