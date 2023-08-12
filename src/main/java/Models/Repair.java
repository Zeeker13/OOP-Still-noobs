/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Repair {
    public String ModelID ;
    public String Problem;

    public String getModelID() {
        return ModelID;
    }

    public String getProblem() {
        return Problem;
    }

    public Repair(String ModelID, String Problem) {
        this.ModelID = ModelID;
        this.Problem = Problem;
    }
    
}
