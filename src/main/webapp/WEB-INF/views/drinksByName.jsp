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
    <form:form action="/drinks/byName" method="post" modelAttribute="drinks">
        Drink name: <input type="text" name="name" value="${drink.strDrink}" readonly/><br>
        <br>
        Alcoholic?: <input type="text" name="alcoholic" value="${drink.strAlcoholic}" readonly/><br>
        <br>
        Ingredients and measures: <input type="text" name="ingredientsAndMeasures"
                                         value="${drink.strIngredientsAndMeasures}" readonly/><br>
        <br>
        Instructions: <input type="text" name="instructions" value="${drink.strInstructions}" readonly/><br>
        <br>
        <input type="submit" value="Save as a favourite"/>
        <br>
    </form:form>
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
