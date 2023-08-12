package DBAccesLayer;

import DBLayer.DBConnection;
import Models.Parts;


    public class PartAccessLayer {

        private DBConnection singleConn;

        public PartAccessLayer() {
            singleConn = DBConnection.getSingleInstance();
        }
    

    public boolean addParts(Parts par) {
        try {
            String query = "insert into spareparts values(" +  par.getPartID() + "," + "'" + par.getPartName() + "'" + "," + "'" + par.getDealarID() + "'"  +")"+";";
            

            boolean result = singleConn.ExecuteQuary(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}

