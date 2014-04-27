/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

import java.util.Calendar;

/**
 *
 * @author Junheng Li
 */
public class SPC
{
    private Calendar ovcStartDate = Calendar.getInstance();
    
    public Calendar getOVCdate()
    {
        return ovcStartDate;
    }
    
    public void setOVCdate(Calendar date)
    {
        this.ovcStartDate = date;
    }
}
