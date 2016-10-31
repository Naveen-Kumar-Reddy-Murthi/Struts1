<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Method</title>
</head>
<body>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
</body>
<center>
		<b>Update Method</b>
		<br>
		<br>
		<html:form action="tilesAction" onsubmit="return validateDynaValidationActionFormTiles(this);">
		<html:javascript formName="DynaValidationActionFormTiles"/>
			Name:
			<html:text property="name" />
			<html:errors property="name" />
			<br>
			<br>
			password:
			<html:password property="password" />
			<html:errors property="password" />
			<br>
			<br>
			<html:hidden property="function" value="add"/>
		<html:submit property="submit"/>
		</html:form>
	</center>
</html>