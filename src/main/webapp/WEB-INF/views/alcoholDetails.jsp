<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Drink description</title>
</head>
<body>
<button onclick="location.href='/'" type="button">
    Home
</button>
<br>
<br>
<h3><%= request.getParameter("alcohol")%>
</h3>
<br>
<br>
${alcohol}<br>
<br>
</body>
</html>