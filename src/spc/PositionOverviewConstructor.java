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
    private String pos, facType, timeStart, timeEnd, facDate;

    public String getPos()
    {
        return pos;
    }

    public void setPos(String pos)
    {
        this.pos = pos;
    }

    public String getFacType()
    {
        return facType;
    }

    public void setFacType(String facType)
    {
        this.facType = facType;
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

    public String getFacDate()
    {
        return facDate;
    }

    public void setFacDate(String facDate)
    {
        this.facDate = facDate;
    }

    public PositionOverviewConstructor(String pos, String facType, String timeStart, String timeEnd, String facDate)
    {
        this.pos = pos;
        this.facType = facType;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.facDate = facDate;
    }

   

}
