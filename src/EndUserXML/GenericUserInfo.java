/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EndUserXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class GenericUserInfo {
    private List<GenericUserInfoType> genericUserInfoType;
    
    public GenericUserInfo(){
        genericUserInfoType = new ArrayList<>();
    }

    /**
     * @return the genericUserInfoType
     */
    public List<GenericUserInfoType> getGenericUserInfoType() {
        return genericUserInfoType;
    }

    /**
     * @param genericUserInfoType the genericUserInfoType to set
     */
    public void setGenericUserInfoType(List<GenericUserInfoType> genericUserInfoType) {
        this.genericUserInfoType = genericUserInfoType;
    }
}
