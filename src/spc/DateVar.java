/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

/**
 *
 * @author Zarkov
 */
public class DateVar
{
    private int vDate, vMonth, vYear;
    
    public DateVar(int date, int month, int year)
    {
        this.vDate = date;
        this.vMonth = month;
        this.vYear = year;
    }
    
    public int getDate()
    {
        return vDate;
    }
    
    public int getMonth()
    {
        return vMonth;
    }
    
    public int getYear()
    {
        return vYear;
    }
}
