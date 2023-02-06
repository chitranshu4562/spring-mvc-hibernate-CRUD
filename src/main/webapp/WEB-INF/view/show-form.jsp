<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/3/23
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Save Customer</title>
</head>
<body>
    <h2>Add Your Details</h2>
    <form:form action="saveCustomer" modelAttribute="customer" method="post">

<%--        need to associate customer with id--%>
        <form:hidden path="id"/>
        <table>
            <tbody>
            <tr>
                <td><label>First name: </label></td>
                <td><form:input path="firstName"/></td>
            </tr>
            <tr>
                <td><label>Last name: </label></td>
                <td><form:input path="lastName"/></td>
            </tr>
            <tr>
                <td><label>Email: </label></td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save"></td>
            </tr>
            </tbody>
        </table>
    </form:form>
    <a href="${pageContext.request.contextPath}/customer/list">Back to Customer List</a>
</body>
</html>
