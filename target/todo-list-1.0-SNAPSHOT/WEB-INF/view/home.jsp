<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ictkosovo.util.Mappings" %>

<html>
<head>
    <title>To Do Items </title>
</head>
<body>
    <div align="center">
        <c:url var="itemsList" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsList}">Show To Do Items</a> </h2>
    </div>
</body>
</html>
