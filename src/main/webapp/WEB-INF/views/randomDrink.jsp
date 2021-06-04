<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Drink description</title>
</head>
<body>
<button onclick="location.href='/drinks/random'" type="button">
    Next random drink</button>
<button onclick="location.href='/'" type="button">
    Home</button>
<br>
<br>
<c:forEach items="${drinks}" var="drink">
    <form action="/drinks/add" method="POST">
        Drink name: ${drink.strDrink}<br>
        <br>
        Alcoholic?: ${drink.strAlcoholic}<br>
        <br>
        Ingredients and measures: ${drink.strIngredientsAndMeasures}<br>
        <br>
        Instructions: ${drink.strInstructions}<br>
        <br>
        <input type="submit" value="Save as a favorite"/>
        <br>
    </form>
    <br>
</c:forEach>
    <br>
<br>
<br>
</body>
</html>
