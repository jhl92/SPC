
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
            String noOfNights, String dateTo) throws SQLException 
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

            //Sætter autoCommint til false
            conn.setAutoCommit(false);
            
            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
 
            rs = stmt.executeQuery("UPDATE BOOKROOM SET ROOMID ='"+roomID
                    +"', DATEFROM ='"+dateFrom+"', NOOFNIGHTS ='"+noOfNights+"', "
                    + "DATETO ='"+dateTo+"' "
                    + "WHERE GUESTID ='"+guestID+"' OR ROOMID = '"+roomID+"'");
           
            conn.commit();
            rs.close(); 
        } catch (SQLException se){
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e){
            e.printStackTrace();
            conn.rollback();
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
            String mail) throws SQLException
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

            //Sætter autoCommint til false
            conn.setAutoCommit(false);
            
            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            rs = stmt.executeQuery("UPDATE GUEST SET GUESTFIRSTNAME ='"+guestFirstName
                    +"', GUESTLASTNAME ='"+guestLastName+"', GUESTCOUNTRY ='"+guestCountry+"', "
                    + "GUESTCONTACTPHONE ="+phone+", GUESTEMAIL ='"+mail
                    +"' WHERE GUESTID ='"+guestID+"'");
           
            conn.commit();
            rs.close(); 
        } catch (SQLException se){
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e){
            e.printStackTrace();
            conn.rollback();
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
    
    public void updateFacBook(String guestID, String NEWfacDate, String NEWtimeStart, 
               String NEWtimeEnd, String CURRtimeStart, String CURRfacDate) throws SQLException
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

            //Sætter autoCommint til false
            conn.setAutoCommit(false);
                        
            //Query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "UPDATE FACBOOK SET FACDATE = '"+NEWfacDate+"', TIMESTART ='"
                    +NEWtimeStart+".00', TIMEEND ='"+NEWtimeEnd+".00' "
                    +"WHERE GUESTID ='"+guestID+"' AND TIMESTART='"
                    +CURRtimeStart+"' AND FACDATE ='"+CURRfacDate+"'";

            stmt.executeUpdate(sql);
            conn.commit();
            
        } catch (SQLException se){
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e){
            e.printStackTrace();
            conn.rollback();
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
