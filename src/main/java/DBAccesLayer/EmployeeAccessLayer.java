package DBAccesLayer;

import DBLayer.DBConnection;
import Models.Employee;

public class EmployeeAccessLayer {

    private DBConnection singleConn;

    public EmployeeAccessLayer() {
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addEmployee(Employee Emp) {
        try {
            String query = "insert into employee values(" + "'" + Emp.getEmpID() + "'" + "," + "'" + Emp.getRank() + "'" + "," + Emp.getSalary() + "," + "'" + Emp.getCurrentJob() + "'" + ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
