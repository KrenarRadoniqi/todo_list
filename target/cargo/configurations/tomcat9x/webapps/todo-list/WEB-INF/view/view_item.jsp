<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ictkosovo.util.Mappings" %>
<html>
<head>
    <title>View Item </title>
</head>
<body>
<div align="center">
<form:form method="post" modelAttribute="${AttributeNames.TODO_ITEM}">
    <table>
    <tr>
    <td>ID</td>
    <td>
    <c:out value="${toDoItem.id}"/>
    </td>
    </tr>
    <tr>
    <td>Title</td>
    <td>
    <c:out value="${toDoItem.title}"/>
    </td>
    </tr>
    <tr>
    <td>Details</td>
    <td>
    <c:out value="${toDoItem.deadline}"/>
    </td>
    </tr>
    <tr>
    <td>Deadline</td>
    <td>
    <c:out value="${toDoItem.details}"/>
    </td>
    </tr>

    </table>
    <c:url var="itemsList" value="${Mappings.ITEMS}"/>
    <h2><a href="${itemsList}">Show To Do Items</a> </h2>
    </div>
    </body>
    </html>
