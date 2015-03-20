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
public class SalariedEmployee extends Employee {

    private double fixedSalary;
    private double bonuses;

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public SalariedEmployee(String employeeID, String name, String address, String phone, double fixedSalary, double bonuses) {
        setEmployeeID(employeeID);
        setAddress(address);
        setPhone(phone);
        setName(name);
        setBonuses(bonuses);
        setFixedSalary(fixedSalary);
    }

    @Override
    public double getMonthlySalary() {

        double getSalary = getBonuses() + fixedSalary;
        return getSalary;
    }

}
