<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.ictkosovo.util.AttributeNames" %>
<html>
<head>
    <title>Add Items </title>
</head>
<body>
    <div align="center">
        <form:form method="post" modelAttribute="${AttributeNames.TODO_ITEM}">
            <table>
                <tr>
                    <td>ID</td>
                    <td>
                        <form:input path="id" disabled="true" />
                    </td>
                </tr>
                <tr>
                    <td>Title</td>
                    <td>
                        <form:input path="title"  />
                    </td>
                </tr>
                <tr>
                    <td>Details</td>
                    <td>
                        <form:input path="details" />
                    </td>
                </tr>
                <tr>
                    <td>Deadline</td>
                    <td>
                        <form:input path="deadline" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Submit" />
                    </td>
                </tr>

            </table>
        </form:form>

    </div>
</body>
</html>
