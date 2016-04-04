/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

/**
 *
 * @author bas
 */
public class BooleanWrapperFactory {
    private boolean _boolean;
    
    private BooleanWrapperFactory() {
        
    }
    
    public void createBooleanWrapperWithBoolean(boolean _boolean) {
        this._boolean = _boolean;
    }
    
    public boolean booleanValue() {
        return this._boolean;
    }
}
