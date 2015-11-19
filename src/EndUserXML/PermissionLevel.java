/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EndUserXML;

/**
 *
 * @author Principal
 */
public enum PermissionLevel {
    NoInformation(0), OnlyDistinguishability(1), DistinguishabilityGeneric(2), Identify(3);
    private int permission;
    PermissionLevel(int valor) {
        permission = valor;
    }

    /**
     * @return the permission
     */
    public int getPermission() {
        return permission;
    }

    /**
     * @param permission the permission to set
     */
    public void setPermission(int permission) {
        this.permission = permission;
    }
}
