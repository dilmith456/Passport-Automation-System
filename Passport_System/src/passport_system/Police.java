package passport_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Police {
	private String  name;
	private int  nic;
	private String life_status;
	private String application;
	passport_connection ob;
	Connection conn;
	
	// Getters and Setter
	
	
	// Methods
	
	public Police(String name, int Nic, String life_status, String application) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.nic=Nic;
		this.life_status=life_status;
		this.application=application;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
	}

	public void Insert_character(String name,int Nic,String life_status,String application) {
		
		try {
			String sql = "Insert into lifestyle(name,nic,life_status,application) values (?,?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,name);
			statement.setInt(2,nic);
			
			statement.setString(3,life_status);
			statement.setString(4,application);
			
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			 System.out.println("Data inserted successfully!");
			}
			else {
			 System.out.println("Data insertion Failed!");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
	}
		
	}
	
	
}
