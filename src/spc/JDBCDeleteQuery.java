
package spc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static spc.JDBCSelectQuery.url;

/**
 *
 * @author Jonas
 */
public class JDBCDeleteQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";

    public void JDBCDeleteFacBooking (String guestID, String facID, String timeStart)
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            //Registrer JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Åben forbindelsen
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected database successfully...");

            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            ResultSet rs; 
            rs = stmt.executeQuery("DELETE FROM FACBOOK WHERE GUESTID='"+guestID
                    +"' AND FACID='"+facID+"' AND TIMESTART='"+timeStart+"'");
           
            rs.close(); 
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se){
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
    }
    
    public void JDBCDeleteRoomBooking (String guestID)
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            //Registrer JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Åben forbindelsen
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected database successfully...");

            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            ResultSet rs; 
            rs = stmt.executeQuery("DELETE FROM BOOKROOM WHERE GUESTID='"+guestID+"'");
           
            rs.close(); 
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException se){
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
    }
}
