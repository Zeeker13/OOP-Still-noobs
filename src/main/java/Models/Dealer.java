/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Dealer {
    public String DealerID ;
    public String DealerName ;
    public int DealerContactNum;
    public String DealerEmail;
    public String DealerAddress;

    public String getDealerID() {
        return DealerID;
    }

    public String getDealerName() {
        return DealerName;
    }

    public int getDealerContactNum() {
        return DealerContactNum;
    }

    public String getDealerEmail() {
        return DealerEmail;
    }

    public String getDealerAddress() {
        return DealerAddress;
    }

    
    public Dealer(String DealerID, String DealerName, int DealerContactNum, String DealerEmail, String DealerAddress) {
        this.DealerID = DealerID;
        this.DealerName = DealerName;
        this.DealerContactNum = DealerContactNum;
        this.DealerEmail = DealerEmail;
        this.DealerAddress = DealerAddress;
    }

   
    
    
}
