package java240722;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx3 {
	public static void main(String[] args) {
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql ="insert into dept(deptno, dname, loc) values (1001, '총무부', '인천'), (1002, '인사부', '일산'),(1003, '회계부', '서울')";
		
		
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