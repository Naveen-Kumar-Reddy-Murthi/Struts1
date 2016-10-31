<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>
</head>
<body>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<table width="100%" cellpadding="4" cellspacing="0" border="1">
	<tr>
		<td align="center" colspan="2">
		<tiles:insert attribute="header"/>
		</td>
	</tr>
	
	<tr>
		<td width="20%">
		<tiles:insert attribute="left-content"/>
		</td>
		<td width="80%">
		<tiles:insert attribute="main-content"/>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
		<tiles:insert attribute="footer"/>
		</td>
	</tr>

</table>

</body>
</html>