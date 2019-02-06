package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.ProductexcelBean;
import com.training.bean.RegistrationBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class ELearningDAO {
	
	Properties properties; 
	
	public ELearningDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<LoginBean> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<LoginBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<LoginBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				LoginBean temp = new LoginBean(); 
				temp.setUserName(gc.rs1.getString(1));
				temp.setPassword(gc.rs1.getString(2));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	
	
	
	
	public List<RegistrationBean> getregistration(){
		String sql = properties.getProperty("get.registration"); 
		
		GetConnection gc  = new GetConnection(); 
		List<RegistrationBean> list1 = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list1 = new ArrayList<RegistrationBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RegistrationBean temp = new RegistrationBean(); 
				temp.setFirstname(gc.rs1.getString(1));
				temp.setLastname(gc.rs1.getString(2));
				temp.setEmail(gc.rs1.getString(3));
				temp.setTelephone(gc.rs1.getString(4));
				temp.setAddress1(gc.rs1.getString(5));
				temp.setAddress2(gc.rs1.getString(6));
				temp.setCity(gc.rs1.getString(7));
				temp.setPostcode(gc.rs1.getString(8));
				temp.setPassword(gc.rs1.getString(9));
				temp.setConfirmpassword(gc.rs1.getString(10));
				
				list1.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list1; 
	}
	
	
	
	
	
	
	
	
	public List<ProductexcelBean> getProductexcelBean(){
		String sql = properties.getProperty("get.registration"); 
		
		GetConnection gc  = new GetConnection(); 
		List<ProductexcelBean> list2 = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list2 = new ArrayList<ProductexcelBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				ProductexcelBean temp = new ProductexcelBean(); 
				temp.setFirstname(gc.rs1.getString(1));
				temp.setLastname(gc.rs1.getString(2));
				temp.setEmail(gc.rs1.getString(3));
				temp.setTelephone(gc.rs1.getString(4));
				temp.setAddress1(gc.rs1.getString(5));
				temp.setAddress2(gc.rs1.getString(6));
				temp.setCity(gc.rs1.getString(7));
				temp.setPostcode(gc.rs1.getString(8));
				temp.setPassword(gc.rs1.getString(9));
				temp.setConfirmpassword(gc.rs1.getString(10));
				
				list2.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list2; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new ELearningDAO().getLogins().forEach(System.out :: println);
	}

	public List<LoginBean> getRegisteration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
