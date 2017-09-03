<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiebi
  Date: 5/21/2017
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserInfo</title>
</head>
<body>
    <a href="<c:url value="/user/findall"/> ">user list</a><br>
    <table border="1">
        <tr>
            <td>ID</td><td><c:out value="${user.id}"/> </td>
        </tr>
        <tr>
            <td>NAME</td><td><c:out value="${user.name}"/> </td>
        </tr>
        <tr>
            <td>AGE</td><td><c:out value="${user.age}"/> </td>
        </tr>
        <tr>
            <td>PASSWORD</td><td><c:out value="${user.password}"/> </td>
        </tr>
    </table>
</body>
</html>
