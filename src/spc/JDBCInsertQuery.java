/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Jonas
 */
import java.sql.*;

public class JDBCInsertQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";

    public void JDBCInsertRoom(String guestID, String roomID, String empID,
            String dateFrom, String noOfNights, String dateTo, String roomAvailability,
            String guestFirstName, String guestLastName, String gCountry,
            String gPhone, String gMail, String returnGuest)
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
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO GUEST VALUEs ('" + guestID + "','" + guestFirstName 
                    + "','" + guestLastName + "','" + gCountry + "','" 
                    + gPhone + "','" + gMail + "','" + returnGuest + "')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO BOOKROOM VALUES ('" + guestID + "','"
                    + roomID + "','" + empID + "','" + dateFrom + "','"
                    +noOfNights+"','"+ dateTo + "','" + roomAvailability + "')";
            
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

        } catch (SQLException se)
        {
            //Håndterer JDBC relaterede fejl
            se.printStackTrace();
        } catch (Exception e)
        {
            //Håndterer Class relaterede fejl
            e.printStackTrace();
        } finally
        {
            //Luk forbindelsen
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

    public void JDBCInsertFacility(String guestID, String facType, String timeStart,
            String timeEnd)
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
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO BOOKFACI VALUES ('" + guestID + "','"
                    + facType + "','" + timeStart + "','" + timeEnd + "')";
            stmt.executeUpdate(sql);
//      sql = "INSERT INTO";
//      stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        } catch (SQLException se)
        {
            //Håndterer JDBC relaterede fejl
            se.printStackTrace();
        } catch (Exception e)
        {
            //Håndterer Class relaterede fejl
            e.printStackTrace();
        } finally
        {
            //Luk forbindelsen
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
