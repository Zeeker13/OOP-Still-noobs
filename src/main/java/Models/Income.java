/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Income {
    public int OrderID ;
    public String ClientName;
    public int Ammount;
    public String OrderDate;

    public int getOrderID() {
        return OrderID;
    }

    public String getClientName() {
        return ClientName;
    }

    public int getAmmount() {
        return Ammount;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    
    public Income(int OrderID, String ClientName, int Ammount, String OrderDate) {
        this.OrderID = OrderID;
        this.ClientName = ClientName;
        this.Ammount = Ammount;
        this.OrderDate = OrderDate;
    }
    
    
    
}
