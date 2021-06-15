<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="loginstyle.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Search.jsp">
<h1>FIND OUT</h1></a>
<h2>administer</h2>
<h3>새로운 작품 정보 입력</h3>
<div>
<form action="Insert.do" method="post" id="insert">
	제목 : <input type="text" name="title"><br>
	감독 : <input type="text" name="dir"><br>
	출연자1 : <input type="text" name="cast1"><br>
	출연자2 : <input type="text" name="cast2"><br>
	장르 : <input type="text" name="genre"><br>
	년도 : <input type="text" name="year"><br>
	평점 : <input type="text" name="rate"><br>
	정보 : <input type="text" name="info"><br>
	ott : <input type="text" name="ott"><br>
	<button type="submit" value="입력">입력</button>

</form>
</div>
</body>
</html>