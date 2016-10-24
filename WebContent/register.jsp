<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
	<bean:message bundle="labels" key="RegisterTitle" />
	<center>
		<html:form action="register" method="post">
			<bean:message bundle="labels" key="reg.name"/>
			<html:text property="name" title="Name" />
			<html:errors property="name.required"/>
			<br><br>
			<bean:message bundle="labels" key="reg.age"/>
			<html:text property="age" title="Age" />
			<html:errors property="age.required"/>
			<br><br>
			<bean:message bundle="labels" key="reg.gender"/>
			<html:text property="gender" title="Gender" />
			<html:errors property="gender.required"/>
			<br><br>
			<bean:message bundle="labels" key="reg.mar"/>
			<html:checkbox property="maritalStatus" value="M">
			Married
			</html:checkbox>
			<html:errors property="maritalStatus.required"/>
			<br><br>
			<bean:message bundle="labels" key="reg.qual"/>
			<html:select property="qualifications">
				<html:option value="">select</html:option>
				<html:option value="Eng">BE/BTech</html:option>
				<html:option value="PG">MCA/MS</html:option>
			</html:select>
			<html:errors property="qualifications.required"/>
			<br><br>
			<bean:message bundle="labels" key="reg.courses"/>
			<html:select property="courses" multiple="true">
				<html:option value="Java">Java</html:option>
				<html:option value="ASP.Net">ASP.Net</html:option>
				<html:option value="PLSQL">PLSQL</html:option>
				<html:option value="Python">Python</html:option>
			</html:select>
			<html:errors property="courses.required"/>
			<br><br>
			<html:submit value="Register"/>
			<br>
		</html:form>

	</center>

</body>
</html>