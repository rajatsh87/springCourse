<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
	
	</head>
	
	<body>
		the customer is confirmed: ${customer.firstName }  ${customer.lastName }
		<br>
		freePasses:${customer.freepass }
		<br>
		postal Code:${customer.postalCode }
		<br>
		course Code:${customer.courseCode }
	</body>
</html>