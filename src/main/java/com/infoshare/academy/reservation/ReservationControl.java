package com.infoshare.academy.reservation;

import com.infoshare.academy.iostream.*;
import com.infoshare.academy.menu.CarTypeMenu;
import com.infoshare.academy.menu.MainMenu;
import com.infoshare.academy.menu.MessagesEnum;
import com.infoshare.academy.model.cars.CarOffRoad;
import com.infoshare.academy.model.cars.CarPassenger;
import com.infoshare.academy.model.cars.CarTruck;
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

    public static void getUserDateInput() {
        Date startDate = getDate(MessagesEnum.ENTER_START_DATE_OF_RESERVATION.getMessage());
        Date endDate = getDate(MessagesEnum.ENTER_END_DATE_OF_RESERVATION.getMessage());
        if (startDate.compareTo(endDate) > 0) {
            System.out.println(MessagesEnum.END_DATE_CANNOT_BE_LESS_THAN_END_DATE.getMessage());
            getUserDateInput();
            return;
        }
        CarTypeMenu.showChooseCarTypeMenuMessages();
        Integer choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1:
                System.out.println(MessagesEnum.LIST_AVAILABLE_CARS_IN_TIME_RANGE.getMessage());
                for (CarPassenger carPassenger : CarMaker.createCarPassengerList()) {
                    if (checkIfCarAvailable(carPassenger.getId(), startDate, endDate)) {
                        System.out.println(carPassenger);
                        idList.add(carPassenger.getId());
                    }
                }
                break;
            case 2:
                System.out.println(MessagesEnum.LIST_AVAILABLE_CARS_IN_TIME_RANGE.getMessage());
                for (CarOffRoad carOffRoad : CarMaker.createCarOffRoadList()) {
                    if (checkIfCarAvailable(carOffRoad.getId(), startDate, endDate)) {
                        System.out.println(carOffRoad);
                        idList.add(carOffRoad.getId());
                    }
                }
                break;
            case 3:
                System.out.println(MessagesEnum.LIST_AVAILABLE_CARS_IN_TIME_RANGE.getMessage());
                for (CarTruck carTruck : CarMaker.createCarTruckList()) {
                    if (checkIfCarAvailable(carTruck.getId(), startDate, endDate)) {
                        System.out.println(carTruck);
                        idList.add(carTruck.getId());
                    }
                }
                break;
            case 4:
                MainMenu.showMainMenu();
                break;
            default:
                System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
                getUserDateInput();
                return;
        }

        Integer carId = getId(MessagesEnum.CHOOSE_ID_CAR.getMessage());
        // user na sztywno bo nie ma logowania
        Reservation reservation = addReservation(carId, 1, startDate, endDate);
        System.out.println(MessagesEnum.RESERVATION_WAS_MADE.getMessage() + reservation);
    }

    public static Date getDate(String message) {
        System.out.println(message);
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
        System.out.println(message);
        Integer id = Integer.parseInt(in.nextLine());
        if (idList.contains(id)) {
            return id;
        }
        System.out.println(MessagesEnum.BAD_CHOICE.getMessage());
        return getId(message);
    }
}
