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
import java.util.List;

import static java.lang.System.out;

@WebServlet("/updateCar")
public class UpdateCar extends HttpServlet {

    @EJB
    CarsRepositoryDao dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        PrintWriter writer =resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        if (id == null || id.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        Car car = dao.getCar(Integer.valueOf(id));

        if (car == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        req.setAttribute("id", car.getId());
        req.setAttribute("mileage", car.getMileage());
        req.getRequestDispatcher("/updateCar.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String id=req.getParameter("id");
       String mileage =req.getParameter("mileage");

        dao.updateCarMileage(new Integer(id).intValue(),new Integer(mileage).intValue());

        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}

