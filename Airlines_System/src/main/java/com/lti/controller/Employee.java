package com.lti.controller;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Employee
 */
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter(); 
		int i=Integer.parseInt(request.getParameter("eid"));
		String name1= request.getParameter("ename");
//		out.print("ID: "+i+"</br>");
//		out.print("Name: "+name1);
		InputStream is= getClass().getClassLoader().getResourceAsStream("Config.properties");
		Properties prop=new Properties();
		prop.load(is);
				String driver=(String)prop.get("db.driver");
				String url=(String)prop.get("db.url");
				String user=(String)prop.get("db.user");
				String pass=(String)prop.get("db.pass");
				
		try{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			out.print("Conection obtained....");
			PreparedStatement p=con.prepareStatement("insert into Employee1 values(?,?)");
		p.setInt(1, i);
		p.setString(2, name1);
		int k=p.executeUpdate();
			if(k>0)
				out.print("Entry accepted!!");
		
	}catch(Exception e)
		{
		System.out.println(e);
	}
	
	out.close();

}}
