/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DBAccesLayer.MechenicAcesscLayer;
import Models.Mechenic;
/**
 *
 * @author Malitha_Supun
 */
public class MechenicController {
    
    Mechenic objMechenic;
    MechenicAcesscLayer EmpL;

    public MechenicController() {
        EmpL = new MechenicAcesscLayer();
    }

    public Mechenic AddMechenic( String OrderID ,String Model, String Discription, int Cost, int Servisecharge) {
        objMechenic= new Mechenic(OrderID, Model, Discription, Cost, Servisecharge);
        return objMechenic;
    }

    public boolean insertMechenicTODB(Mechenic Emp) {
        boolean result = EmpL.addMechenic(Emp);
        return result;
    }
    
}

    