package com.emp.employeewage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Employee emp=new Employee();
		System.out.println("Employee's One Day Salary is :" + emp.dailyEmpWage());
	}		
}