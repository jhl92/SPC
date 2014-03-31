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
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

public class JDBCSelectQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";
    ResultSet rs;

    public void printWriter(String tomorrowDate)
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            //Registrer JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            System.out.println(tomorrowDate);
            //Åben forbindelsen
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected database successfully...");

            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT GUEST.GUESTID, GUEST.GUESTLASTNAME, GUEST.GUESTFIRSTNAME from GUEST INNER JOIN BOOKROOM ON BOOKROOM.GUESTID=GUEST.GUESTID Where BOOKROOM.DATEFROM = '" + tomorrowDate + "' ORDER BY GUEST.GUESTLASTNAME");
            System.out.println("Statement acceptet");
            String guestList = "ListofGuestsFor_" + tomorrowDate + ".txt";
          
            try (PrintWriter writer = new PrintWriter(guestList))
            {
                
                while(rs.next()) {
                String lastName = rs.getString("GUESTLASTNAME");
                String firstName = rs.getString("GUESTFIRSTNAME");
                String guestID = rs.getString("GUESTID");
                writer.println(lastName+", "+firstName+" - Guest ID: "+guestID);
                } 
                writer.close();
            } catch (FileNotFoundException e)
            {
                System.err.println(e);
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
//    public void JDBCSelectRoom ()
//    {
//        Connection conn = null;
//        Statement stmt = null;
//        try
//        {
//            //Registrer JDBC driver
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//
//            //Åben forbindelsen
//            System.out.println("Connecting to a selected database...");
//            conn = DriverManager.getConnection(url, user, pass);
//            System.out.println("Connected database successfully...");
//
//            //Query
//            System.out.println("Creating statement...");
//            stmt = conn.createStatement();
//
////            String sql = "SELECT roomID, roomType, roomPrice, roomAvailability from Rooms";
//            ResultSet rs; 
//            rs = stmt.executeQuery("SELECT * from Rooms Where " );
//           
//            while (rs.next())
//            {           
//                int roomID = rs.getInt("roomID");
//                String roomType = rs.getString("roomType");
//                float roomPrice = rs.getFloat("roomPrice");
//                String roomAvailability = rs.getString("roomAvailability");
//
//                System.out.println("ID: " + roomID);
//                System.out.println("Type: " + roomType);
//                System.out.println("Price: " + roomPrice);
//                System.out.println("Availability: " + roomAvailability);
//            }
//            rs.close(); 
//        } catch (SQLException se)
//        {
//            se.printStackTrace();
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//        } finally
//        {
//            try
//            {
//                if (stmt != null)
//                {
//                    conn.close();
//                }
//            } catch (SQLException se)
//            {
//            }
//            try
//            {
//                if (conn != null)
//                {
//                    conn.close();
//                }
//            } catch (SQLException se)
//            {
//                se.printStackTrace();
//            }
//        }
//        System.out.println("Done.");
//    }
}
