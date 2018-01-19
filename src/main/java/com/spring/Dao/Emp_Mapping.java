package com.spring.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbctemplet.Employee;

/**
 * 
 * @author Dhananjay
 *
 */
public class Emp_Mapping implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e= new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("city"), rs.getInt("pincode"));
		return e;
	}
	
	
	

}
