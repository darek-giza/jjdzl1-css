package com.infoshare.academy.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infoshare.academy.user.User;
import com.infoshare.academy.user.UsersRepositoryDao;
import com.infoshare.academy.user.UsersRepositoryDaoBean;

import java.io.IOException;
import java.util.List;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        User user = new User(login, password, email);

        UsersRepositoryDao dao = new UsersRepositoryDaoBean();

                dao.addUser(user);

    }
}
