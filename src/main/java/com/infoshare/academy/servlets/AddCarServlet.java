package com.infoshare.academy.servlets;

import javax.ejb.EJB;
import javax.persistence.criteria.CriteriaBuilder;
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
        String enginePower = req.getParameter("enginePower");
        String fuelSource = req.getParameter("fuelSource");
        String transmission = req.getParameter("transmission");
        String bodyType = req.getParameter("bodyType");
        String color = req.getParameter("color");
        String seats = req.getParameter("seats");



        Car car = new Car(Integer.parseInt(carType),make,model,Integer.parseInt(year),Integer.parseInt(mileage),
                Integer.parseInt(enginePower),FuelSourceEnum.valueOf(fuelSource),
                TransmissionEnum.valueOf(transmission),BodyTypeEnum.valueOf(bodyType),ColorEnum.valueOf(color),
                Integer.parseInt(seats));

        dao.addCar(car);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
