package com.lti.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("cpl1")
public class CarPartInventoryIMPL1 implements CarPartsInventory {

	public void addNewPart(CarPart carPart) {
		 Connection conn=null;
		 PreparedStatement stmt=null;
		try{
			
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.229:1521:xe","hr","hr");
			stmt=conn.prepareStatement("insert into TBL_CARPARTS values(?,?,?,?,?)");
		
			stmt.setInt(1, carPart.getPartno());
			stmt.setString(2, carPart.getPartname());
			stmt.setString(3, carPart.getCarmodel());
			stmt.setInt(4, carPart.getQuantity());
			stmt.setDouble(5, carPart.getPrice());
			
			stmt.executeUpdate();
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}

	public List<CarPart> getAvailableParts() {
		List<CarPart> cpl=new ArrayList<CarPart>();
		Connection conn1=null;
		 PreparedStatement stmt1=null;
		 try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn1 = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.229:1521:xe","hr","hr");
		stmt1=conn1.prepareStatement("select * from TBL_CARPARTS");
		ResultSet rs= stmt1.executeQuery();
		while(rs.next())
		{
			 CarPart cpt=new CarPart();

			cpt.setPartno(rs.getInt("partno"));
			cpt.setPartname(rs.getString("partname"));
			cpt.setCarmodel(rs.getString("carmodel"));
			cpt.setQuantity(rs.getInt("quantity"));
			cpt.setPrice(rs.getDouble("price"));
			
			cpl.add(cpt);		
		}
		
			//rs.close();
	}
	catch(Exception e){
		System.out.println("Error");
	}
	return cpl;
		
	}
	
}
