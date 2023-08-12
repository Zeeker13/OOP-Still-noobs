/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;

import DBLayer.DBConnection;
import Models.CustomerSell;

/**
 *
 * @author Malitha_Supun
 */
public class CustomerSellAccesLayer {
    
    private DBConnection singleConn;

    public CustomerSellAccesLayer() {
        singleConn = DBConnection.getSingleInstance();
    }

    public boolean addCustomerSell(CustomerSell Emp) {
        try {
            String query = "insert into customersell values(" + "'" + Emp.getModelID() + "'" + "," + "'" + Emp.getDdescription() + "'" +  ")" + ";";

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
