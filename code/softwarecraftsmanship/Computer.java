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

    public BooleanWrapperFactory hasCasing() {
        for (Part part: parts) {

        }

        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
    }
    
    public BooleanWrapperFactory isComplete() {
        BooleanWrapperFactory hasCasing = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasProcessor = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMemory = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMotherboard = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        
        for (Part part: parts) {
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Casing"))) {
                hasCasing = BooleanWrapperFactory.createBooleanWrapperWithBoolean(true);
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Processor"))) {
                hasProcessor = BooleanWrapperFactory.createBooleanWrapperWithBoolean(true);
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Memory"))) {
                hasMemory = BooleanWrapperFactory.createBooleanWrapperWithBoolean(true);
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Motherboard"))) {
                hasMotherboard = BooleanWrapperFactory.createBooleanWrapperWithBoolean(true);
            }
        }
        
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(hasCasing.booleanValue() && hasProcessor.booleanValue() && hasMemory.booleanValue() && hasMotherboard.booleanValue());
    }
}