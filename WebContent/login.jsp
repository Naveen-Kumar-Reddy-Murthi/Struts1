<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<center>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
		<bean:message key="AppName" bundle="labels" />
		<br>
		<br>
		<html:form action="login">
			<bean:message key="userName" bundle="labels" />
			<html:text property="userName" />
			<html:errors property="userName.err" />
			<br>
			<br>
			<bean:message key="password" bundle="labels" />
			<html:password property="password" />
			<html:errors property="password.err" />
			<br>
			<br>
			<html:submit property="login" value="Login" /><br><br>
			<a href="dynaLoginForm">DeclarativeDynamicFormBean</a><br><br>
			<a href="signUpForm">Sign Up</a><br><br>
			<a href="homeTile">Show Tiles Page</a>
			
		</html:form>
	</center>

	<!-- <center>
<form action="register.do" method="post">
User Name:<input type="text" name="userName"><br>
Password :<input type="password" name="password"><br>
<input type="submit" value="submit">
</form>
</center> -->
</body>
</html>