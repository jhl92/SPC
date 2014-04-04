/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Jonas
 */
public class RoomAvaBookConstructor
{
    private String roomID, dateFrom, noOfNights, dateTo, roomAva;

    public String getNoOfNights()
    {
        return noOfNights;
    }

    public void setNoOfNights(String noOfNights)
    {
        this.noOfNights = noOfNights;
    }

    public String getRoomID()
    {
        return roomID;
    }

    public String getDateFrom()
    {
        return dateFrom;
    }

    public String getDateTo()
    {
        return dateTo;
    }

    public String getRoomAva()
    {
        return roomAva;
    }

    public void setRoomID(String roomID)
    {
        this.roomID = roomID;
    }

    public void setDateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(String dateTo)
    {
        this.dateTo = dateTo;
    }

    public void setRoomAva(String roomAva)
    {
        this.roomAva = roomAva;
    }

    public RoomAvaBookConstructor(String roomID, String dateFrom, String noOfNights, String dateTo, String roomAva)
    {
        this.roomID = roomID;
        this.dateFrom = dateFrom;
        this.noOfNights = noOfNights;
        this.dateTo = dateTo;
        this.roomAva = roomAva;
    }
    
}
