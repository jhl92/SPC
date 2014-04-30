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
    private String guestID, facID, facType, facDate, timeStart, timeEnd, instructor;

    public String getGuestID()
    {
        return guestID;
    }

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public String getFacID()
    {
        return facID;
    }

    public void setFacID(String facID)
    {
        this.facID = facID;
    }

    public String getFacType()
    {
        return facType;
    }

    public void setFacType(String facType)
    {
        this.facType = facType;
    }

    public String getFacDate()
    {
        return facDate;
    }

    public void setFacDate(String facDate)
    {
        this.facDate = facDate;
    }

    public String getTimeStart()
    {
        return timeStart;
    }

    public void setTimeStart(String timeStart)
    {
        this.timeStart = timeStart;
    }

    public String getTimeEnd()
    {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd)
    {
        this.timeEnd = timeEnd;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }

    public BookedOverviewConstructor(String guestID, String facID, String facType, String facDate, String timeStart, String timeEnd, String instructor)
    {
        this.guestID = guestID;
        this.facID = facID;
        this.facType = facType;
        this.facDate = facDate;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.instructor = instructor;
    }      
}
