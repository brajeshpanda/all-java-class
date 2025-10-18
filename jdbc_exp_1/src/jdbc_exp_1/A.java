package jdbc_exp_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class A {
	public static void main(String[] args) {
		try {
			//connect to database
		Connection con=	DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysqldb1","root","test");
			System.out.println(con);
			
			//write sql queries
			Statement stm=con.createStatement();
			ResultSet result=stm.executeQuery
			("select * from registration");
			
			while(result.next())
			{
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
			//close connection
			con.close();
		} catch (Exception e) {
			
		}
	}

}

