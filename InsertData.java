package my_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData implements Db {
public static void main(String[] args) {
	try {
		Class.forName(DRIVER);
		Connection conn=DriverManager.getConnection(URL, USER, PWD);
		Statement st=conn.createStatement();
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter salary");
		float salary = sc.nextFloat();
		System.out.println("enter designation");
		String desg = sc.next();
		
		sc.close();
		
		String query="insert into employee(name,salary,designation)";
		
		int x=st.executeUpdate(query);
		if(x>0)
		{
			System.out.println("registration success");
		}
		else
		{
			System.out.println("registration faild:");
		}
		st.close();
		conn.close();
	} catch (Exception e) {
		
		System.out.println("registration faild:"+e);
	}
}
}
