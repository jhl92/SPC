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
import java.util.ArrayList;


public class JDBCUpdateQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";
    ResultSet rs;
    
    public void updateBookRoom(String guestID, String roomID, String dateFrom,
            String noOfNights, String dateTo) 
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
 
            rs = stmt.executeQuery("UPDATE BOOKROOM SET ROOMID ='"+roomID
                    +"', DATEFROM ='"+dateFrom+"', NOOFNIGHTS ='"+noOfNights+"', "
                    + "DATETO ='"+dateTo+"' "
                    + "WHERE GUESTID ='"+guestID+"' OR ROOMID = '"+roomID+"'");
           
            rs.close(); 
        } catch (SQLException se){
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try
            {
                if (stmt != null){
                    conn.close();
                }
            } catch (SQLException se){}
            try
            {
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
    }

    public void updateGuest(String guestID, String guestFirstName, 
            String guestLastName, String guestCountry, String phone, 
            String mail)
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

            rs = stmt.executeQuery("UPDATE GUEST SET GUESTFIRSTNAME ='"+guestFirstName
                    +"', GUESTLASTNAME ='"+guestLastName+"', GUESTCOUNTRY ='"+guestCountry+"', "
                    + "GUESTCONTACTPHONE ="+phone+", GUESTEMAIL ='"+mail
                    +"' WHERE GUESTID ='"+guestID+"'");
           
            rs.close(); 
        } catch (SQLException se){
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try{
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se){
            }
            try{
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
    
       public void updateFacBook(String guestID, String facDate, String NEWtimeStart, 
               String NEWtimeEnd, String CURRtimeStart)
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

            rs = stmt.executeQuery("UPDATE FACBOOK SET TIMESTART ='"
                    +NEWtimeStart+"', TIMEEND ='"+NEWtimeEnd+"' "
                    +"WHERE GUESTID ='"+guestID+"' AND TIMESTART='"
                    +CURRtimeStart+"'");
           
            rs.close(); 
        } catch (SQLException se){
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            try{
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se){
            }
            try{
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
