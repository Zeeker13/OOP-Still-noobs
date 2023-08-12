/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;

import DBLayer.DBConnection;
import Models.Income;

/**
 *
 * @author Malitha_Supun
 */
public class IncomeAccesLayer {

    private DBConnection singleConn;

    public IncomeAccesLayer(){
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addIncome(Income Emp) {
        try {
            String query = "insert into income values(" + Emp.getOrderID() + "," + "'" + Emp.getClientName() + "'" + "," + "'"+Emp.getAmmount() +"'"+ "," +  Emp.getOrderDate()  + ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

}
