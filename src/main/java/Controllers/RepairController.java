package Controllers;

import DBAccesLayer.RepairAccessLayer;
import Models.Repair;

/**
 *
 * @author Malitha_Supun
 */
public class RepairController {

    Repair objRepair;
    RepairAccessLayer EmpL;

    public RepairController() {
        EmpL = new RepairAccessLayer();
    }

    public Repair AddRepair(String ModelID, String Problem) {
        objRepair = new Repair(Problem, Problem);
        return objRepair;
    }

    public boolean insertRepairTODB(Repair Emp) {
        boolean result = EmpL.addRepair(Emp);
        return result;
    }
}
