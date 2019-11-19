package com.lti.component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
/*
 * JDBC TEMPLATE
 */
@Component("cpl3")
public class CarPartInventoryIMPL3 implements CarPartsInventory {
@Autowired
private DataSource dataSource; 
	public void addNewPart(CarPart carPart) {
		JdbcTemplate jt=new JdbcTemplate(dataSource);
			jt.update("insert into TBL_CARPARTS values(?,?,?,?,?)",
		
			carPart.getPartno(),
			carPart.getPartname(),
			carPart.getCarmodel(),
			 carPart.getQuantity(),
			 carPart.getPrice());
			
			
		
		
	}

//	public List<CarPart> getAvailableParts() {
//		List<CarPart> cpl=new ArrayList<CarPart>();
//		Connection conn1=null;
//		 PreparedStatement stmt1=null;
//		 try{
//		
//		conn1 =dataSource.getConnection();
//		stmt1=conn1.prepareStatement("select * from TBL_CARPARTS");
//		ResultSet rs= stmt1.executeQuery();
//		while(rs.next())
//		{
//			 CarPart cpt=new CarPart();
//
//			cpt.setPartno(rs.getInt("partno"));
//			cpt.setPartname(rs.getString("partname"));
//			cpt.setCarmodel(rs.getString("carmodel"));
//			cpt.setQuantity(rs.getInt("quantity"));
//			cpt.setPrice(rs.getDouble("price"));
//			
//			cpl.add(cpt);		
//		}
//		
//			//rs.close();
//	}
//	catch(Exception e){
//		System.out.println("Error");
//	}
//	return cpl;
//		
//	}
//	
//}

public List<CarPart> getAvailableParts() {
	JdbcTemplate jt=new JdbcTemplate(dataSource);

	 class CarPartMapper implements RowMapper<CarPart> { 
	public CarPart mapRow(ResultSet rs, int index) throws SQLException { 
		 CarPart cpt=new CarPart();
		 cpt.setPartno(rs.getInt("partno"));
		 cpt.setPartname(rs.getString("partname"));
		 cpt.setCarmodel(rs.getString("carmodel"));
		 cpt.setQuantity(rs.getInt("quantity"));
 		 cpt.setPrice(rs.getDouble("price"));
		return cpt;
	 } 
	}
	 List<CarPart> list=jt.query( "select * from TBL_CARPARTS", new CarPartMapper());
	 return list;
	 }}