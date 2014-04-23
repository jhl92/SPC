/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Junheng Li
 */
public class GetfacAvailabilityConstructor
{
    private String guestID;

    public String getGuestID()
    {
        return guestID;
    }

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public GetfacAvailabilityConstructor(String guestID)
    {
        this.guestID = guestID;
    }
}
