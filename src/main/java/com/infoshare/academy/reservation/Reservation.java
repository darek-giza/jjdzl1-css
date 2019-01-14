package com.infoshare.academy.reservation;

import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

public class Reservation extends DateModel {


    protected String id;
    protected Integer carId;
    protected Integer userId;
    protected Date startDate;
    protected Date endDate;

    public Reservation(Integer carId, Integer userId, Date startDate, Date endDate) {
        this.id = generateId();
        this.carId = carId;
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Reservation(String id, Integer carId, Integer userId, Date startDate, Date endDate) {
        this.id = id;
        this.carId = carId;
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", carId=" + carId +
                ", userId=" + userId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public static Reservation stringToReservation(String csvRow) {
        String[] data = csvRow.split(",");
        try {
            return new Reservation(
                    data[0],
                    Integer.parseInt(data[1]),
                    Integer.parseInt(data[2]),
                    dateFormatter.parse(data[3]),
                    dateFormatter.parse(data[4])
            );
        } catch (ParseException e) {
            System.out.println("Cannot Parse Data");
        }
        return null;
    }
    public String reservationToString(){
        StringBuilder newRow = new StringBuilder();
        newRow.append(this.id+ ",");
        newRow.append(this.carId+",");
        newRow.append(this.userId+",");
        newRow.append(dateFormatter.format(this.startDate)+",");
        newRow.append(dateFormatter.format(this.endDate));
        return newRow.toString();
    }
}
