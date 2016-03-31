package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {
    
    List<Part> parts = new ArrayList<>();
    
    public int numberOfParts() {
        int count = 0;
        for (Part part: parts) { 
            count++;
        }
        return count;
    }
    
    public void addPart(Part p) {
        parts.add(p);
    }
    
    public double getPrice() {
        double price = 0.0;
        
        for (int i = 0; i < numberOfParts(); i++) {
            Part part = parts.get(i);
            price += part.getPrice();
        }
        
        return price;
    }
    
    public boolean isComplete() {
        boolean hasCasing = false;
        boolean hasProcessor = false;
        boolean hasMemory = false;
        boolean hasMotherboard = false;
        
        for (Part part: parts) {
            if (part.getType().equals("Casing")) {
                hasCasing = true;
            }
            else {
                if (part.getType().equals("Processor")) {
                    hasProcessor = true;
                }
                else {
                    if (part.getType().equals("Memory")) {
                        hasMemory = true;
                    }
                    else {
                        if (part.getType().equals("Motherboard")) {
                            hasMotherboard = true;
                        }
                    }
                }
            }
        }
        
        if (!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard) {
            return false;
        } else {
            return true;
        }
    }
}
