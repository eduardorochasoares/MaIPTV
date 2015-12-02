/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeasurementRequestXML;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementPeriod {
   private List<DayOfTheWeek> dayOfTheWeek = new ArrayList<>();
   private Time startTime;
   private Time endTime;

    /**
     * @return the dayOfTheWeek
     */
    public List<DayOfTheWeek> getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    /**
     * @param dayOfTheWeek the dayOfTheWeek to set
     */
    public void setDayOfTheWeek(List<DayOfTheWeek> dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    /**
     * @return the startTime
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
