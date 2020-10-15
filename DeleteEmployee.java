package my_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
public static void main(String[] args) {
	try {
		Connection conn= EmpDb.getEmpDb();
		System.out.println("Enter employee number to delete");
		
		int eno = new Scanner(System.in).nextInt();
		
		String sql ="delete from employee where eno = "+eno;
		Statement st = conn.createStatement();
		if(st.executeUpdate (sql) > 0) {
			System.out.println("success");
		}
		else {
			System.out.println("not Available");
		}
		
		
		st.close();
		conn.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
