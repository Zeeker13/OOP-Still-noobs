/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;

import DBLayer.DBConnection;
import Models.Expence;
/**
 *
 * @author Malitha_Supun
 */
public class ExpenceAccesLayer {
    
    private DBConnection singleConn;

    public ExpenceAccesLayer() {
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addExpence(Expence Emp) {
        try {
            String query = "insert into expence values(" + "'" + Emp.getExpenceType() + "'" + "," + Emp.getAmmount() + ","+"'" + Emp.getDate() + "'" + ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
