<%@ page import="com.infoshare.academy.user.UsersRepositoryDaoBean" %>
<%@ page import="com.infoshare.academy.user.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.infoshare.academy.reservation.Reservation" %>
<%@ page import="com.infoshare.academy.reservation.ReservationRepositoryDaoBeen" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<%UsersRepositoryDaoBean usersRepo = new UsersRepositoryDaoBean();
ReservationRepositoryDaoBeen reservationRepo = new ReservationRepositoryDaoBeen();
List<User> usersList = usersRepo.getUsersList();
User user1 = usersRepo.getUserById(4);
List<Reservation> reservationList = reservationRepo.getReservationList();
List<Reservation> reservationListByUserId = reservationRepo.getReservationByUserId(2);
List<Reservation> reservationListByCarId = reservationRepo.getReservationByCarId(201);%>
<body>

<title color="gray" size="7">----CSS-----</title>

<a href="addcar.html"><input type="button" value="Add car"></a>

<a href="login.jsp"><input type="button" value="Zaloguj się"></a>


</form>
<h2>User id=4</h2>
<%out.print(user1);%>

<h1>User list</h1>

<%
    for (User user : usersList) {
        out.println(user.toString() + "<br>");
    }
%>


<h1>Reservation List</h1>
<% for (Reservation reservation : reservationList) {
    out.println(reservation.toString() + "<br>");
}
%>

<% for (Reservation reservation : reservationList) {
    System.out.println(reservation.toString() + "<br/>");
}%>

<h1>Reservation list by user id</h1>
<% for (Reservation reservation : reservationListByUserId) {
    out.println(reservation.toString() + "<br/>");
}%>

<h1>Reservation list by car id</h1>
<% for (Reservation reservation : reservationListByCarId) {
    out.println(reservation.toString() + "<br/>");
}%>
</body>
</html>
