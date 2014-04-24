/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

/**
 *
 * @author Jonas
 */
public class PositionOverviewConstructor
{
    private String guestID, firstName, lastName;
    //private String pos, facType, timeStart, timeEnd, facDate;

    public String getGuestID()
    {
        return guestID;
    }

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public PositionOverviewConstructor(String guestID, String firstName, String lastName)
    {
        this.guestID = guestID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
