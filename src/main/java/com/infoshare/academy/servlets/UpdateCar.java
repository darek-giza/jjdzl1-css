package com.infoshare.academy.servlets;

import com.infoshare.academy.car.Car;
import com.infoshare.academy.car.CarsRepositoryDao;
import org.hibernate.type.descriptor.java.DataHelper;

import javax.ejb.EJB;
import javax.persistence.Id;
import javax.resource.cci.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/updateCar")
public class UpdateCar extends HttpServlet {

    @EJB
    CarsRepositoryDao dao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String id = req.getParameter("id");

        if (id == null || id.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;

        }
        Car carById = dao.getCar(Integer.parseInt("id"));
        Integer carMileage=carById.getMileage();

        if (carById == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;

        }
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.print(carMileage);
    }

}
