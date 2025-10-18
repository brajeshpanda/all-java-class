
import java.sql.Connection;
import java.sql.DriverManager;

public class A {
	public static void main(String[] args) {
		try {
			//connect to database
		Connection con=	DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysqldb1","root","test");
			System.out.println(con);
			
			//write sql queries
			
			
			//close connection
			
		} catch (Exception e) {
			
		}
	}

}
