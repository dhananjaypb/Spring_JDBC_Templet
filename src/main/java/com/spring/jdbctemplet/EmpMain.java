package com.spring.jdbctemplet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.Dao.EmpDao_Implementation;
/**
 * 
 * @author Dhananjay
 *
 */
public class EmpMain {

	public static void main(String[] args) {

		Employee e = new Employee(100, "Nitin", "Sangli", 416005);
		Employee e1 = new Employee(101, "Dhananjay", "Pune", 416004);

		ApplicationContext ac = new FileSystemXmlApplicationContext(
				"F:\\Dhananjay\\Dhananjay_1\\eclipse-workspace\\Spring_Demos\\src\\main\\java\\spring.xml");
		EmpDao_Implementation emp = (EmpDao_Implementation) ac.getBean("myDAO");

		/*--------------------JDBC TEMPLET-------------------------*/
		// emp.AddEmployee(e);
		// emp.DeleteEmployee(100);
		// emp.update(e);
		// System.out.println(emp.GetEmployee(100));
		// System.out.println(emp.GetAllEmployee());
		/*--------------------JDBC TEMPLET-------------------------*/

		/*--------------------Simple JDBC templet-------------------------*/
		// emp.AddEmployee(e);
		// emp.update(e);
		// emp.DeleteEmployee(100);
		// System.out.println(emp.GetEmployee(101));
//		System.out.println(emp.GetAllEmployee());

		/*--------------------named JDBC templet-------------------------*/

		/*--------------------named JDBC templet-------------------------*/
		// emp.AddEmployee(e1);
		// emp.DeleteEmployee(101);
		// emp.update(e1);
		// System.out.println(emp.GetEmployee(101));
		// System.out.println(emp.GetAllEmployee());
		/*--------------------named JDBC templet-------------------------*/

	}

}
