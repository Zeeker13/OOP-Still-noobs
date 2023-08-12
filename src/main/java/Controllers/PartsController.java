package Controllers;

import DBAccesLayer.PartAccessLayer;
import Models.Parts;

/**
 *
 * @author Malitha_Supun
 */
public class PartsController {
    Parts objParts;
    PartAccessLayer EmpL;

    public PartsController() {
        EmpL = new PartAccessLayer();
    }

    public Parts AddParts(int PartID, String PartName,int DealerID) {
       objParts = new Parts(PartID, PartName, DealerID);
       return objParts;
    }

    public boolean insertPartsTODB(Parts Emp) {
        boolean result = EmpL.addParts(Emp);
        return result;
    }
}