/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Junheng Li
 */
class InfoObjectConstructor
{
    private String guestID, guestLastName, guestFirstname, country, contanctPhone, email,
            returning, instructorBill, roomID, dateFrom, noOfNights, dateTo;

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public void setGuestLastName(String guestLastName)
    {
        this.guestLastName = guestLastName;
    }

    public void setGuestFirstname(String guestFirstname)
    {
        this.guestFirstname = guestFirstname;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setContanctPhone(String contanctPhone)
    {
        this.contanctPhone = contanctPhone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setReturning(String returning)
    {
        this.returning = returning;
    }

    public void setInstructorBill(String instructorBill)
    {
        this.instructorBill = instructorBill;
    }

    public void setRoomID(String roomID)
    {
        this.roomID = roomID;
    }

    public void setDateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
    }

    public void setNoOfNights(String noOfNights)
    {
        this.noOfNights = noOfNights;
    }

    public void setDateTo(String dateTo)
    {
        this.dateTo = dateTo;
    }

    public String getGuestID()
    {
        return guestID;
    }

    public String getGuestLastName()
    {
        return guestLastName;
    }

    public String getGuestFirstname()
    {
        return guestFirstname;
    }

    public String getCountry()
    {
        return country;
    }

    public String getContanctPhone()
    {
        return contanctPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public String getReturning()
    {
        return returning;
    }

    public String getInstructorBill()
    {
        return instructorBill;
    }

    public String getRoomID()
    {
        return roomID;
    }

    public String getDateFrom()
    {
        return dateFrom;
    }

    public String getNoOfNights()
    {
        return noOfNights;
    }

    public String getDateTo()
    {
        return dateTo;
    }

    public InfoObjectConstructor(String guestID, String guestLastName, String guestFirstname, String country, String contanctPhone, String email, String returning, String instructorBill, String roomID, String dateFrom, String noOfNights, String dateTo)
    {
        this.guestID = guestID;
        this.guestLastName = guestLastName;
        this.guestFirstname = guestFirstname;
        this.country = country;
        this.contanctPhone = contanctPhone;
        this.email = email;
        this.returning = returning;
        this.instructorBill = instructorBill;
        this.roomID = roomID;
        this.dateFrom = dateFrom;
        this.noOfNights = noOfNights;
        this.dateTo = dateTo;
    }

}
