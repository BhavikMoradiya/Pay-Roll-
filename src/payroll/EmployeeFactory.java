/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Bhavik
 */
public class EmployeeFactory {

    public Employee createEmployee(String employeeID, String address, String phone, String name, String type, double fixedSalary, double hRate, double numberOfHours, double numberOfHoursWorked, double bonuses) {
        if (type.equals("sal")) {
            return new SalariedEmployee(employeeID, name, address, phone, fixedSalary, bonuses);
        } else if (type.equals("hourly")) {
            return new HourlyEmployee(employeeID, name, address, phone, hRate, numberOfHours, numberOfHoursWorked);
        } else {
            return null;
        }
    }
}
