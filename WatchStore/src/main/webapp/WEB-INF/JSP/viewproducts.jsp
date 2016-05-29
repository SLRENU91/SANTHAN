<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product data</title>
</head>
<body>
<table>
<thead>
<tr>
<td>p_name</td>
<td>p_id</td>
<td>p_cost</td>
</tr>
</thead>

<c:forEach items="${ls}" var="data">
<tr>
<td>${data.p_name}</td>
<td>${data.p_id}</td>
<td>${data.p_cost}</td>
<td><a href="<c:url value="/upd/${ data.p_id}"/>">update</a></td>
<td><a href="<c:url value="/del/${ data.p_id}"/>">delete</a></td>

</tr></c:forEach>
</table>

</body>
</html>