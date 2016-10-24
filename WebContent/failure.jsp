<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Failure</title>
</head>
<body>
<center><b>Login Failure</b></center>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
requestAttribute:
<logic:notEmpty name="requestAttribute" scope="request">
	<bean:write name="requestAttribute" scope="request"/>
</logic:notEmpty><br>
sessionAttribute:
<logic:notEmpty name="sessionAttribute" scope="session">
	<bean:write name="sessionAttribute" scope="session"/>
</logic:notEmpty>
</body>
</html>