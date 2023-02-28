package com.bridgelabz.employeePayrollFileIO;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeePayRollTest {
	@Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayrollImplementation employeePayrollService = new EmployeePayrollImplementation();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        long entries = employeePayrollService.countEntries();
        Assert.assertEquals(3, entries);
    }

    @Test
    public void given3EmployeesWhenWrittenToFileShouldPrintEmployeeEntries() {
        EmployeePayrollImplementation employeePayrollService = new EmployeePayrollImplementation();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        employeePayrollService.printData();
        long entries = employeePayrollService.countEntries();
        Assert.assertEquals(3, entries);
    }

    @Test
    public void given3EmployeesWhenWrittenToFileShouldPrintNumberOfEmployeeEntries() {
    	EmployeePayrollImplementation employeePayrollService = new EmployeePayrollImplementation();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        long entries = employeePayrollService.countEntries();
        System.out.println("Number of entries are " + entries);
        Assert.assertEquals(3, entries);
    }
}
