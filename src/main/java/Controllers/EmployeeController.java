package Controllers;
import DBAccesLayer.EmployeeAccessLayer;
import Models.Employee;
/**
 *
 * @author Malitha_Supun
 */
public class EmployeeController {

    Employee objEmployee;
    EmployeeAccessLayer EmpL;

    public EmployeeController() {
        EmpL = new EmployeeAccessLayer();
    }

    public Employee AddEmployee(String EmpID, String Rank, double Salary, String CurrentJob, String EmpType) {
        objEmployee = new Employee(EmpID, Rank, Salary, CurrentJob);
        return objEmployee;
    }

    public boolean insertEmployeeTODB(Employee Emp) {
        boolean result = EmpL.addEmployee(Emp);
        return result;
    }
}


