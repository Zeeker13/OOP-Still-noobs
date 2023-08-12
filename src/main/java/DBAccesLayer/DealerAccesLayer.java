/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBAccesLayer;
import DBLayer.DBConnection;
import Models.Dealer;

/**
 *
 * @author Malitha_Supun
 */
public class DealerAccesLayer {
    
    private DBConnection singleConn;

        public DealerAccesLayer() {
            singleConn = DBConnection.getSingleInstance();
        }
    
    public boolean addDealerTODB(Dealer Del) {
        try {
            String query = "insert into dealer values(" + "'" + Del.getDealerID()+ "'" + "," + "'" + Del.getDealerName() + "'" + ","  + Del.getDealerContactNum() + "," + "'" + Del.getDealerEmail()+"'" + ","  +"'" +Del.getDealerAddress() +"'" +")"+";";
            System.out.println(query);

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    
}
