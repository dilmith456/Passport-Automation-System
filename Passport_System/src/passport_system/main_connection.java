package passport_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportsystem","root","Thenu@123");
			System.out.println("Success");
		}catch (SQLException e) {
			System.out.println("Connection Failed");
		}
		
	}

}
