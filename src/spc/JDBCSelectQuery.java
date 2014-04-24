package spc;

/**
 *
 * @author Jonas
 */
//STEP 1. Import required packages
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import static spc.JDBCUpdateQuery.url;

public class JDBCSelectQuery
{
    // JDBC driver & database URL

    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String url = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";
    //  Database login
    static final String user = "SEM2_TEST_GR13";
    static final String pass = "SEM2_TEST_GR13";
    ResultSet rs;
    ArrayList<String> guestIDArray = new ArrayList<>();

    public ArrayList checkIdAva() //Tjekker om et ID allerede er brugt -- Bruges af ID generatoren
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

            rs = stmt.executeQuery("SELECT GUESTID from "
                    + "GUEST");
            System.out.println("Statement acceptet");

            try
            {

                while (rs.next())
                {
                    String guestID = rs.getString("GUESTID");
                    guestIDArray.add(guestID);
                }
                return guestIDArray;
            } catch (Exception e)
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
        return null;
    }

    public ArrayList<InfoObjectConstructor> getInfoFromGuestID(String guestID)
    { //Sender information om gæsten og deres booking fra gæstID
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestid ='"
                    + guestID + "'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromFirstName(String firstName)
    { //Sender information om gæsten og deres booking fra fornavn
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestfirstname like '%"
                    + firstName + "%'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromLastName(String lastName)
    { //Sender information om gæsten og deres booking fra efternavn
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestlastname LIKE '%"
                    + lastName + "%'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromCountry(String country)
    { //Sender information om gæsten og deres booking fra land/sprog
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestcountry LIKE '%"
                    + country + "%'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromPhone(String phone)
    { //Sender information om gæsten og deres booking fra telefonnummer
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestcontactphone LIKE '%"
                    + phone + "%'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromMail(String mail)
    { //Sender information om gæsten og deres booking fra email
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where guest.guestemail LIKE '%"
                    + mail + "%'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromDateFrom(String dateFrom)
    { //Sender information om gæsten og deres booking fra start dato af booking
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where bookroom.datefrom ='"
                    + dateFrom + "'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public ArrayList<InfoObjectConstructor> getInfoFromDateTo(String dateTo)
    { //Sender information om gæsten og deres booking fra slut dato på booking
        Connection conn = null;
        Statement stmt = null;
        ArrayList<InfoObjectConstructor> guestIDHistory = new ArrayList<>();
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

            rs = stmt.executeQuery("Select * from GUEST inner join BOOKROOM on "
                    + "bookroom.guestid = guest.guestid where bookroom.dateto ='"
                    + dateTo + "'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstname");
                String rsCountry = rs.getString("GuestCountry");
                String rsContactPhone = rs.getString("GuestContactPhone");
                String rsEmail = rs.getString("GuestEmail");
                String rsReturning = rs.getString("ReturningGuest");
                String rsInstructorBill = rs.getString("InstructorBill");
                String rsRoomId = rs.getString("roomID");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                InfoObjectConstructor info1 = new InfoObjectConstructor(rsGuestID, rsLastName,
                        rsFirstName, rsCountry, rsContactPhone, rsEmail,
                        rsReturning, rsInstructorBill, rsRoomId, rsDateFrom, rsNoOfNights, rsDateTo);
                guestIDHistory.add(info1);
            }
            return guestIDHistory;
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

    public void printBill(String guestID)
    { //skriver regningen fra instrukionsomkostningerne på en fil
        Connection conn = null;
        Statement stmt = null;
        try
        {
            //Registrer JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Åben forbindelsen
            conn = DriverManager.getConnection(url, user, pass);

            //Query
            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT GUESTLASTNAME,GUESTFIRSTNAME,INSTRUCTORBILL"
                    + " FROM GUEST WHERE GUESTID='" + guestID + "'");
            String guestList = guestID + " - Instructor Bill.txt";

            try (PrintWriter writer = new PrintWriter(guestList))
            {

                while (rs.next())
                {
                    String lastName = rs.getString("GUESTLASTNAME");
                    String firstName = rs.getString("GUESTFIRSTNAME");
                    String cost = rs.getString("INSTRUCTORBILL");

                    writer.println("Guest ID: " + guestID + "\r\n" + "Name: "
                            + lastName + ", " + firstName + "\r\n" + "The current cost for"
                            + " instructions hours: " + cost);
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
            System.out.println("done");
        }
    }

    public void printWriter(String tomorrowDate) //laver en liste over check-ins
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

            rs = stmt.executeQuery("SELECT GUEST.GUESTID, GUEST.GUESTLASTNAME, "
                    + "GUEST.GUESTFIRSTNAME, GUEST.RETURNINGGUEST from "
                    + "GUEST INNER JOIN BOOKROOM ON BOOKROOM.GUESTID=GUEST.GUESTID "
                    + "Where BOOKROOM.DATEFROM = '" + tomorrowDate
                    + "' ORDER BY GUEST.GUESTLASTNAME");
            System.out.println("Statement acceptet");
            String guestList = tomorrowDate + " - List of Check-ins.txt";

            try (PrintWriter writer = new PrintWriter(guestList))
            {

                while (rs.next())
                {
                    String lastName = rs.getString("GUESTLASTNAME");
                    String firstName = rs.getString("GUESTFIRSTNAME");
                    String guestID = rs.getString("GUESTID");
                    String returningGuest = rs.getString("RETURNINGGUEST");
                    if (returningGuest.equals("Y"))
                    {
                        writer.println(lastName + ", " + firstName + " - Guest ID: "
                                + guestID + " (This person is a returning guest)");
                    } else
                    {
                        writer.println(lastName + ", " + firstName + " - Guest ID: "
                                + guestID);
                    }
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

    public ArrayList<RoomAvaBookConstructor> getCheckAvaRoom(String roomID)
    { //tjekker værelsesledighed
        Connection conn = null;
        Statement stmt = null;
        ArrayList<RoomAvaBookConstructor> RoomAvailability = new ArrayList<>();
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

            rs = stmt.executeQuery("SELECT ROOMS.ROOMID, ROOMS.ROOMTYPE, "
                    + "ROOMS.ROOMPRICE, BOOKROOM.DATEFROM, BOOKROOM.DATETO"
                    + " FROM BOOKROOM INNER JOIN ROOMS ON BOOKROOM.ROOMID = '" + roomID + "'");

            while (rs.next())
            {
                String rsRoomID = rs.getString("RoomID");
                String rsRoomType = rs.getString("RoomType");
                String rsDateFrom = rs.getString("dateFrom");
//                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                RoomAvaBookConstructor avaRoom = new RoomAvaBookConstructor(rsRoomID, rsDateFrom,
                        "0", rsDateTo, rsRoomType);
                RoomAvailability.add(avaRoom);
            }
            return RoomAvailability;
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

    public ArrayList<String> getRoomsFromType(String roomType)
    { //sender RoomID'er tilbage afhængig af type
        Connection conn = null;
        Statement stmt = null;
        ArrayList<String> RoomIDFromRoomType = new ArrayList<>();
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

            rs = stmt.executeQuery("SELECT ROOMID FROM ROOMS "
                    + "WHERE UPPER (ROOMTYPE) = UPPER ('" + roomType + "')");

            while (rs.next())
            {
                String rsRoomID = rs.getString("RoomID");
                RoomIDFromRoomType.add(rsRoomID);
            }
            return RoomIDFromRoomType;
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

    public ArrayList<BookedOverviewConstructor> getBookedOverview(String guestID)
    { //returnerer gæstens facilitetsbookinger
        Connection conn = null;
        Statement stmt = null;
        ArrayList<BookedOverviewConstructor> bookOverviewForGuest = new ArrayList<>();
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

            rs = stmt.executeQuery("SELECT FACBOOK.GUESTID, FACBOOK.FACID, "
                    + "FACILITY.FACTYPE, FACBOOK.FACDATE, FACBOOK.TIMESTART, FACBOOK.TIMEEND "
                    + "FROM FACBOOK INNER JOIN FACILITY ON FACBOOK.FACID = FACILITY.FACID "
                    + "WHERE FACBOOK.GUESTID='" + guestID + "' ORDER BY FACBOOK.FACDATE");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsFacID = rs.getString("FacID");
                String rsFacType = rs.getString("FacType");
                String rsFacDate = rs.getString("FacDate");
                String rsTimeStart = rs.getString("TimeStart");
                String rsTimeEnd = rs.getString("TimeEnd");
                BookedOverviewConstructor bookOverview = new BookedOverviewConstructor(rsGuestID, rsFacID, rsFacType, rsFacDate, rsTimeStart, rsTimeEnd);
                bookOverviewForGuest.add(bookOverview);
            }
            return bookOverviewForGuest;
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

    RoomTypeIDConstructor getRoomInfoFromRoomID(String roomID)
    {
        //Gets RoomID and returns an object containing RoomID and RoomType, using the RoomTypeIDConstructor...
        Connection conn = null;
        Statement stmt = null;
        RoomTypeIDConstructor rtidc = new RoomTypeIDConstructor("", "", "");
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

            rs = stmt.executeQuery("SELECT ROOMS.ROOMID, ROOMS.ROOMTYPE, ROOMS.ROOMPRICE FROM ROOMS WHERE ROOMID = '" + roomID + "'");

            if (rs.next())
            {
                String rsRoomID = rs.getString("RoomID");
                String rsRoomType = rs.getString("RoomType");
                String rsRoomPrice = rs.getString("RoomPrice");
                rtidc = new RoomTypeIDConstructor(rsRoomID, rsRoomType, rsRoomPrice);
            }
            return rtidc;
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
    
    public ArrayList<PositionOverviewConstructor> getWaitlistPosition(String date, String timeStart, 
            String timeEnd, String facility)
    {
        //Gets RoomID and returns an object containing RoomID and RoomType, using the RoomTypeIDConstructor...
        Connection conn = null;
        Statement stmt = null;
        ArrayList<PositionOverviewConstructor> posOverviewForGuest = new ArrayList<>();
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

            rs = stmt.executeQuery("SELECT WAITLIST.GUESTID, GUEST.GUESTLASTNAME, GUEST.GUESTFIRSTNAME " +
                "FROM WAITLIST INNER JOIN FACILITY ON WAITLIST.FACID = FACILITY.FACID " 
                    + "INNER JOIN GUEST ON WAITLIST.GUESTID = GUEST.GUESTID " 
                    + "WHERE WAITLIST.WFACDATE = '"+date+"' AND WAITLIST.WTIMESTART = '"+timeStart+"' " 
                    + "AND WAITLIST.WTIMEEND = '"+timeEnd+"' AND FACILITY.FACTYPE = '"+facility+"'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                String rsLastName = rs.getString("GuestLastName");
                String rsFirstName = rs.getString("GuestFirstName");
                
                PositionOverviewConstructor posOverview = new PositionOverviewConstructor(rsGuestID, rsLastName, rsFirstName);
                posOverviewForGuest.add(posOverview);             
            }
            return posOverviewForGuest;
        } catch (SQLException se)
        {
            se.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try {
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se){}
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
        return null;
    }
    
    public ArrayList<GetfacAvailabilityConstructor> getfacAvail(String facID, String facDate, String timeStart, String timeEnd)
    {
        //Gets RoomID and returns an object containing RoomID and RoomType, using the RoomTypeIDConstructor...
        Connection conn = null;
        Statement stmt = null;
        ArrayList<GetfacAvailabilityConstructor> facAvail = new ArrayList<GetfacAvailabilityConstructor>();
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

            rs = stmt.executeQuery("SELECT GUESTID FROM FACBOOK WHERE FACID='"+facID+"' AND "
                    + "FACDATE='"+facDate+"' AND TIMESTART='"+timeStart+"' AND "
                    + "TIMEEND='"+timeEnd+"'");

            while (rs.next())
            {
                String rsGuestID = rs.getString("GuestID");
                
                GetfacAvailabilityConstructor posOverview = new GetfacAvailabilityConstructor(rsGuestID);
                facAvail.add(posOverview);             
            }
            return facAvail;
        } catch (SQLException se)
        {
            se.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try {
                if (stmt != null)
                {
                    conn.close();
                }
            } catch (SQLException se){}
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Done.");
        return null;
    }
}
