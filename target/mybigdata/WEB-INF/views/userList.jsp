<%--
  Created by IntelliJ IDEA.
  User: xiebi
  Date: 5/20/2017
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>userList</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>ID</td><td>NAME</td><td>AGE</td><td>delete</td><td>lookup</td>
        </tr>
        <c:forEach items="${userList}" var="u">
            <tr>
                <td><c:out value="${u.id}"/> </td>
                <td><c:out value="${u.name}"/> </td>
                <td><c:out value="${u.age}"/> </td>
                <td><a href="/user/deleteone?id=<c:out value="${u.id}"/>">delete</a> </td>
                <td><a href="/user/viewone?id=<c:out value="${u.id}"/>">lookup</a> </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
