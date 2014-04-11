
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
                    + gPhone + "','" + gMail + "','" + returnGuest + "',0)";
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

    public void JDBCInsertFacility(String guestID, String facID, String facDate, 
            String timeStart, String timeEnd, String insID)
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

            String sql = "INSERT INTO FACBOOK VALUES ('"+guestID+"','"+facID+"','"+facDate+"','"+timeStart+"','"+timeEnd+"','N','"+insID+"')";
            stmt.executeUpdate(sql);
//            sql = "INSERT INTO GUEST VALUES";
//            stmt.executeUpdate(sql);
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
    
    public void JDBCInsertInstructorCost(String guestID, int facID) {
        Connection conn = null;
        Statement stmt = null;
        String sql = "";
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
            switch(facID) {
                
                case 01:  
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + 30 "
                        + "WHERE GUESTID = '"+guestID+"'";
                stmt.executeUpdate(sql);
                break;    
            
                case 02: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + 30 "
                        + "WHERE GUESTID='"+guestID+"'";
                System.out.println(sql);
                stmt.executeUpdate(sql);                    
            
                case 05: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + 40 "
                        + "WHERE GUESTID='"+guestID+"'";
                stmt.executeUpdate(sql);
            
                case 06: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + 40 "
                        + "WHERE GUESTID='"+guestID+"'";
                stmt.executeUpdate(sql);
            
            }
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
