package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {
    
    List<Part> parts = new ArrayList<>();
    
    public void addPart(Part p) {
        parts.add(p);
    }
    
    public double getPrice() {
        double price = 0.0;

        for (Part part: parts) {
            price = price + part.getPrice();
        }
        
        return price;
    }

    public boolean hasCasing() {
        return parts.map { $0.type }.contains("Casing");

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
            if (part.getType().equals("Casing")) {
                hasCasing = true;
                continue;
            }
            if (part.getType().equals("Processor")) {
                hasProcessor = true;
                continue;
            }
            if (part.getType().equals("Memory")) {
                hasMemory = true;
                continue;
            }
            if (part.getType().equals("Motherboard")) {
                hasMotherboard = true;
                continue;
            }
        }
        
        return hasCasing && hasProcessor && hasMemory && hasMotherboard;
    }
}
