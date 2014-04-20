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
public class RoomTypeIDConstructor
{
    private String roomID, roomType;
    public RoomTypeIDConstructor(String roomID, String roomType)
    {
        this.roomID = roomID;
        this.roomType = roomType;
    }

    public String getRoomID()
    {
        return roomID;
    }

    public String getRoomType()
    {
        return roomType;
    }
    
}
