<%@ page import="com.infoshare.academy.user.UsersRepositoryDaoBean" %>
<%@ page import="com.infoshare.academy.user.User" %>
<%@ page import="java.util.List" %>
<html>
<% List<User> users = new UsersRepositoryDaoBean().getUsersList(); %>
<body>
<h2>Hello World!</h2>

<% for (User user : users) {
    out.println(user.toString());
} %>
</body>
</html>
