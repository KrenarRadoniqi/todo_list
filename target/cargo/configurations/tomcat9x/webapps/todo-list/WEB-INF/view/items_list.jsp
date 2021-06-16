<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ictkosovo.util.Mappings" %>

<html>
<head>
    <title>To Do Items </title>
</head>
<body>
    <div align="center">
        <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
        <h2><a href="${addUrl}">Add New Item</a> </h2>

        <table border="1" cellpadding="5">
            <caption>To Do Items</caption>
            <tr>
                <th>Title</th>
                <th>Deadline</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="item" items="${toDoData.items}">
                <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                </c:url>
                <tr>
                    <th><c:out value="${item.title}"/></th>
                    <th><c:out value="${item.deadline}"/> </th>
                    <th><a href="${viewUrl}"/>View</th> </th>
                    <th><a href="${editUrl}"/>Edit</th> </th>
                    <th><a href="${deleteUrl}"/>Delete</th> </th>

                </tr>
            </c:forEach>

        </table>
    </div>
</body>
</html>
