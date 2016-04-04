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

    public boolean hasCasing() {
        for (Part part: parts) {

        }

        return false;
    }
    
    public boolean isComplete() {
        boolean hasCasing = false;
        boolean hasProcessor = false;
        boolean hasMemory = false;
        boolean hasMotherboard = false;
        
        for (Part part: parts) {
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Casing"))) {
                hasCasing = true;
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Processor"))) {
                hasProcessor = true;
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Memory"))) {
                hasMemory = true;
                continue;
            }
            if (part.getType().equals(StringWrapperFactory.createStringWrapperWithString("Motherboard"))) {
                hasMotherboard = true;
            }
        }
        
        return hasCasing && hasProcessor && hasMemory && hasMotherboard;
    }
}