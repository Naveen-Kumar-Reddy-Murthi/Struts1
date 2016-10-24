<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Method</title>
</head>
<body>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
</body>
<center>
		<b>Add Method</b>
		<br>
		<br>
		<html:form action="customAction" onsubmit="return validateDynaFormBean(this);">
		<html:javascript formName="DynaFormBean"/>
			id:
			<html:text property="id" />
			<html:errors property="id" />
			<br>
			<br>
			password:
			<html:password property="value" />
			<html:errors property="value" />
			<br>
			<br>
			<html:hidden property="function" value="add"/>
		<html:submit property="submit"/>
		</html:form>
	</center>
</html>