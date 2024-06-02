package passport_system;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Doc {
	
	String birthcopy;
	
	passport_connection ob;
	Connection conn;
	
	
	




public Doc() {
		String filename = null;
	// TODO Auto-generated constructor stub
	this.birthcopy=filename;
	ob= new passport_connection();
	conn=ob.passport_connection();
	}







public void upload(String birthcopy) {
		
		try {
			File bc = new File(birthcopy);
			FileInputStream bcin = new FileInputStream(bc);
			ByteArrayOutputStream ba = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int byteRead;
			int bytesRead;
			while((bytesRead = bcin.read(buf)) != -1) {
				ba.write(buf, 0, bytesRead);
				
			}
			
			byte[] bcbyte = ba.toByteArray();
			bcin.close();
			
			
			String sql= "Insert into document(photo) Values (?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setBytes(1,bcbyte);
			
			int rowsInserted = st.executeUpdate();
			if(rowsInserted>0) {
				JOptionPane.showMessageDialog(null, "Successfully uploaded");
				
			}else {
				JOptionPane.showMessageDialog(null, "Upload Failed");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

}
