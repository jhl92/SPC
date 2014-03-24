/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Jonas
 */
//STEP 1. Import required packages
import java.sql.*;

public class JDBCSelectQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    
    //  Database login
    static final String user = "cphjp154";
    static final String pass = "cphjp154";

    public static void main(String[] args)
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

//            String sql = "SELECT roomID, roomType, roomPrice, roomAvailability from Rooms";
            ResultSet rs; 
            rs = stmt.executeQuery("SELECT * from Rooms" );
           
            while (rs.next())
            {           
                int roomID = rs.getInt("roomID");
                String roomType = rs.getString("roomType");
                float roomPrice = rs.getFloat("roomPrice");
                String roomAvailability = rs.getString("roomAvailability");

                System.out.println("ID: " + roomID);
                System.out.println("Type: " + roomType);
                System.out.println("Price: " + roomPrice);
                System.out.println("Availability: " + roomAvailability);
            }
            rs.close(); 
        } catch (SQLException se)
        {
            se.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se)
            {
            }
            try
            {
                if (conn != null)
                {
                    conn.close();
                }
            } catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
    }
}
