package my_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpDb implements Db{
private static Connection conn=null;
static {
	try {
		Class.forName(DRIVER);
		conn= DriverManager.getConnection(URL, USER, PWD);
		
	} catch (Exception e) {
	System.out.println("Connection faild:"+e);
	
	}
}
	public static Connection getEmpDb() {
		return conn;
	}
	
	public static void main (String[] args) {
		System.out.println(getEmpDb());
	}
	
}

