<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="find.vo.ContentVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="loginstyle.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<a href="Search.jsp">
<h1>FIND OUT</h1></a>
<h2>administer</h2>
<h3>기존 작품 정보 삭제</h3>
<div>
<form action="Search.do" method="post" id="delete">
TITLE : <input type="text" name="title"/>
<input type="hidden" name="job" value="delete"/>
<button type="submit" value="검색">검색</button>
</form>

<div id="delete">
<%ContentVO content = (ContentVO)request.getAttribute("content");
if(content != null) {%>

	제목 : <input type="text" name="title" readonly value="${content.title }"><br>
	감독 : <input type="text" name="dir" readonly value="${content.dir }"><br>
	출연자1 : <input type="text" name="cast1" readonly value="${content.cast1 }"><br>
	출연자2 : <input type="text" name="cast2" readonly value="${content.cast2 }"><br>
	장르 : <input type="text" name="genre" readonly value="${content.genre }"><br>
	년도 : <input type="text" name="year" readonly value="${content.year }"><br>
	평점 : <input type="text" name="rate" readonly value="${content.rate }"><br>
	정보 : <input type="text" name="info" readonly value="${content.info }"><br>
	ott : <input type="text" name="ott" readonly value="${content.ott }"><br>
	<form action="Delete.do" method="post">
	<input type="hidden" name="title" value="${content.title }"/>
	<button type="submit" value="delete">삭제</button>
	</form>
	
	<%}else{ %>${result }
	<%} %>
	</div>
	</div>
	

</body>
</html>