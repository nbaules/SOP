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
    
    private IntWrapperFactory(int _int) {
        this._int = _int;
    }
    
    static public IntWrapperFactory createIntWrapperWithInt(int _int) {
        return new IntWrapperFactory(_int);
    }
    
    public int intValue() {
        return this._int;
    }
    
    public BooleanWrapperFactory smallerThan(IntWrapperFactory iwf) {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this._int < iwf._int);
    }
    
    public IntWrapperFactory plus(IntWrapperFactory iwf) {
        return IntWrapperFactory.createIntWrapperWithInt(this._int + iwf._int);
    }
}
