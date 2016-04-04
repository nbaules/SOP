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
public class IntWrapperFactory {
    private int _int;
    
    private IntWrapperFactory() {
        
    }
    
    public void createIntWrapperWithInt(int _int) {
        this._int = _int;
    }
    
    public int intValue() {
        return this._int;
    }
}
