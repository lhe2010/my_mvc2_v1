// 2021-01-18 
// 23:17-11:30 	// 싱글턴패턴!! static 과 생성 위치 주의
				// getConnection() 방법
package _01_login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import _01_login.dto.MemberDTO;

public class MemberDAO {
	
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/pool");
		conn = ds.getConnection();
		
		return conn;
	}
	
	public boolean joinMember(MemberDTO mdto) {
		boolean isJoin = false;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID=?");
			pstmt.setString(1, mdto.getId());
			rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				pstmt = conn.prepareStatement("INSERT INTO MEMBER (ID,PW,NAME,TEL,EMAIL) VALUES(?,?,?,?,?)");
				pstmt.setString(1, mdto.getId());
				pstmt.setString(2, mdto.getPw());
				pstmt.setString(3, mdto.getName());
				pstmt.setString(4, mdto.getTel());
				pstmt.setString(5, mdto.getEmail());
				pstmt.executeUpdate();
				isJoin = true;
				System.out.println("insert완료: " + mdto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		
		return isJoin;
	}
	
	public boolean login(String id, String pw) {
		boolean isLogin = false;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID=? AND PW=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()) 
				isLogin = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		
		return isLogin;
	}
	
}











