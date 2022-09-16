package com.emp.employeewage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int numOfWorkingDays=20;
		int totalSalary=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Employee emp=new Employee();
		for ( int days=1; days<=numOfWorkingDays; days++ ) {
			totalSalary=totalSalary+emp.dailyEmpWage();
		}
		System.out.println("Employee's Salary for Month is : "+totalSalary);
	}		
}