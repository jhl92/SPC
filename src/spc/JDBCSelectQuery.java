
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


    public ArrayList checkIdAva()
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
                
                while(rs.next()) {
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
    
    public ArrayList<InfoObjectConstructor> getInfoFromGuestID(String guestID){
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
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromFirstName(String firstName){
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
                    + "bookroom.guestid = guest.guestid where guest.guestfirstname ='" 
                    + firstName + "'");
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromLastName(String lastName){
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
                    + "bookroom.guestid = guest.guestid where guest.guestlastname ='" 
                    + lastName + "'");
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromCountry(String country){
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
                    + "bookroom.guestid = guest.guestid where guest.guestcountry ='" 
                    + country + "'");
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromPhone(String phone){
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
                    + "bookroom.guestid = guest.guestid where guest.guestcontactphone ='" 
                    + phone + "'");
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromMail(String mail){
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
                    + "bookroom.guestid = guest.guestid where guest.guestemail ='" 
                    + mail + "'");
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromDateFrom(String dateFrom){
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
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<InfoObjectConstructor> getInfoFromDateTo(String dateTo){
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
           
            while(rs.next()) {
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
            } return guestIDHistory;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    public void printBill(String guestID){
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
                    + " FROM GUEST WHERE GUESTID='"+guestID+"'");
            String guestList = guestID+" - Instructor Bill.txt";
          
            try (PrintWriter writer = new PrintWriter(guestList))
            {
                
                while(rs.next()) {
                String lastName = rs.getString("GUESTLASTNAME");
                String firstName = rs.getString("GUESTFIRSTNAME");
                String cost = rs.getString("INSTRUCTORBILL");
                
                writer.println("Guest ID: "+guestID+"\r\n"+"Name: "
                                +lastName+", "+firstName+"\r\n"+"The current cost for"
                        + " instructions hours: "+cost);  
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
    }
    
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

            rs = stmt.executeQuery("SELECT GUEST.GUESTID, GUEST.GUESTLASTNAME, "
                    + "GUEST.GUESTFIRSTNAME, GUEST.RETURNINGGUEST from "
                    + "GUEST INNER JOIN BOOKROOM ON BOOKROOM.GUESTID=GUEST.GUESTID "
                    + "Where BOOKROOM.DATEFROM = '" + tomorrowDate 
                    + "' ORDER BY GUEST.GUESTLASTNAME");
            System.out.println("Statement acceptet");
            String guestList = tomorrowDate+" - List of Check-ins.txt";
          
            try (PrintWriter writer = new PrintWriter(guestList))
            {
                
                while(rs.next()) {
                String lastName = rs.getString("GUESTLASTNAME");
                String firstName = rs.getString("GUESTFIRSTNAME");
                String guestID = rs.getString("GUESTID");
                String returningGuest = rs.getString("RETURNINGGUEST");
                    if(returningGuest.equals("Y")) {
                        writer.println(lastName+", "+firstName+" - Guest ID: "
                                +guestID+" (This person is a returning guest)");
                    } else { writer.println(lastName+", "+firstName+" - Guest ID: "
                            +guestID); }
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
    
    public ArrayList<RoomAvaBookConstructor> getCheckAvaRoom(String roomID){
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
 
            rs = stmt.executeQuery("SELECT ROOMS.ROOMID, ROOMS.ROOMTYPE, " +
                    "ROOMS.ROOMPRICE, BOOKROOM.DATEFROM, BOOKROOM.DATETO" +
                    "FROM BOOKROOM INNER JOIN ROOMS ON BOOKROOM.ROOMID = '"+roomID+"'");
           
            while (rs.next()) {
                String rsRoomID = rs.getString("RoomID");
                String rsRoomType = rs.getString("RoomType");
                String rsDateFrom = rs.getString("dateFrom");
                String rsNoOfNights = rs.getString("noOfNights");
                String rsDateTo = rs.getString("dateTo");
                RoomAvaBookConstructor avaRoom = new RoomAvaBookConstructor(rsDateFrom,
                        rsNoOfNights, rsDateTo, rsRoomID, rsRoomType);
                RoomAvailability.add(avaRoom);
            }
            return RoomAvailability;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    
    public ArrayList<String> getCheckAvaRoomFromType(String roomType){
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
                    + "WHERE UPPER (ROOMTYPE) = UPPER ('"+roomType+"')");
           
            while (rs.next()) {
                String rsRoomID = rs.getString("RoomID");
                RoomIDFromRoomType.add(rsRoomID);
            } 
            return RoomIDFromRoomType;
        } catch (SQLException se)
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
    public ArrayList<BookedOverviewConstructor> getBookedOverview(String guestID){
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
 
            rs = stmt.executeQuery("SELECT FACBOOK.GUESTID, FACBOOK.FACID, " +
                    "FACILITY.FACTYPE, FACBOOK.FACDATE, FACBOOK.TIMESTART, FACBOOK.TIMEEND " 
                    +"FROM FACBOOK INNER JOIN FACILITY ON FACBOOK.FACID = FACILITY.FACID "
                    +"WHERE FACBOOK.GUESTID='"+guestID+"'");
           
            while (rs.next()) {
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
        { se.printStackTrace(); } 
        catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    conn.close();}
            } catch (SQLException se){}
            try { if (conn != null) {
                    conn.close(); }
            } catch (SQLException se) {
                se.printStackTrace(); }
        } System.out.println("Done.");
            return null;
    }
}
