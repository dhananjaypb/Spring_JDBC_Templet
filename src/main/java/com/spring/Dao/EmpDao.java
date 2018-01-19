package com.spring.Dao;

import java.util.List;
/**
 * 
 * @author Dhananjay
 *
 * @param <T>
 */
public interface EmpDao <T> {
	
	public T AddEmployee(T t);
	public boolean DeleteEmployee(int i);
	public boolean update(T t);
	public T GetEmployee(int i);
	public List<T> GetAllEmployee();
	

}
