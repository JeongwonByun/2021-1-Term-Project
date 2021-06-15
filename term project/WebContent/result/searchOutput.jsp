<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="searchoutputstyle.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<a href="Search.jsp">
<h1>FIND OUT</h1></a>

	
<div>
<ul>
<h2>"${content.title }" 검색 결과</h2>
	<%
		String result = (String)request.getAttribute("result");
	if(result!=null){
		out.print(result+"<p>");
	}else{
	  %>
  
		<h3>
		제목 : ${content.title }<br>
		감독 : ${content.dir }<br>
		출연자1 : ${content.cast1 }<br>
		출연자2 : ${content.cast2 }<br>
		장르 : ${content.genre }<br>
		년도 : ${content.year }<br>
		평점/시청률 : ${content.rate }<br>
		내용 : ${content.info }<br>
		스트리밍 : ${content.ott }<br></h3>
		<input type="button" value="NETFLIX" onClick="location.href='https://www.netflix.com/browse'"/>
		<input type="button" value="TVING" onClick="location.href='https://www.tving.com/main.do'"/>
		<input type="button" value="WAVVE" onClick="location.href='https://www.wavve.com/live/index.html'"/>
		<input type="button" value="WATCHA" onClick="location.href='https://watcha.com/'"/>
		<%} %>
		</ul>
</div>
<footer><%@ include file="home.jsp"%></footer>

</body>
</html>