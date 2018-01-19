package com.spring.Dao;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.spring.jdbctemplet.Employee;
/**
 * 
 * @author Dhananjay
 *
 */
public class EmpDao_Implementation implements EmpDao<Employee>{

	private SimpleJdbcTemplate Simplejt;
	
	
	public void setSimplejt(SimpleJdbcTemplate simplejt) {
		this.Simplejt = simplejt;
	}

	public Employee AddEmployee(Employee t) {
		Simplejt.update("insert into employee values(?,?,?,?)",t.getEmpID(),t.getName(),t.getCity(),t.getPincode());
		return t;
	}

	public boolean DeleteEmployee(int i) {
	
		return Simplejt.update("delete from employee where id="+i)>0;
	}

	public boolean update(Employee t) {
		return Simplejt.update("update Employee set name=?, pincode=?, city=? where id=?",t.getName(),t.getPincode(),t.getCity(),t.getEmpID())>0;
	}

	public Employee GetEmployee(int i) {
		
		return Simplejt.queryForObject("select * from employee where id="+i,new Emp_Mapping());
	}

	public List GetAllEmployee() {
		return  Simplejt.queryForList("select * from employee ");
	}
	
	/*--------------------named JDBC templet-------------------------*/
	/*private NamedParameterJdbcTemplate Namedpjt;

	public void setNamedpjt(NamedParameterJdbcTemplate namedpjt) {
		Namedpjt = namedpjt;
	}

	@Override
	public Employee AddEmployee(Employee t) {
		String Sql = "INSERT INTO Employee (id,name,city,pincode) VALUES (:id, :name, :city,:pincode)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", t.getEmpID());
		map.put("name", t.getName());
		map.put("city", t.getCity());
		map.put("pincode", t.getPincode());
		Namedpjt.update(Sql, map);
		return t;
	}

	@Override
	public boolean DeleteEmployee(int i) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", i);
		return Namedpjt.update("delete from employee where id=" + i, map) > 0;
	}

	@Override
	public boolean update(Employee t) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", t.getEmpID());
		map.put("name", t.getName());
		map.put("city", t.getCity());
		map.put("pincode", t.getPincode());

		return Namedpjt
				.update("update Employee set name=:name, pincode=:pincode, city=:city where id=:id",
						map) > 0;
	}

	@Override
	public Employee GetEmployee(int i) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", i);
		return (Employee) Namedpjt.queryForObject(
				"select * from employee where id=:id", map, new Emp_Mapping());
	}

	@Override
	public List<Employee> GetAllEmployee() {

		return Namedpjt.query("select * from employee ", new Emp_Mapping());
	}
*/	
	/*--------------------JDBC TEMPLET-------------------------*/
/*	private JdbcTemplate jdbctemplate;
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public Employee AddEmployee(Employee t) {
		jdbctemplate.update("insert into employee values(?,?,?,?)",t.getEmpID(),t.getName(),t.getCity(),t.getPincode());
		return t;
	}

	public boolean DeleteEmployee(int i) {
	
		return jdbctemplate.update("delete from employee where id="+i)>0;
	}

	public boolean update(Employee t) {
		return jdbctemplate.update("update Employee set name=?, pincode=?, city=? where id=?",t.getName(),t.getPincode(),t.getCity(),t.getEmpID())>0;
	}

	public Employee GetEmployee(int i) {
		
		return jdbctemplate.queryForObject("select * from employee where id="+i,new Emp_Mapping());
	}

	public List GetAllEmployee() {
		return  jdbctemplate.queryForList("select * from employee ");
	}
*/
}
