<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="mainstyle.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<a href="Search.jsp">
<h1> FIND OUT </h1></a>
<form action="Search.do" method="post" id="search">
	<input type="text" name="title" />
	<input type="hidden" name="job" value="search"/> 
	<button type="submit" value="검색" >Search</button><br>
	
</form>
<div>
<ul>
<a href="Login.jsp">admin</a>
</ul>

</div>

</body>
</html>