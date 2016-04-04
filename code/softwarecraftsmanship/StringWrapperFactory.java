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
public class StringWrapperFactory {
    
    private String string;
    
    private StringWrapperFactory() {
        
    }
    
    public void createStringWrapperWithString(String string) {
        this.string = string;
    }
    
    public String stringValue() {
        return this.string;
    }
}
