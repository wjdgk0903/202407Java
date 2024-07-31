package java240731;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Ex2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties(); // Hashmap 하위 클래스
		String path = Ex2.class.getResource("database.properties").getPath(); // p.506
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		String dirver = properties.getProperty("dirver");
		System.out.println("드라이버:" + dirver);
		String username = properties.getProperty("username");
		System.out.println("username:" + dirver);

	}

  }

