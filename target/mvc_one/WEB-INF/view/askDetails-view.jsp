<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link href="<c:url value="/resources/css/style.css" /> "rel="stylesheet">
</head>
<body>
<h1>FOOTBALL </h1>
<h3>PLAYER</h3>
<br>
<br>
<br>
<br>
<form:form action="showDetails" modelAttribute="playerAttribute">
    Name: <form:input path="name" placeholder="Write player`s name"/>
        <form:errors path="name"/>
    <br>
    <br>
    Surname: <form:input  path="surname" placeholder="Write player`s surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Nationality: <form:input path="nationality" placeholder="Write player`s nationality"/>
    <form:errors path="nationality"/>
    <br>
    <br>
    CLUB: <form:input path="club" placeholder="Write player`s club"/>
    <form:errors path="club"/>
    <br>
    <br>
    Position: GK <form:radiobutton path="position" value="GK"/>
    DEF <form:radiobutton path="position" value="DEF"/>
    MID <form:radiobutton path="position" value="MID"/>
    FW <form:radiobutton path="position" value="FW"/>
    <form:errors path="position"/>
    <br>
    <br>


    Age: <form:input path="age" placeholder="Write player`s age"/>
    <form:errors path="age"/>
    <br>
    <br>
    Salary: <form:input path="salary" placeholder="Write player`s salary"/>
    <form:errors path="salary"/>
    <br>
    <br>

    <input type="submit" value="OK">
</form:form>

</body>
</html>