package java240722;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {
	public static void main(String[] args) {
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql ="select count(*) from dept";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속성공!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			System.out.println("dept 테이블에는 총" + rs.getInt(1)+"몇 개 인가요");
		
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}

//dept 테이블의 건수를 출력하는 자바 프로그램을 만드세요