/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Employee {
    public String EmpID ;
    public String Rank ;
    public double Salary ;
    public String CurrentJob ;

    public String getEmpID() {
        return EmpID;
    }

    public String getRank() {
        return Rank;
    }

    public double getSalary() {
        return Salary;
    }

    public String getCurrentJob() {
        return CurrentJob;
    }

    public Employee(String EmpID, String Rank, double Salary, String CurrentJob) {
        this.EmpID = EmpID;
        this.Rank = Rank;
        this.Salary = Salary;
        this.CurrentJob = CurrentJob;
    }
            
}
