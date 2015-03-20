/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Iterator;

/**
 *
 * @author Bhavik
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeFactory eh = new EmployeeFactory();

//eh.createEmployee(empID,address, phone, name, type, fixedSalary, hRate, numberOfHours, numberOfHoursWorked, bonuses)
        Employee e1 = eh.createEmployee("EMP1", "308 w 7th", "7243027002", "Bhavik", "sal", 1500, 0, 0, 0, 15);
        Employee e2 = eh.createEmployee("EMP2", "308 w 7th", "7243027002", "Sam", "hourly", 0, 6.5, 400, 350, 0);
        Employee e3 = eh.createEmployee("EMP3", "308 w 7th", "7243027002", "Sam", "sal", 2000, 0, 0, 0, 30);
        Employee e4 = eh.createEmployee("EMP4", "308 w 7th", "7243027002", "Sam", "hourly", 0, 6.5, 400, 360, 0);
        Employee e5 = eh.createEmployee("EMP5", "308 w 7th", "7243027002", "Sam", "sal", 4000, 0, 0, 0, 44);
        
        
        
        StringBuilder s = new StringBuilder();
        s.append("Employee ID: --->" + e1.getEmployeeID());
        s.append(System.lineSeparator());
        s.append("Employee Name: --->" + e1.getName());
        s.append(System.lineSeparator());
        s.append("Employee Address: --->" + e1.getAddress());
        s.append(System.lineSeparator());
        s.append("Employee Phone: --->" + e1.getPhone());
        s.append(System.lineSeparator());
        s.append("Employee Monthly Salary: --->" + e1.getMonthlySalary());
        //  -----------------------------------------------------------------------------------
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        //  ------------------------------------------------------------------------------------
        s.append("Employee ID: --->" + e2.getEmployeeID());
        s.append(System.lineSeparator());
        s.append("Employee Name: --->" + e2.getName());
        s.append(System.lineSeparator());
        s.append("Employee Address: --->" + e2.getAddress());
        s.append(System.lineSeparator());
        s.append("Employee Phone: --->" + e2.getPhone());
        s.append(System.lineSeparator());
        s.append("Employee Monthly Salary: --->" + e2.getMonthlySalary());
        //---------------------------------------------------------------------------------------
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        //  ------------------------------------------------------------------------------------
        s.append("Employee ID: --->" + e3.getEmployeeID());
        s.append(System.lineSeparator());
        s.append("Employee Name: --->" + e3.getName());
        s.append(System.lineSeparator());
        s.append("Employee Address: --->" + e3.getAddress());
        s.append(System.lineSeparator());
        s.append("Employee Phone: --->" + e3.getPhone());
        s.append(System.lineSeparator());
        s.append("Employee Monthly Salary: --->" + e3.getMonthlySalary());
        //---------------------------------------------------------------------------------------
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        //  ------------------------------------------------------------------------------------
        s.append("Employee ID: --->" + e4.getEmployeeID());
        s.append(System.lineSeparator());
        s.append("Employee Name: --->" + e4.getName());
        s.append(System.lineSeparator());
        s.append("Employee Address: --->" + e4.getAddress());
        s.append(System.lineSeparator());
        s.append("Employee Phone: --->" + e4.getPhone());
        s.append(System.lineSeparator());
        s.append("Employee Monthly Salary: --->" + e4.getMonthlySalary());
        //---------------------------------------------------------------------------------------
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        //  ------------------------------------------------------------------------------------
        s.append("Employee ID: --->" + e5.getEmployeeID());
        s.append(System.lineSeparator());
        s.append("Employee Name: --->" + e5.getName());
        s.append(System.lineSeparator());
        s.append("Employee Address: --->" + e5.getAddress());
        s.append(System.lineSeparator());
        s.append("Employee Phone: --->" + e5.getPhone());
        s.append(System.lineSeparator());
        s.append("Employee Monthly Salary: --->" + e5.getMonthlySalary());
        //---------------------------------------------------------------------------------------
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());
        s.append(System.lineSeparator());

        Double total = e1.getMonthlySalary()+e2.getMonthlySalary()+e3.getMonthlySalary()+e4.getMonthlySalary()+e5.getMonthlySalary();
        
        s.append("You need Total Cash"+total+"");
        System.out.println(s);

    }

}
