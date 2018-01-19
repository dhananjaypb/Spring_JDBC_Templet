package com.spring.jdbctemplet;

/**
 * 
 * @author Dhananjay
 *
 */
public class Employee {

	private int EmpID;
	private String Name;
	private String City;
	private int Pincode;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", Name=" + Name + ", City=" + City
				+ ", Pincode=" + Pincode + "]";
	}
	public String getName() {
		return Name;
	}
	public Employee(int empID, String name, String city, int pincode) {
		super();
		EmpID = empID;
		Name = name;
		City = city;
		Pincode = pincode;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
	
}
