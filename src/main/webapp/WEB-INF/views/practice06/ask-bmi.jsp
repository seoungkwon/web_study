<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BMI</h1>
	<form action="/practice06/result-bmi" method="post">
		이름: <input type="text" name="name"> <br>
		키: <input type="number" name= "height"> <br>
		몸무게: <input type="number" name="weight"> <br>
		<button type="submit">확인</button>
	
	</form>
</body>
</html>