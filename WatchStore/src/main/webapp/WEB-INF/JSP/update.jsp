<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product details</title>
</head>
<body>
<form:form action ="/WatchStore/update" method="post">
<table>
<tr>
<td> p_name</td>
<td><form:input path="p_name" /></td>
</tr>
<tr>
<td>p_id</td>
<td><form:input path="p_id"/></td>
</tr>
<tr>
<td>p_cost</td>
<td><form:input path="p_cost"/></td>
</tr>
<tr>
<td>image</td>
<td><form:input path="image"/></td>
</tr>

<tr>
<td></td>
<td><form:input path="url"/></td>
</tr>


<tr>
<td><input type="submit" value="update"/></td>
<td><input type="reset"  value="clear"/></td>
</tr>
</table>

</form:form>

</tr>

</table>


</body>
</html>