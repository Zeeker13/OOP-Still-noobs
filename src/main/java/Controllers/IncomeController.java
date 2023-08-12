/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DBAccesLayer.IncomeAccesLayer;
import Models.Income;
/**
 *
 * @author Malitha_Supun
 */
public class IncomeController {
    
     Income objIncome;
    IncomeAccesLayer IncoL;

    public IncomeController() {
        IncoL = new IncomeAccesLayer();
    }

    public Income AddIncome(int OrderID, String ClientName, int Ammount, String OrderDate) {
        objIncome= new Income(OrderID, ClientName, Ammount, OrderDate);
        return objIncome;
    }

    public boolean insertIncomeTODB(Income Inc) {
        boolean result = IncoL.addIncome(Inc);
        return result;
    }
}
