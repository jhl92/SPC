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
public class Facilitet_GUITest
{
    
    public Facilitet_GUITest()
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

    @Test
    public void testDoubleBook() {
        System.out.println("doubleBook");
        String cfacID = "1";
        String cfacDate = "12-12-12";
        String ctimeStart = "11.00";
        String ctimeEnd = "12.00";
        Facilitet_GUI instance = new Facilitet_GUI();
        boolean expResult = false;
        boolean result = instance.doubleBook(cfacID, cfacDate, ctimeStart, ctimeEnd);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testConvertFac() {
        System.out.println("convertFac");
        String entireBooking = "Facility: BADMINTON, Date: 12-12-12, From: 10.00,"
                + " To: 11.00";
        Facilitet_GUI instance = new Facilitet_GUI();
        String expResult = "1";
        String result = instance.convertFac(entireBooking);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Facilitet_GUI.main;
//        //fail("The test case is a prototype.");
//    }
    
}
