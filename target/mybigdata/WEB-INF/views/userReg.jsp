<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiebi
  Date: 5/21/2017
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userReg.jsp</title>
</head>
<body>
    <form action="<c:url value="/user/doreg"/>" method="post">
        Username:<input type="text" name="name"><br>
        Password:<input type="password" name="password"><br>
        Age:<input type="text" name="age"><br>
        <input type="submit" value="sumit">
    </form>
</body>
</html>
