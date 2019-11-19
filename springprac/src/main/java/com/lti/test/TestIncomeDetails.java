package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.HomeLoanDaoInterface;
import com.ti.component1.Appointmentdate;
import com.ti.component1.BankDetails;
import com.ti.component1.CustomerDetails;
import com.ti.component1.IncomeDetails;
import com.ti.component1.PropertyDetails;



public class TestIncomeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("springpractice.xml");
		
HomeLoanDaoInterface ob=(HomeLoanDaoInterface)ctx.getBean("income");
//
//IncomeDetails id=new IncomeDetails();
//id.setEmployeeName("Sunil");
//id.setOrganizationType("Govt.");
//id.setRetirementAge(62);
//id.setTypeOfEmployment("Lecturer");
//ob.addNewRecord(id);
//
//
//CustomerDetails cd=new CustomerDetails();
CustomerDetails cusd=(CustomerDetails)ob.fetchById(CustomerDetails.class, 160);
//IncomeDetails id1=new IncomeDetails();
//id1.setEmployeeName("Vijay");
//id1.setOrganizationType("Private Ltd");
//id1.setRetirementAge(55);
//id1.setTypeOfEmployment("Clerk");
//id1.setCustdetails(cusd);
//ob.addNewRecord(id1);

//
//IncomeDetails id2=new IncomeDetails();
//id2.setEmployeeName("Vishal");
//id2.setOrganizationType("Music Studio");
//id2.setRetirementAge(50);
//id2.setTypeOfEmployment("Singer");
//ob.addNewRecord(id2);

//cd.setFname("Nikhil");
//cd.setMname("Dilip");
//cd.setLname("Mundey");
//cd.setGender("Male");
//cd.setDob(LocalDate.of(1998, 2, 20));
//cd.setEmail("niks@gmail.com");
//cd.setAadharNo(4526398789990L);
//cd.setNationality("Indian");
//cd.setPan("SDF4521FS");
//cd.setPhno(9822458769L);
//ob.addNewRecord(cd);
//IncomeDetails list=(IncomeDetails)ob.fetchById(IncomeDetails.class, 160);
//System.out.println(list);
PropertyDetails ppd=new PropertyDetails();
ppd.setPropId(415263);
ppd.setProplocation("Nagpur");
ppd.setEstamount(19600000);
ppd.setCustDetails(cusd);
ob.addNewRecord(ppd);
//CustomerDetails cusd=(CustomerDetails)ob.fetchById(CustomerDetails.class, 160);
//BankDetails bd= new BankDetails();
//bd.setAccountNo(7586954123l);
//bd.setBranch("Standard Chatered");
//bd.setIfsc("SC452369");
//bd.setCreditscore(630);
//bd.setCustdetails(cusd);
//ob.addNewRecord(bd);

//BankDetails blist=(BankDetails)ob.fetchById(BankDetails.class, 7586954123L);
//System.out.println(blist);

Appointmentdate aptdate=new Appointmentdate();
aptdate.setApptDate();
aptdate.setApptTime();
aptdate.set

	}

}
