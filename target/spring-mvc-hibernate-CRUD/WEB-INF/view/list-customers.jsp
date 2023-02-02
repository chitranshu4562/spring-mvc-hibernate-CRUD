<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2/1/23
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>List customer</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/list-customer.css">
</head>
<body>
    <p>Application path: ${pageContext.request.contextPath}</p>
    <h4>List of customers is comming soon...</h4>
    <div>
        <div>
            <h1>CRM - Customer Relationship manager</h1>
        </div>
        <table>
            <tr>
                <th>First name</th>
                <th>Last name</th>
                <th>Email</th>
            </tr>
<%--            loop through all the customers--%>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
