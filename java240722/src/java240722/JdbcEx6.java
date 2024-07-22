package java240722;

import java.net.MulticastSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
//		String sql ="SELECT * FROM dept where loc = '서울'";
		
		System.out.println("지역 이름");
		String str = scanner.nextLine();
		String sql = String.format("SELECT * FROM dept where loc = '%s'", str);
		System.out.println(sql);
		System.out.println("이 지역은 없습니다");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속성공!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%d %s %s\n", deptno, dname, loc);
			} 
		
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}

