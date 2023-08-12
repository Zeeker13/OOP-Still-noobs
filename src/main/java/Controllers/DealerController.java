package Controllers;
import DBAccesLayer.DealerAccesLayer;
import Models.Dealer;
/**
 *
 * @author Malitha_Supun
 */
public class DealerController {

    Dealer objDealer;
    DealerAccesLayer DelL;

    public DealerController() {
        DelL = new DealerAccesLayer();
    }

    public Dealer AddDealer(String DealerID, String DealerName, int DealerContactNum, String DealerEmail, String DealerAddress) {
        objDealer = new Dealer(DealerID, DealerName, DealerContactNum, DealerEmail,DealerAddress);
        return objDealer;
    }

    public boolean insertDealerTODB(Dealer Del) {
        boolean result = DelL.addDealerTODB(Del);
        return result;
    }
    
}
