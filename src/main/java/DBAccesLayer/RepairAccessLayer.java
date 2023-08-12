/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;

import DBLayer.DBConnection;
import Models.Repair;
/**
 *
 * @author Malitha_Supun
 */
public class RepairAccessLayer {
    
    private DBConnection singleConn;

    public RepairAccessLayer() {
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addRepair(Repair Emp) {
        try {
            String query = "insert into repairdetails values(" +  Emp.getModelID()  + "," + "'" + Emp.getProblem() + "'" +  ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
