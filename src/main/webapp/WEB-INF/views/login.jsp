<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiebi
  Date: 5/21/2017
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <c:if test="${error != null}">
        <c:out value="${error}"/><br>
    </c:if>
    <form action="/user/dologin" method="post">
        username:<input type="text" name="name"><br>
        password:<input type="text" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>
</html>
