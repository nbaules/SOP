package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.addPart(new Part("Casing", "Cooler Master Centurion 6", 49.50, "Midi tower"));
        computer.addPart(new Part("Processor", "Intel i7-4790", 295.0, 3.6));
        computer.addPart(new Part("Memory", "G.SKILL Ripjaws X Series", 99.99, "DDR3", 16));
        computer.addPart(new Part("Motherboard", "MSI H97 PC MATE - Socket 1150 - ATX", 89.0));
        
        if (computer.isComplete()) {
            System.out.println("Total price is EUR " + computer.getPrice());
        }
        else {
            System.out.println("Your computer is not ready yet...");
        }
    }
}
