<%@ page import="com.infoshare.academy.user.UsersRepositoryDaoBean" %>
<%@ page import="com.infoshare.academy.user.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.infoshare.academy.reservation.Reservation" %>
<%@ page import="com.infoshare.academy.reservation.ReservationRepositoryDaoBeen" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<% List<User> users = new UsersRepositoryDaoBean().getUsersList(); %>
<% List<Reservation> reservationList = new ReservationRepositoryDaoBeen().getReservationList();%>
<% List<Reservation> reservationListByUserId = new ReservationRepositoryDaoBeen().getReservationByUserId(2);%>
<% List<Reservation> reservationListByCarId = new ReservationRepositoryDaoBeen().getReservationByCarId(201);%>
<body>
<h2>Hello World!</h2>
<%
    for (User user : users) {
        out.println(user.toString());
    }
%>

<h1>Reservation List</h1>

<% for (Reservation reservation : reservationList) {
    out.println(reservation.description() + "<br/>");
}%>

<h1>Reservation list by user id</h1>
<% for (Reservation reservation : reservationListByUserId) {
    out.println(reservation.description() + "<br/>");
}%>

<h1>Reservation list by car id</h1>
<% for (Reservation reservation : reservationListByCarId) {
    out.println(reservation.description() + "<br/>");
}%>
</body>
</html>
