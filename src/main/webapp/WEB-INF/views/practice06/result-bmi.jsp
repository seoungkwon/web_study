<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>결과</h1>
		<p>이름:${bmiDTO.name}</p>
		<p>키:${bmiDTO.height}</p>
		<p>몸무게:${bmiDTO.weight}</p>
		<p>BMI:${bmiDTO.bmi}</p>
</body>

</html>