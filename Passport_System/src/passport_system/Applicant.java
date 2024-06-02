package passport_system;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {
	private String name;
	private String username;
	private String address;
	private String password;
	private int nic;
	private String city;
	private String occupation;
	private String gender;
	private int mobile;
	private String document;
	private String status;
	
	passport_connection ob;
	Connection conn;
	
	// Getters and setters
	
	
	
	// Methods
	
	public Applicant(String name, String username, String address, String password, int intnic) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.username=username;
		this.address=address;
		this.password=password;
		this.nic=intnic;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
	}

	public Applicant(String username, String password) {
		// TODO Auto-generated constructor stub
		
		this.username=Username();
		this.password=Password();
		
		ob= new passport_connection();
		conn=ob.passport_connection();
	}

	public Applicant(String name, String address, String city, String occupation, int Nic, String gender, int mob
			) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		this.city=city;
		this.occupation=occupation;
		this.nic=Nic;
		this.gender=gender;
		this.mobile=mob;
		//this.document=document;
		
		ob= new passport_connection();
		conn=ob.passport_connection();
		
	}

	public Applicant(int Nic) {
		// TODO Auto-generated constructor stub
		this.nic=Nic;
		ob= new passport_connection();
		conn=ob.passport_connection();
	}

	private String Password() {
		// TODO Auto-generated method stub
		return null;
	}

	private String Username() {
		// TODO Auto-generated method stub
		return null;
	}

	public void RegisterAccount(String name,String username,String address,String password,int intnic) {
		try {
			String sql = "Insert into applicant_register(name,username,address,password,nic) values (?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,name);
			statement.setString(2, username);
			statement.setString(3, address);
			statement.setString(4, password);
			statement.setInt(5, nic);
			
			statement.executeUpdate();
			
			System.out.println("Submit Success");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		
	}
	
	public void Login(String username,String password) {
		try {
			String sql = "SELECT * FROM applicant_register WHERE username = ? and password = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			
		
			statement.setString(1, username);
			statement.setString(2, password);
			// Execute the query
			ResultSet resultSet = statement.executeQuery();
			// Process the results
			while (resultSet.next()) {
			 // Retrieve data from each row
			 String uname = resultSet.getString("username");
			 String pswd = resultSet.getString("password");
			
			 
			// Print or process the retrieved data
			System.out.println("Login Success" );
		}
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
			}
			}
	
		public void getapplication(String name,String address, String city,String occupation,int Nic,String gender,int mob) {
			
			try {
				String sql = "Insert into applicant_form(name,address,city,occupation,nic,gender,mobile) values (?,?,?,?,?,?,?)";
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setString(1,name);
				statement.setString(2, address);
				statement.setString(3, city);
				statement.setString(4, occupation);
				statement.setInt(5, nic);
				statement.setString(6, gender);
				statement.setInt(7, mobile);
				//statement.setString(8, document);
				
				statement.executeUpdate();
				
				System.out.println("Submit Success");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
				
			}
			
		}
		
		public void view_status(int Nic) {
			try {
				String sql = "SELECT * FROM status WHERE nic_no = ?";
				PreparedStatement statement = conn.prepareStatement(sql);
				
				statement.setInt(1, nic);
			
				ResultSet resultSet = statement.executeQuery();
				// Process the results
				while (resultSet.next()) {
				 // Retrieve data from each row
				  name = resultSet.getString("name");
				  status = resultSet.getString("status");
				
				 
				// Print or process the retrieved data
				System.out.println("Name : " +  name   );
				System.out.println("Staus : " +  status   );
			}
				}
				catch(SQLException e) {
					System.out.println(e.getMessage());
					System.out.println(e);
				}
				}
		}
			
		
	

