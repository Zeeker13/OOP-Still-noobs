package Models;

/**
 *
 * @author Malitha_Supun
 */
public class Parts {
    public int PartID;
    public String  PartName;
    public int DealarID ;

    public int getPartID() {
        return PartID;
    }

    public String getPartName() {
        return PartName;
    }

    public int getDealarID() {
        return DealarID;
    }

    public Parts(int PartID, String PartName, int DealarID) {
        this.PartID = PartID;
        this.PartName = PartName;
        this.DealarID = DealarID;
    }
    

   
    
}
