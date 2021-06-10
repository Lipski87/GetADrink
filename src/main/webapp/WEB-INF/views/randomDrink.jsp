<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Drink description</title>
</head>
<body>
<button onclick="location.href='/drinks/random'" type="button">
    Next random drink
</button>
<button onclick="location.href='/'" type="button">
    Home
</button>
<br>
<br>
<form:form method="post" modelAttribute="drink">
    Drink name: <form:input path="strDrink" readonly="true"/><br>
    <br>
    Alcoholic?:<form:input path="strAlcoholic" readonly="true"/><br>
    <br>
    Ingredients and measures:<form:input path="strIngredientsAndMeasures" readonly="true"/><br>
    <br>
    Instructions:<form:input path="strInstructions" readonly="true"/><br>
    <br>
    <input type="submit" value="Save as a favourite"/>
    <br>
</form:form>
<br>
<br>
<br>
<br>
</body>
</html>
