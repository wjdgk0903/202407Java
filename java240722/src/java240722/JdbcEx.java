package java240722;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) {
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql ="drop table dept";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속성공!");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			System.out.println("쿼리 성공!");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}

//dept 테이블을 생성하여 1건의 자료를 입력하는 자바프로그램을 만드시오