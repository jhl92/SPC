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
    // JDBC driver name and database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database credentials
    static final String user = "cphjp154";
    static final String pass = "cphjp154";

    public static void main(String[] args)
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            //STEP 2: Register JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

//            String sql = "SELECT roomID, roomType, roomPrice, roomAvailability from Rooms";
            ResultSet rs; 
            rs = stmt.executeQuery("SELECT roomID, roomType, roomPrice, roomAvailability from Rooms" );
            //STEP 5: Extract data from result set
            if (rs.next())
            {
                int roomID = rs.getInt("ROOMID");
                String roomType = rs.getString("roomType");
                float roomPrice = rs.getFloat("roomPrice");
                String roomAvailability = rs.getString("roomAvailability");

                //Display values
                System.out.println("ID: " + roomID);
                System.out.println(", Type: " + roomType);
                System.out.println(", Price: " + roomPrice);
                System.out.println(", Availability: " + roomAvailability);
            }
            else
                System.out.println("pik");
            rs.close();
        } catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally
        {
            //finally block used to close resources
            try
            {
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se)
            {
            }// do nothing
            try
            {
                if (conn != null)
                {
                    conn.close();
                }
            } catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Done.");
    }//end main
}//end JDBCExample
