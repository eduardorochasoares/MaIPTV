/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EndUserXML;

import java.util.List;

/**
 *
 * @author Principal
 */
public class ControlledUserInfo {
    private List<ControlledUserInfoTypeString> controlledUserInfoTypeString;
    private List<ControlledUserInfoTypeDate> controlledUserInfoTypeDate;
    private List<ControlledUserInfoTypeAddress> controlledUserInfoTypeAdress;
    /**
     * @return the controlledUserInfoTypeString
     */
    public List<ControlledUserInfoTypeString> getControlledUserInfoTypeString() {
        return controlledUserInfoTypeString;
    }

    /**
     * @param controlledUserInfoTypeString the controlledUserInfoTypeString to set
     */
    public void setControlledUserInfoTypeString(List<ControlledUserInfoTypeString> controlledUserInfoTypeString) {
        this.controlledUserInfoTypeString = controlledUserInfoTypeString;
    }

    /**
     * @return the controlledUserInfoTypeDate
     */
    public List<ControlledUserInfoTypeDate> getControlledUserInfoTypeDate() {
        return controlledUserInfoTypeDate;
    }

    /**
     * @param controlledUserInfoTypeDate the controlledUserInfoTypeDate to set
     */
    public void setControlledUserInfoTypeDate(List<ControlledUserInfoTypeDate> controlledUserInfoTypeDate) {
        this.controlledUserInfoTypeDate = controlledUserInfoTypeDate;
    }

    /**
     * @return the controlledUserInfoTypeAdress
     */
    public List<ControlledUserInfoTypeAddress> getControlledUserInfoTypeAdress() {
        return controlledUserInfoTypeAdress;
    }

    /**
     * @param controlledUserInfoTypeAdress the controlledUserInfoTypeAdress to set
     */
    public void setControlledUserInfoTypeAdress(List<ControlledUserInfoTypeAddress> controlledUserInfoTypeAdress) {
        this.controlledUserInfoTypeAdress = controlledUserInfoTypeAdress;
    }
}
