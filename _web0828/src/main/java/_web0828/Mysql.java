package _web0828;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql {
	   private Connection getConnection() throws Exception {

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");

	        return conn;
	    }


}
