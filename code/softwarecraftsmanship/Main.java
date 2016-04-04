package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.addPart(new Part(
                StringWrapperFactory.createStringWrapperWithString("Casing"), 
                StringWrapperFactory.createStringWrapperWithString("Cooler Master Centurion 6"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(49.50), 
                StringWrapperFactory.createStringWrapperWithString("Midi tower")));
        computer.addPart(new Part(
                StringWrapperFactory.createStringWrapperWithString("Processor"), 
                StringWrapperFactory.createStringWrapperWithString("Intel i7-4790"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(295.0), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(3.6)));
        computer.addPart(new Part(
                StringWrapperFactory.createStringWrapperWithString("Memory"), 
                StringWrapperFactory.createStringWrapperWithString("G.SKILL Ripjaws X Series"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(99.99), 
                StringWrapperFactory.createStringWrapperWithString("DDR3"), 
                IntWrapperFactory.createIntWrapperWithInt(16)));
        computer.addPart(new Part(
                StringWrapperFactory.createStringWrapperWithString("Motherboard"), 
                StringWrapperFactory.createStringWrapperWithString("MSI H97 PC MATE - Socket 1150 - ATX"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(89.0)));
        
        if (computer.isComplete()) {
            System.out.println("Total price is EUR " + computer.getPrice());
        }
        else {
            System.out.println("Your computer is not ready yet...");
        }
    }
}
