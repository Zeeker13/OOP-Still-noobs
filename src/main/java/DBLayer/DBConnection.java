package DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private final String URL = "jdbc:mysql://localhost:3306/timetikerdb";
    private final String Uname = "root";
    private final String Password = "";
    private static DBConnection instance;
    public static Connection con;

    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection Success...");
        } catch (SQLException ex) {
            System.out.println("Database Connection Error" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Calss Error" + ex.getMessage());
        }
    }

    public static DBConnection getSingleInstance() {
        try {
            if (instance == null) {
                instance = new DBConnection();
            } else if (instance.con.isClosed()) {
                instance = new DBConnection();
            } else {
                return instance;
            }
            return instance;

        } catch (SQLException ex) {
            System.out.println("Database Connection Error" + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuary(String sqlQ) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;

        } catch (SQLException ex) {
            System.out.println("SQL Error" + ex.getMessage());
            return false;

        }
    }
}
