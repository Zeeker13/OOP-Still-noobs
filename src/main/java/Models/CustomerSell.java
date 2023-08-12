/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class CustomerSell {
    public String ModelID;
    public String Ddescription;

    public String getModelID() {
        return ModelID;
    }

    public String getDdescription() {
        return Ddescription;
    }

    public CustomerSell(String ModelID, String Ddescription) {
        this.ModelID = ModelID;
        this.Ddescription = Ddescription;
    }
    
}
