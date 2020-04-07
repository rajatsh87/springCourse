<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title>
			Customer Registration Form
		</title>
		<style type="text/css">
			.error{color:red}
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First name:<form:input path="firstName"/>
			<br><br>
			Last name:<form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>	
			<br><br>
			
			<button type="submit">Submit</button>
		</form:form>
	</body>
</html>