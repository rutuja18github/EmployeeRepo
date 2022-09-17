package com.emp.employeewage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		
		logger.info("Welcome to Employee Wage Computation Program");		 
		Employee emp=new Employee();
		logger.info("Employee's Salary for Month is : "+emp.montlyWage());
	}
	
}