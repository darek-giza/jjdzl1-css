package com.infoshare.academy.menu;

import com.infoshare.academy.model.carsservice.CarDescription;
import com.infoshare.academy.model.carsservice.CarMaker;

import java.util.Scanner;

public class CarTypeMenu {
    public static void showChooseCarTypeMenuMessages() {
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
                CarDescription.carPassengerList();
                break;
            case "2":
                CarDescription.carOffRoadList();
                break;
            case "3":
                CarDescription.carTruckList();
                break;
            case "4":
                MainMenu.showMainMenu();
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        }
        return choice;
    }

    public static void detailedCarMenu() {
        Scanner in = new Scanner(System.in);
        showChooseCarTypeMenuMessages();
        String choice = in.nextLine();
        switch (choice) {
            case "1":
                System.out.print(MessagesEnum.GET_ID.getMessage());
                CarMaker.readCarPassenger(getCarIdInput());
                break;
            case "2":
                System.out.print(MessagesEnum.GET_ID.getMessage());
                CarMaker.readCarOffRoad(getCarIdInput());
                break;
            case "3":
                System.out.print(MessagesEnum.GET_ID.getMessage());
                CarMaker.readCarTruck(getCarIdInput());
                break;
            case "4":
                MainMenu.showMainMenu();
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        }


    }

    public static Integer getCarIdInput(){
        Scanner in = new Scanner(System.in);
        Integer choice = 0;
        if(in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
            getCarIdInput();
        }
        return choice;
    }
}
