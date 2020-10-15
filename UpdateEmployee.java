package my_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEmployee {
public static void main(String[] args) {
	try {
		
		Connection conn = EmpDb.getEmpDb();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter name");
		String name = sc.next();
		
		System.out.println("enter eno");
		int eno=sc.nextInt();
		
		System.out.println("enter designation");
		String ds=sc.next();
		
		System.out.println("enter salary");
		float salary= sc.nextFloat();
		
		sc.close();
		 
		String sql = "Update employee set name=  '"+name+"',salary = "+salary+", designation= '"+ds+"'where eno="+eno;
		
		Statement st = conn.createStatement();
		
		if(st.executeUpdate(sql)>0) {
			System.out.println("success");
		}
		else {
			System.out.println("not available");
		}
		
		st.close();
		conn.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
