<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>


<form:form method="post" modelAttribute="user">
    Username: <form:input path="username" /><br>
    Email: <form:input path="email" /><br>
    Age: <form:input path="age" type="number"/><br>
    Password: <form:input path="password" type="password" /><br>
    Password confirmation : <form:input path="password" type="password" /><br>
    <input type="submit" value="Save">
</form:form>
