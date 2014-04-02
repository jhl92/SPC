/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Junheng Li
 */
public class JDBCUpdateQuery
{
        // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";
    ResultSet rs;

    public void updateBooking(String newroomID, String newroomType, String newPrice, 
            String newroomAvailability, String newdateFrom, String newdateTo, 
            String newlastName, String newfirstName)
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
 
            rs = stmt.executeQuery("Select ");
           
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
    
    public InfoObjectConstructor getInfo(String guestID){
        Connection conn = null;
        Statement stmt = null;
//        String rsLastName;
//        String rsFirstName;
//        String rsCountry;
//        String rsContactPhone;
//        String rsEmail;
//        String rsReturning;
//        String rsRoomId;
//        String rsDateFrom;
//        String rsDateTo;
//        String rsPrice;
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
 
            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on bookroom.guestid = guest.guestid where guest.guestid ='" + guestID + "'");
           
            if(rs.next()) {
            String rsLastName = rs.getString("GuestLastName");
            String rsFirstName = rs.getString("GuestFirstname");
            String rsCountry = rs.getString("GuestCountry");
            String rsContactPhone = rs.getString("GuestContactPhone");
            String rsEmail = rs.getString("GuestEmail");
            String rsReturning = rs.getString("ReturningGuest");
            String rsRoomId = rs.getString("roomID");
            String rsDateFrom = rs.getString("dateFrom");
            String rsDateTo = rs.getString("dateTo");
            String rsPrice = rs.getString("BookingPrice");
            InfoObjectConstructor info1 = new InfoObjectConstructor(rsLastName, rsFirstName, rsCountry, rsContactPhone, rsEmail, rsReturning, rsRoomId, rsDateFrom, rsDateTo, rsPrice);
            return info1; 
            }
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
     return null;
    }
    
}