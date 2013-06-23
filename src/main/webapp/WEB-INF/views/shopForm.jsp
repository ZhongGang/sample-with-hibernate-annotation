<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Shop Form</title>
</head>
<body>
<h1>Shop Form</h1>

<form:form commandName="shop">
    <table>
        <tr>
            <td>名称：</td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>描述：</td>
            <td>
                <form:textarea path="description"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="保存"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>