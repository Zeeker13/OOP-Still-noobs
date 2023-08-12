/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Mechenic {
    public String OrderID ;
    public String Model;
    public String Discription;
    public int Cost;
    public int Servisecharge;

    public String getOrderID() {
        return OrderID;
    }

    public String getModel() {
        return Model;
    }

    public String getDiscription() {
        return Discription;
    }

    public int getCost() {
        return Cost;
    }

    public int getServisecharge() {
        return Servisecharge;
    }

    
    
    public Mechenic(String OrderID, String Model, String Discription, int Cost, int Servisecharge) {
        this.OrderID = OrderID;
        this.Model = Model;
        this.Discription = Discription;
        this.Cost = Cost;
        this.Servisecharge = Servisecharge;
    }

    
    
}
