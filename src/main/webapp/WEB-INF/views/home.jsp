<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home</title>
</head>
<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>
    </c:if>
</div>

<div class="container">
    <form action="/drinks/byName">
        <label for="drinkName">Drink name: </label>
        <input id="drinkName" type="text" name="drinkName"/>
        <input type="submit" value="Search"/>
    </form>
    <br>
    <button onclick="location.href='/drinks/random'" type="button">
        Get a random drink
    </button>
    <br>
    <h3>Your favourite drinks: </h3><br>

    <c:forEach items="${drinks}" var="drink">

        Drink name: ${drink.name}"<br>
        <br>
        Alcoholic?: ${drink.alcoholic}<br>
        <br>
        Ingredients and measures: ${drink.ingredientsAndMeasures}<br>
        <br>
        Instructions: ${drink.instructions}<br>
        <br>
        ############
        <br>
    </c:forEach>
</div>
</body>
</html>
