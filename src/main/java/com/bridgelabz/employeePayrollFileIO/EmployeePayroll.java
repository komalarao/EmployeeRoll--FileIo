package com.bridgelabz.employeePayrollFileIO;

public class EmployeePayroll {
	 public static void main(String[] args) {
	        EmployeePayRollService employeePayrollService = new EmployeePayRollService();
	        System.out.println("Welcome to the Employee_Payroll_Services");
	        employeePayrollService.readEmployeeDataFromConsole();
	        employeePayrollService.writeEmployeeDataInConsole();
	    }
}
