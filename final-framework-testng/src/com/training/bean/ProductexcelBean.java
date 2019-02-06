
package com.training.bean;

public class ProductexcelBean {
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Telephone;
	private String Address1;
	private String Address2;
	private String City ;
	private String Postcode;
	private String Password;
	private String Confirmpassword;
	
	
	public ProductexcelBean() {
	}

	public ProductexcelBean(String Firstname, String Lastname,String Email, String Telephone, String Address1,String Address2, String City , String Postcode, String Password,	 String Confirmpassword) {
		super();
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.Email = Email;
		this.Telephone = Telephone;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.City = City;
		this.Postcode = Postcode;
		this.Password = Password;
		this.Confirmpassword = Confirmpassword;
		
		
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	
	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	
	
	
	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	}
	
	
		
	
	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}
	
	
	
	
	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}
	
	
	
	
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
	
	
	

	public String getPostcode() {
		return Postcode;
	}

	public void setPostcode(String Postcode) {
		this.Postcode = Postcode;
	}
	
	
	
		
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	
		
	
	public String getConfirmpassword() {
		return Confirmpassword;
	}

	public void setConfirmpassword(String Confirmpassword) {
		this.Confirmpassword = Confirmpassword;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "RegistrationBean [Firstname=" + Firstname + ", Lastname=" + Lastname + ",Email=" + Email + ",Telephone=" + Telephone + ",Address1=" + Address1 + ", Address2=" + Address2 + ",City=" + City + ",Postcode=" + Postcode + ",Password=" + Password + ",Confirmpassword=" + Confirmpassword + "]";
	}

}
