/*
 *       Filename:  SalariedEmployee.java
 *
 *    Description:  Exercise 10.8 - Payroll System Modification
 *
 *        Created:  06/11/15 20:45:20
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String first, String last, String ssn, double salary,
            int month, int day, int year){
        // pass to Employee constructor
        super(first, last, ssn, month, day, year);

        setWeeklySalary(salary);
    }
    // SETTERS
    public void setWeeklySalary(double salary){
        if(salary >= 0.0f)
            this.weeklySalary = salary;
        else
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0f");
    }
    // GETTERS
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    // return String representation of SalriedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
