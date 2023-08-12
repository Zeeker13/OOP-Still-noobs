/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Expence {
    
    public String ExpenceType ;
    public int Ammount ;
    public String Date ;

    public String getExpenceType() {
        return ExpenceType;
    }

    public int getAmmount() {
        return Ammount;
    }

    public String getDate() {
        return Date;
    }

    
    public Expence(String ExpenceType, int Ammount, String Date) {
        this.ExpenceType = ExpenceType;
        this.Ammount = Ammount;
        this.Date = Date;
    }
    
    
    
}
