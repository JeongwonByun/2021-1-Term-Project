<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
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
<h3>작품 정보 목록</h3>
<div>
<%


	String url = "jdbc:mysql://localhost:3306/find_out";
	String user = "root";
	String passwd = "garden0629";
	Connection con = null;
	String sql = "select * from content";
	PreparedStatement pstmt = null;
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	con = DriverManager.getConnection(url, user, passwd);
	
	pstmt = con.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	//pstmt.executeUpdate();
	/*while(rs.next()) {
		String title = rs.getString(1);
		String dir = rs.getString(2);
		String cast1 = rs.getString(3); 
		
		out.print(title + "/" +dir+ "/" +cast1 + "<input type=\"button\" value=\"X\"<br>" + "<br>" );
	}
	
	
	rs.close();
	pstmt.close(); 
	con.close();*/
	
	
 %>
 <table border="1">
 <tr><th>Title</th><th>Dir</th><th>Genre</th><th>Year</th></tr>
 <%while(rs.next()){
	 %><tr><td><%=rs.getString("title")%></td><td><%=rs.getString("dir")%></td><td><%=rs.getString("genre")%></td><td><%=rs.getString("year")%></td>
	 
	 </tr><%}
 	
 rs.close();
		pstmt.close(); 
		con.close(); %>
 
 </table>
</div>
</div>
<footer>
<ul>
<a href="Admin.jsp">Admin Home</a>
</footer>
</body>
</html>