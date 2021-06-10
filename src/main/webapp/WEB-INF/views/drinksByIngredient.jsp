<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Drink description</title>
</head>
<body>
<button onclick="location.href='/'" type="button">
    Home</button>
<br>
<br>
<c:forEach items="${drinks}" var="drink">
    <form action="/drinks/byName">
        Drink name: <input id="drinkName" name="drinkName" value="${drink.strDrink}" readonly/>
        <input type="submit" value="Search"/>
    </form>
    ############
    <br>
    <br>
</c:forEach>
<br>
<br>
<button onclick="location.href='/'" type="button">
    Home</button>
</body>
</html>
