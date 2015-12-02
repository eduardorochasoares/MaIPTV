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
public class EndUserInfo {
    private PermissionLevel permissionLevel;
    private ControlledUserInfo controlledUserInfo;
    private GenericUserInfo genericUserInfo;
    
   
    /**
     * @return the permissionLevel
     */
    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

    /**
     * @param permissionLevel the permissionLevel to set
     */
    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    /**
     * @return the controlledUserInfo
     */
    public ControlledUserInfo getControlledUserInfo() {
        return controlledUserInfo;
    }

    /**
     * @param controlledUserInfo the controlledUserInfo to set
     */
    public void setControlledUserInfo(ControlledUserInfo controlledUserInfo) {
        this.controlledUserInfo = controlledUserInfo;
    }

    /**
     * @return the genericUserInfo
     */
    public GenericUserInfo getGenericUserInfo() {
        return genericUserInfo;
    }

    /**
     * @param genericUserInfo the genericUserInfo to set
     */
    public void setGenericUserInfo(GenericUserInfo genericUserInfo) {
        this.genericUserInfo = genericUserInfo;
    }

    
    
}
