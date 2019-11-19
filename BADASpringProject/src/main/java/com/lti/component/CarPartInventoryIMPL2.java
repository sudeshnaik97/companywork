package com.lti.component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cpl2")
public class CarPartInventoryIMPL2 implements CarPartsInventory {
@Autowired
private DataSource dataSource; 
	public void addNewPart(CarPart carPart) {
		 Connection conn=null;
		 PreparedStatement stmt=null;
		try{
			
		
		conn = dataSource.getConnection();
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
		
		conn1 =dataSource.getConnection();
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
