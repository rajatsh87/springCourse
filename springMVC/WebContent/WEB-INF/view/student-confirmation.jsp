<html>
<body>
	<h2>Student is confired:${student.firstName } ${student.lastName } ${student.country }</h2>
	<h4>favorite language:${student.favoritieLanguage }</h4>
	Operating Systems:

<ul>
	<c:forEach var="temp" items="${student.OS}">

		<li> ${temp} </li>

	</c:forEach>
</ul>
</body>
</html>