package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return conn;		
	}
	public static void close(PreparedStatement stmt, Connection conn) { // insert, update, delet
		try {
			stmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
	

