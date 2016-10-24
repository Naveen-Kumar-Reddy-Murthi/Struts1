<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DynaLogin Page</title>
</head>
<body>

<center>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
		<bean:message key="AppName" bundle="labels" />
		<br>
		<br>
		<html:form action="dynaLogin" onsubmit="return validateDynaLoginForm(this);">
		<html:javascript formName="DynaLoginForm"/>
			id:
			<html:text property="id" />
			<html:errors property="id" />
			<br>
			<br>
			password:
			<html:password property="password" />
			<html:errors property="password" />
			<br>
			<br>
			<html:submit property="login" value="Login" />
		</html:form>
	</center>
</body>
</html>