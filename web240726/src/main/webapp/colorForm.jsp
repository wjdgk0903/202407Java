<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>색깔을 선택하시오</title>
</head>
<body>
<from action="colorResult.jsp" method="post">
이름 : <input name="name"><p/>
좋아하는 색깔 : <select name="color">
		<option value="blue">파란색</option>
		<option value="red" selected>빨간색</option>
		<option value="orang">오렌지색</option>
</select><p/>
<input type="submit" value="보내기">
</body>
</html>