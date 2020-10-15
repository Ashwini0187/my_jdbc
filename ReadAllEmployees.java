package my_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadAllEmployees implements Db {
public static void main(String[] args) {
	try {
		Class.forName(DRIVER);
		Connection conn=DriverManager.getConnection(URL, USER, PWD);
		String query = "select *from employee";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("Eno\t Name\t Salary\t Designation");
		System.out.println("------------------------------------------------------------------------------------------------");
		
		
		while(rs.next())
		{
			System.out.println(rs.getInt("eno")+ "\t" + rs.getNString("name") +	"\t" +	rs.getFloat("salary") + "\t" + rs.getString("designation"));
		}
		
		rs.close();
		st.close();
		conn.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
