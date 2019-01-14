package com.infoshare.academy.menu;

import java.util.Scanner;

public class Menu {

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

}