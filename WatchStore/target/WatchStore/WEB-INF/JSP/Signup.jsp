<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iam signup</title>
</head>
<body>
<form:form action="./addPojo" method="post">
<table>
<tr>
<td><form:label path="p_name"></form:label></td>
<td><form:input path="p_name"/></td></tr>
<tr>
<td><form:label path="p_id"></form:label></td>
<td><form:input path="p_id"/></td></tr>
<tr>
<td><form:label path="p_cost"></form:label></td>
<td><form:input path="p_cost"/></td></tr>
<tr>
<td><form:label path="Url"></form:label></td>
<td><form:input path="Url"/></td></tr>
<tr>
<td><form:label path="image"></form:label></td>
<td><form:input path="image"/></td></tr>

<tr>
<td><input type="submit" value="signup"/></td>
</table>

</form:form>
</body>
</html>