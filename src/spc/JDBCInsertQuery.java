
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
            String gPhone, String gMail, String returnGuest) throws SQLException
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
            conn.commit();
            System.out.println("Inserted records into the table...");

        } catch (SQLException se)
        {
            //Håndterer JDBC relaterede fejl
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e)
        {
            //Håndterer Class relaterede fejl
            e.printStackTrace();
            conn.rollback();
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
            String timeStart, String timeEnd, String insID) throws SQLException
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
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO FACBOOK VALUES ('"+guestID+"','"+facID+"','"+facDate+"','"+timeStart+"','"+timeEnd+"','"+insID+"')";
            stmt.executeUpdate(sql);
//            sql = "INSERT INTO GUEST VALUES";
//            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            conn.commit();
        } catch (SQLException se)
        {
            //Håndterer JDBC relaterede fejl
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e)
        {
            //Håndterer Class relaterede fejl
            e.printStackTrace();
            conn.rollback();
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
    
    public void JDBCInsertWait(String guestID, String facID, String timeStart, String timeEnd, String facDate)
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
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO WAITLIST VALUES ('"+guestID+"','"+facID+"',POSITIONINCREASE.NEXTVAL"
                    +",'"+timeStart+"','"+timeEnd+"','"+facDate+"')";
            stmt.executeUpdate(sql);
//            sql = "INSERT INTO GUEST VALUES";
//            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            conn.commit();
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
    
    public void JDBCInsertInstructorCost(String guestID, String noOfHours, int facID) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        String sql = "";
        int cost30 = (Integer.parseInt(noOfHours)*30);
        int cost40 = (Integer.parseInt(noOfHours)*40);
        
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
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
            switch(facID) {
                
                case 01:  
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + "+cost30
                        + " WHERE GUESTID = '"+guestID+"'";
                stmt.executeUpdate(sql);
                break;    
            
                case 02: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + "+cost30
                        + " WHERE GUESTID='"+guestID+"'";
                stmt.executeUpdate(sql);      
                break;
            
                case 05: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + "+cost40
                        + " WHERE GUESTID='"+guestID+"'";
                stmt.executeUpdate(sql);
                break;
                    
                case 06: 
                sql = "UPDATE GUEST SET INSTRUCTORBILL = INSTRUCTORBILL + "+cost40
                        + " WHERE GUESTID='"+guestID+"'";
                stmt.executeUpdate(sql);
                break;
            }
            System.out.println("Inserted records into the table...");
            conn.commit();
        } catch (SQLException se)
        {
            //Håndterer JDBC relaterede fejl
            se.printStackTrace();
            conn.rollback();
        } catch (Exception e)
        {
            //Håndterer Class relaterede fejl
            e.printStackTrace();
            conn.rollback();
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
