package com.bridgelabz.employeePayrollFileIO;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeePayRollMain {
	ArrayList<EmployeePayRollData> employeePayrollDataList = new ArrayList<>();
    EmployeePayRollImpl employeePayrollImpl = new EmployeePayRollImpl(employeePayrollDataList);
    Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollImpl.readEmployeePayrollData(consoleInputReader);
		employeePayrollImpl. writeEmployeePayrollData();
}
