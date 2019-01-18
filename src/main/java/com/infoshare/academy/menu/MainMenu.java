package com.infoshare.academy.menu;

import com.infoshare.academy.AboutAuthors;
import com.infoshare.academy.reservation.ReservationControl;
import com.infoshare.academy.user.UserService;

import java.util.Scanner;

public class MainMenu {

    public static void appStart() {
        System.out.println(MessagesEnum.APP_START.getMessage());
        System.out.println(MessagesEnum.WELCOME.getMessage());
        UserService.logIn();
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
            System.out.println("4\t O Autorach");
            System.out.println("5\t Wyjście");
            System.out.print("Wybór: ");

            //Get user's input choice
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(MessagesEnum.LIST_OF_CARS.getMessage());
                    CarTypeMenu.chooseCarType();
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
                    AboutAuthors.printAuthors();
                    break;
                case "5":
                    quit = true;
                    System.out.println(MessagesEnum.END.getMessage());
                    break;
                default:
                    System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
            }
        }
    }
}