package my_jdbc;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadEmployee {
public static void main(String[] args) {
	try {
		Connection conn = EmpDb.getEmpDb();
		System.out.println("enter employee number:");
		
		int eno = new Scanner (System.in).nextInt();
		
		
		String sql = "select *from employee where eno="+eno;
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			System.out.println("Name:"+rs.getString("Name"));
			System.out.println("Salary:"+ rs.getFloat("Salary"));
			System.out.println("Designation:"+ rs.getString("Designation"));
			
		}
		else {
			System.out.println("Employee not available");
		}
		rs.close();
		st.close();
		conn.close();
		
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
