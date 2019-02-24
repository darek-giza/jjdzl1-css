package com.infoshare.academy.servlets;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infoshare.academy.car.Car;
import com.infoshare.academy.car.CarRepositoryDaoBeen;
import com.infoshare.academy.car.CarsRepositoryDao;
import com.infoshare.academy.menuEnum.BodyTypeEnum;
import com.infoshare.academy.menuEnum.ColorEnum;
import com.infoshare.academy.menuEnum.FuelSourceEnum;
import com.infoshare.academy.menuEnum.TransmissionEnum;
import com.infoshare.academy.user.User;
import com.infoshare.academy.user.UsersRepositoryDao;
import com.infoshare.academy.user.UsersRepositoryDaoBean;

import java.io.IOException;
import java.util.List;

@WebServlet("/addCar")
class AddCarServlet extends HttpServlet {

    @EJB
    CarsRepositoryDao dao;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String carType = req.getParameter("carType");
        String make = req.getParameter("make");
        String model = req.getParameter("model");
        String year = req.getParameter("year");
        String mileage = req.getParameter("mileage");
        String fuelSource = req.getParameter("fuelSource");
        String enginePower = req.getParameter("enginePower");
        String color = req.getParameter("color");
        String bodyType = req.getParameter("bodyType");
        String seats = req.getParameter("seats");
        String transmission = req.getParameter("transmission");


        Car car = new Car(Integer.parseInt(carType),make,model,Integer.parseInt(year),
                Integer.parseInt(mileage),FuelSourceEnum.valueOf(fuelSource),Integer.parseInt(enginePower),
                ColorEnum.getColorEnum(color),BodyTypeEnum.valueOf(bodyType),Integer.parseInt(seats),
                TransmissionEnum.getTransmissionEnum(transmission));


        dao.addCar(car);

    }
}
