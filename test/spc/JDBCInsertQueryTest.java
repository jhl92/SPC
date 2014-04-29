/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class JDBCInsertQueryTest
{
    
    public JDBCInsertQueryTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of JDBCInsertRoom method, of class JDBCInsertQuery.
     */
    @Test
    public void testJDBCInsertRoom() throws Exception
    {
        System.out.println("JDBCInsertRoom");
        String guestID = "12345";
        String roomID = "001";
        String empID = "e05";
        String dateFrom = "12-12-12";
        String noOfNights = "2";
        String dateTo = "14-12-12";
        String roomAvailability = "N";
        String guestFirstName = "Junheng";
        String guestLastName = "Li";
        String gCountry = "China";
        String gPhone = "25212412";
        String gMail = "test@test.dk";
        String returnGuest = "N";
        JDBCInsertQuery instance = new JDBCInsertQuery();
        instance.JDBCInsertRoom(guestID, roomID, empID, dateFrom, noOfNights, 
                dateTo, roomAvailability, guestFirstName, guestLastName, 
                gCountry, gPhone, gMail, returnGuest);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JDBCInsertFacility method, of class JDBCInsertQuery.
     */
    @Test
    public void testJDBCInsertFacility()
    {
        System.out.println("JDBCInsertFacility");
        String guestID = "12345";
        String facID = "1";
        String facDate = "12-12-12";
        String timeStart = "10.00";
        String timeEnd = "11.00";
        String ins = "N";
        JDBCInsertQuery instance = new JDBCInsertQuery();
        instance.JDBCInsertFacility(guestID, facID, facDate, timeStart, 
                timeEnd, ins);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JDBCInsertWait method, of class JDBCInsertQuery.
     */
    @Test
    public void testJDBCInsertWait()
    {
        System.out.println("JDBCInsertWait");
        String guestID = "12345";
        String facID = "1";
        String timeStart = "8.00";
        String timeEnd = "9.00";
        String facDate = "12-12-12";
        JDBCInsertQuery instance = new JDBCInsertQuery();
        instance.JDBCInsertWait(guestID, facID, timeStart, timeEnd, facDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JDBCInsertInstructorCost method, of class JDBCInsertQuery.
     */
    @Test
    public void testJDBCInsertInstructorCost()
    {
        System.out.println("JDBCInsertInstructorCost");
        String guestID = "12345";
        String noOfHours = "1";
        int facID = 1;
        JDBCInsertQuery instance = new JDBCInsertQuery();
        instance.JDBCInsertInstructorCost(guestID, noOfHours, facID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
