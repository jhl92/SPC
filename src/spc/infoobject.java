/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

/**
 *
 * @author Junheng Li
 */
class infoobject
{
    private String roomID, roomType, Price, country, dateFrom,
            dateTo, lastName, firstName, contactPhone, email, returning;

    public infoobject(String lastName, String firstName, String country, String contactPhone, String email, String returning, String roomID, String dateFrom, String dateTo, String Price)
    {
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
