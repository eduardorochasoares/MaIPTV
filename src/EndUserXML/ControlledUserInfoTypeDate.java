/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EndUserXML;

import java.util.Date;

/**
 *
 * @author Principal
 */
public class ControlledUserInfoTypeDate {
    private String value;
    private Date ControlledUserValueDate;

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the ControlledUserValueDate
     */
    public Date getControlledUserValueDate() {
        return ControlledUserValueDate;
    }

    /**
     * @param ControlledUserValueDate the ControlledUserValueDate to set
     */
    public void setControlledUserValueDate(Date ControlledUserValueDate) {
        this.ControlledUserValueDate = ControlledUserValueDate;
    }
}
