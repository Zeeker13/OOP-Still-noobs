/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DBAccesLayer.ExpenceAccesLayer;
import Models.Expence;

/**
 *
 * @author Malitha_Supun
 */
public class ExpenceController {
    
    
    Expence objExpence;
    ExpenceAccesLayer EmpL;

    public ExpenceController() {
        EmpL = new ExpenceAccesLayer();
    }

    public Expence AddExpence(String ExpenceType, int Ammount, String Date) {
        objExpence = new Expence(ExpenceType, Ammount, Date);
        return objExpence;
    }

    public boolean insertExpenceTODB(Expence Emp) {
        boolean result = EmpL.addExpence(Emp);
        return result;
    }
    
}
