<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Drink description</title>
</head>
<body>
<c:forEach items="${drinks}" var="drink">
    Drink name: ${drink.strDrink}<br>
    <br>
    Alcoholic?: ${drink.strAlcoholic}<br>
    <br>
    Ingredients and measures: ${drink.strIngredientsAndMeasures}<br>
    <br>
    Instructions: ${drink.strInstructions}<br>
    <br>
    ############
    <br>
</c:forEach>
<button onclick="location.href='/drinks/random'" type="button">
    Wylosuj jeszcze raz</button>
<button onclick="location.href='/'" type="button">
    Strona główna</button>

</body>
</html>
