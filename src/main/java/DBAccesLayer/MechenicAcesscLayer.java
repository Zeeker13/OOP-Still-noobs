/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;


import DBLayer.DBConnection;
import Models.Mechenic;
/**
 *
 * @author Malitha_Supun
 */
public class MechenicAcesscLayer {
    
    
    private DBConnection singleConn;

    public MechenicAcesscLayer() {
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addMechenic(Mechenic Emp) {
        try {
            String query = "insert into mechanic values(" + "'" + Emp.getOrderID() + "'" + "," + "'" + Emp.getModel() + "'" + "," + "'"+ Emp.getDiscription() + "'"+ ","  + Emp.getCost() +","+Emp.getServisecharge()+ ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
