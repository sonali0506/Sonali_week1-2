package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.RegistrationBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {


	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<RegistrationBean> list = new ELearningDAO().getregistration(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RegistrationBean temp : list){
			Object[]  obj = new Object[10]; 
			obj[0] = temp.getFirstname(); 
			obj[1] = temp.getLastname(); 
			obj[2] = temp.getEmail(); 
			obj[3] = temp.getTelephone(); 
			obj[4] = temp.getAddress1(); 
			obj[5] = temp.getAddress2(); 
			obj[6] = temp.getCity(); 
			obj[7] = temp.getPostcode(); 
			obj[8] = temp.getPassword(); 
			obj[9] = temp.getConfirmpassword(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	
	
	
	
	
/*	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/Naveen/Desktop/Testing.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
	
	*/
	
	
	
	
	
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		String fileName ="C:\\Sonali\\Selenium\\Datasheet1.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs1")
	public Object[][] getXLSData1(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:\\Sonali\\Selenium\\Datasheet1.xlsx", "Sheet1"); 
	}
	
	
	@DataProvider(name = "excel-inputs2")
	public Object[][] getExcelData2(){
		String fileName ="C:\\Sonali\\Selenium\\Datasheet2.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "excel-inputs3")
	public Object[][] getExcelData3(){
		String fileName ="C:\\Sonali\\Selenium\\Datasheet3.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
}
