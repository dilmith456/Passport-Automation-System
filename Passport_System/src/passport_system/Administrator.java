package passport_system;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Administrator {
	
	private int admin_id;
	private String password;
	private String name;
	private int nic_no;
	private String status;
	private int nic;
	private String message;
	private int mob;
	private String city;
	
	passport_connection ob;
	Connection conn;
	
	
	
	
	
	// Methods

	public Administrator(int id, String password) {
		// TODO Auto-generated constructor stub
		this.admin_id=id;
		this.password=password;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
	}





	public Administrator(String name, int nic, String status) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.nic_no=nic;
		this.status=status;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
		
	}
	

	





	public Administrator(String status, int nic_no) {
		// TODO Auto-generated constructor stub
		
		this.status=status;
		this.nic_no=nic_no;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
		
	}





	public Administrator(int nic_no) {
		// TODO Auto-generated constructor stub
		this.nic=nic_no;
		ob= new passport_connection();
		conn=ob.passport_connection();
	}





	public Administrator() {
		// TODO Auto-generated constructor stub
		ob= new passport_connection();
		conn=ob.passport_connection();
	}





	public void admin_login(int id,String password){
		
		try {
			String sql = "Insert into admin_info(admin_id,password) values (?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setInt(1,admin_id);
			statement.setString(2, password);
			
			
			
			statement.executeUpdate();
			
			System.out.println("Submit Success");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		
	}
	
	public void insert_data(String name, int nic, String status) {
		try {
			String sql = "Insert into status(name,nic_no,status) values (?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,name);
			statement.setInt(2, nic_no);
			statement.setString(3, status);
			
			
			
			statement.executeUpdate();
			
			System.out.println("Insert Success");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		
	}
	
	public void update_data(String status,int nic_no) {
		try {
			
			String sql = "UPDATE status SET status = ? WHERE nic_no = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, status);
			
			// Set condition for parameter
			statement.setInt(2,nic_no);
			// Execute the statement
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			 System.out.println("Data updated successfully!");
			} else {
			 System.out.println("Data update Failed!");
			}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
			}
			
		} 
	
	public void delete_data(int nic_no) {
		try {
			
			String sql = "DELETE FROM applicant_register WHERE nic = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			// Set condition for parameter
			statement.setInt(1, nic_no); // Assuming ID column is the primary key
			// Execute the statement
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			 System.out.println("Data deleted successfully!");
			}
			
			else {
			 System.out.println("Data deletion Failed!");
			}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
			}
	}
	
	public void show_status(int NIC) {
		try {
			String sql = "SELECT * FROM status WHERE nic_no = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			// Set value for parameter
			statement.setInt(1, nic);
			// Execute the query
			ResultSet resultSet = statement.executeQuery();
			// Process the results
			while (resultSet.next()) {
			 // Retrieve data from each row
			 name = resultSet.getString("name");
			 status = resultSet.getString("status");
			
			 
			// Print or process the retrieved data
			System.out.println("NAME : " + name   );
			System.out.println("STATUS : " + status  );
		}
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
			}
	}
	
	
	public void send_sms(String name,int Mob,String message) {
		try {
			String sql = "Insert into sms(name,mob,message) values (?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,name);
			statement.setInt(2,Mob);
			
			statement.setString(3,message);
			
			
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
	
	public void forward_application(String name,int Nic,String city) {
		try {
			String sql = "Insert into police_verify(name,nic,city) values (?,?,?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,name);
			statement.setInt(2,Nic);
			
			statement.setString(3,city);
			
			
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
	
	
	

