package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;
import com.infoshare.academy.menu.CarTypeMenu;
import com.infoshare.academy.menu.MainMenu;
import com.infoshare.academy.menu.MessagesEnum;
import com.infoshare.academy.model.cars.entity.Car;
import com.infoshare.academy.model.carsservice.CarDescription;
import com.infoshare.academy.model.carsservice.CarMaker;

import java.text.ParseException;
import java.util.*;

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
            Reservation reservation = Reservation.stringToReservation(row);
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

    public static void createReservation(Integer userId) {
        Date startDate = getDate(MessagesEnum.ENTER_START_DATE_OF_RESERVATION.getMessage());
        Date endDate = getDate(MessagesEnum.ENTER_END_DATE_OF_RESERVATION.getMessage());
        if (startDate.compareTo(endDate) > 0) {
            System.out.println(MessagesEnum.END_DATE_CANNOT_BE_LESS_THAN_END_DATE.getMessage());
            createReservation(userId);
            return;
        }
        CarTypeMenu.showChooseCarTypeMenuMessages();
        Integer choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1:
                System.out.println(MessagesEnum.LIST_AVAILABLE_CARS_IN_TIME_RANGE.getMessage());
                for (Car carPassenger : CarMaker.createCarList()) {
                    if (checkIfCarAvailable(carPassenger.getId(), startDate, endDate)) {
                        System.out.println(CarDescription.carDescription(carPassenger));
                        idList.add(carPassenger.getId());
                    }
                }
                break;
            case 2:
                MainMenu.showMainMenu();
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
                createReservation(userId);
                return;
        }

        Integer carId = getId(MessagesEnum.CHOOSE_ID_CAR.getMessage());
        Reservation reservation = addReservation(carId, userId, startDate, endDate);
        System.out.println(MessagesEnum.RESERVATION_WAS_MADE.getMessage() + reservation.description());
    }

    public static Date getDate(String message) {
        System.out.print(message);
        Date date = new Date();
        try {
            date = Reservation.dateFormatter.parse(in.nextLine());
        } catch (ParseException e) {
            System.out.println(MessagesEnum.INCORRECT_DATE_TRY_AGAIN.getMessage());
            getDate(message);
        }
        return date;
    }

    public static Integer getId(String message) {
        System.out.print(message);
        Integer id = Integer.parseInt(in.nextLine());
        if (idList.contains(id)) {
            return id;
        }
        System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        return getId(message);
    }
}
