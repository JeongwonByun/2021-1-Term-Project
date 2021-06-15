package find.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import find.vo.ContentVO;

public class FindDAO {
	private static FindDAO dao = new FindDAO();
	private FindDAO() {}
	public static FindDAO getInstance() {
		return dao;
	}
	public Connection connect()
	{
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/find_out","root","garden0629");
		} catch (Exception e) {
			System.out.println("MDAO:connect" + e);
		}
		return conn;
		
	}
	public void close(Connection conn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println("Pstmt close error" + e);
			}
		}
		if (conn != null)
		{
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println("Conn close error" +e);
			}
		}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			} catch (Exception e) {
				System.out.println("rs close error" + e);
			}
		}
		close(conn,pstmt);
	}
	public ContentVO Search(String title) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ContentVO content = null;
		
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from content where title=?");
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				content = new ContentVO();
				
				content.setTitle(rs.getString(1));
				content.setDir(rs.getString(2));
				content.setCast1(rs.getString(3));
				content.setCast2(rs.getString(4));
				content.setGenre(rs.getString(5));
				content.setYear(rs.getString(6));
				content.setRate(rs.getString(7));
				content.setInfo(rs.getString(8));
				content.setOtt(rs.getString(9));
				
			}
	
		} catch(Exception e) {
			System.out.println("search error" + e);
		} finally
		{
			close(conn,pstmt,rs);
		}
		return content;
		
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from admin where id = ? and pwd = ?;");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = true;
			}
			else
				result = false;
		} catch(Exception e) {
			System.out.println("login error" + e);
		} finally
		{
			close(conn,pstmt,rs);
		}
		return result;
	}
	public void Insert(ContentVO content) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connect();
			pstmt = conn.prepareStatement("insert into content values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, content.getTitle());
			pstmt.setString(2, content.getDir());
			pstmt.setString(3, content.getCast1());
			pstmt.setString(4, content.getCast2());
			pstmt.setString(5, content.getGenre());
			pstmt.setString(6, content.getYear());
			pstmt.setString(7, content.getRate());
			pstmt.setString(8, content.getInfo());
			pstmt.setString(9, content.getOtt());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("insert error" +e);
		} finally {
			close(conn,pstmt);
		}
		
	}
	public void Update(ContentVO content) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connect();
			pstmt = conn.prepareStatement("update content set dir=?, cast1=?, cast2=?, genre=?, year=?, rate=?, info=?, ott=? where title=?");
			
			pstmt.setString(1, content.getDir());
			pstmt.setString(2, content.getCast1());
			pstmt.setString(3, content.getCast2());
			pstmt.setString(4, content.getGenre());
			pstmt.setString(5, content.getYear());
			pstmt.setString(6, content.getRate());
			pstmt.setString(7, content.getInfo());
			pstmt.setString(8, content.getOtt());
			pstmt.setString(9, content.getTitle());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("update error" +e);
		} finally {
			close(conn,pstmt);
		}
		
	}
	public void Delete(String title) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = connect();
			pstmt = conn.prepareStatement("delete from content where title=?");
			
			pstmt.setString(1, title);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("delete error" +e);
		} finally {
			close(conn,pstmt);
		}
	}
	
		
	}
	

