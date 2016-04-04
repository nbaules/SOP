package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {
    
    List<Part> parts = new ArrayList<>();
    
    public void addPart(Part part) {
        if (part == null) {
            return;
        }
        
        parts.add(part);
    }
    
    public DoubleWrapperFactory getPrice() {
        DoubleWrapperFactory price = DoubleWrapperFactory.createDoubleWrapperWithDouble(0.0);

        for (Part part: parts) {
            price = price.plus(part.getPrice());
        }
        
        return price;
    }
    
    public BooleanWrapperFactory isComplete() {
        if (this.parts.size() < 4) {
            return BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        }
        
        BooleanWrapperFactory hasCasing = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasProcessor = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMemory = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMotherboard = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        
        for (Part part: parts) {
            hasCasing = (hasCasing.booleanValue()) ? hasCasing : part.isCasing();
            hasProcessor = (hasProcessor.booleanValue()) ? hasProcessor : part.isProcessor();
            hasMemory = (hasMemory.booleanValue()) ? hasMemory : part.isProcessor();
            hasMotherboard = (hasMotherboard.booleanValue()) ? hasMotherboard : part.isProcessor();
        }
        
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(hasCasing.booleanValue() && hasProcessor.booleanValue() && hasMemory.booleanValue() && hasMotherboard.booleanValue());
    }
}