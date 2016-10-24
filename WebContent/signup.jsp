<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<bean:message key="signUp.title" bundle="labels" /> 

	<html:form action="signUp" onsubmit="return validateSignUpForm(this);">
		<html:javascript formName="SignUpForm"/>
		<bean:message key="signUp.name" bundle="labels" />
		<html:text property="name" />
		<html:errors property="name" />
		<br>
		<br>
		<bean:message key="signUp.password" bundle="labels" />
		<html:text property="password" />
		<html:errors property="password" />
		<br>
		<br>
		<bean:message key="signUp.email" bundle="labels" />
		<html:text property="email" />
		<html:errors property="email" />
		<br>
		<br>
		<bean:message key="signUp.mobile" bundle="labels" />
		<html:text property="mobile" />
		<html:errors property="mobile" />
		<br>
		<br>
		<bean:message key="signUp.dob" bundle="labels" />
		<html:text property="dateOfBirth" />
		<html:errors property="dateOfBirth" />
		<br>
		<br>
		<html:submit value="Login" />
	</html:form>
</body>
</html>