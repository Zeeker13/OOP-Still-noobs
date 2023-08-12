/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DBAccesLayer.CustomerSellAccesLayer;
import Models.CustomerSell;

/**
 *
 * @author Malitha_Supun
 */
public class CustomerSellController {
    
    CustomerSell objCustomerSell;
    CustomerSellAccesLayer EmpL;

    public CustomerSellController() {
        EmpL = new CustomerSellAccesLayer();
    }

    public CustomerSell AddCustomerSell(String ModelID, String Ddescription) {
        objCustomerSell = new CustomerSell(ModelID, Ddescription);
        return objCustomerSell;
    }

    public boolean insertCustomerSellTODB(CustomerSell Emp) {
        boolean result = EmpL.addCustomerSell(Emp);
        return result;
    }
    
}
