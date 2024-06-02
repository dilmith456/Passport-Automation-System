package passport_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


		public class passport_connection {
		private String username;
		private String pwd;
		private String hostname;
		private String dbname;
		
		
		public passport_connection() {
			this.username="root";
			this.pwd="Thenu@123";
			this.hostname="localhost";
			this.dbname="passportsystem";
		}
		
		public Connection passport_connection() {
			Connection conn = null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportsystem","root","Thenu@123");
				return conn;
			}
			catch(SQLException e) {
				System.out.println("Connection Failed");
				return conn;
			}
		}
	}


