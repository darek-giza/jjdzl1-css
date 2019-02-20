package com.infoshare.academy.reservation;

import com.infoshare.academy.menu.MessagesEnum;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    protected String id;
    @Column(name = "car_id")
    protected Integer carId;
    @Column(name = "user_id")
    protected Integer userId;
    @Column(name = "start_date")
    protected Date startDate;
    @Column(name = "end_date")
    protected Date endDate;

    public Reservation() {
    }

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
                "id='" + id + '\'' +
                ", carId=" + carId +
                ", userId=" + userId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public String description() {
        return "Samochód o id: " + carId +
                " wynajęty przez: " + userId +
                " od: " + dateFormatter.format(startDate) +
                " do: " + dateFormatter.format(endDate) + "\n ";

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
            System.out.println(MessagesEnum.CANNOT_PARSE_DATA.getMessage());
        }
        return null;
    }

    public String reservationToString() {
        StringBuilder newRow = new StringBuilder();
        newRow.append(this.id + ",");
        newRow.append(this.carId + ",");
        newRow.append(this.userId + ",");
        newRow.append(dateFormatter.format(this.startDate) + ",");
        newRow.append(dateFormatter.format(this.endDate));
        return newRow.toString();
    }

}
