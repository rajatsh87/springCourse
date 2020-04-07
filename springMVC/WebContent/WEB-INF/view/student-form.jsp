<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First name:<form:input path="firstName"/>
			<br><br>
			Last name:<form:input path="lastName"/>
			<br><br>
			<form:select path="country">
				<form:options items="${student.countryOptions }" />
				
			</form:select>
			<br><br>
			known languages
			Java <form:radiobutton path="favoritieLanguage" value="Java"/>
			Java Script<form:radiobutton path="favoritieLanguage" value="Java Script"/>
			Python<form:radiobutton path="favoritieLanguage" value="Python"/>
			C<form:radiobutton path="favoritieLanguage" value="C"/>
			<br><br>

			Windows<form:checkbox path="OS" value="windows"/>
			linix<form:checkbox path="OS" value="linix"/>
			MAC<form:checkbox path="OS" value="mac"/>
			<br><br>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>