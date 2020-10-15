package my_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoDb implements Db {
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Thanks");
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection Failed:" + e);
		}
	}
}
