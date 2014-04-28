/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zarkov
 */
public class CasablancaGUITest
{
    
    public CasablancaGUITest()
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
    
    @Before
    public void setUp()
    {
    
    }
    @After
    public void tearDown()
    {
    }

    /**
     * Test of main method, of class CasablancaGUI.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        CasablancaGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setupDialogBooking method, of class CasablancaGUI.
     */
    @Test
    public void testSetupDialogBooking()
    {
        System.out.println("setupDialogBooking");
        CasablancaGUI instance = new CasablancaGUI();
        instance.setupDialogBooking();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setupDialogSetupOverview method, of class CasablancaGUI.
     */
    @Test
    public void testSetupDialogSetupOverview()
    {
        System.out.println("setupDialogSetupOverview");
        String r1 = "";
        String r2 = "";
        String r3 = "";
        String r4 = "";
        String r5 = "";
        String r6 = "";
        String r7 = "";
        String r8 = "";
        CasablancaGUI instance = new CasablancaGUI();
        instance.setupDialogSetupOverview(r1, r2, r3, r4, r5, r6, r7, r8);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
