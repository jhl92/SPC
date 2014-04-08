/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Jonas
 */
public class BookedOverviewConstructor
{
    private String guestID, facID, facType, facDate, timeStart, timeEnd;

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public void setFacID(String facID)
    {
        this.facID = facID;
    }

    public void setFacType(String facType)
    {
        this.facType = facType;
    }

    public void setFacDate(String facDate)
    {
        this.facDate = facDate;
    }

    public void setTimeStart(String timeStart)
    {
        this.timeStart = timeStart;
    }

    public void setTimeEnd(String timeEnd)
    {
        this.timeEnd = timeEnd;
    }

    public String getGuestID()
    {
        return guestID;
    }

    public String getFacID()
    {
        return facID;
    }

    public String getFacType()
    {
        return facType;
    }

    public String getFacDate()
    {
        return facDate;
    }

    public String getTimeStart()
    {
        return timeStart;
    }

    public String getTimeEnd()
    {
        return timeEnd;
    }

    public BookedOverviewConstructor(String guestID, String facID, String facType, String facDate, String timeStart, String timeEnd)
    {
        this.guestID = guestID;
        this.facID = facID;
        this.facType = facType;
        this.facDate = facDate;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }
    
          
}
