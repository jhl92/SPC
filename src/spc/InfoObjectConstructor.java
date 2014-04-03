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
    private String guestID, roomID, Price, country, dateFrom,
            dateTo, lastName, firstName, contactPhone, email, returning;

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

    public String getGuestID()
    {
        return guestID;
    }

    public InfoObjectConstructor(String guestID, String lastName, String firstName, String country, String contactPhone, String email, String returning, String roomID, String dateFrom, String dateTo)
    {
        this.guestID = guestID;
        this.roomID = roomID;
        this.Price = Price;
        this.country = country;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.contactPhone = contactPhone;
        this.email = email;
        this.returning = returning;
    }

    public void setRoomID(String roomID)
    {
        this.roomID = roomID;
    }

    public void setPrice(String Price)
    {
        this.Price = Price;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setDateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(String dateTo)
    {
        this.dateTo = dateTo;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setContactPhone(String contactPhone)
    {
        this.contactPhone = contactPhone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setReturning(String returning)
    {
        this.returning = returning;
    }

    public String getRoomID()
    {
        return roomID;
    }

    public String getPrice()
    {
        return Price;
    }

    public String getDateFrom()
    {
        return dateFrom;
    }

    public String getDateTo()
    {
        return dateTo;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public String getCountry()
    {
        return country;
    }

    public String getContactPhone()
    {
        return contactPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public String getReturning()
    {
        return returning;
    }
}
