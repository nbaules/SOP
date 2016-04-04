package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final StringWrapperFactory type;
    private final StringWrapperFactory title;
    private final DoubleWrapperFactory price;
    private StringWrapperFactory subtype = null;
    private IntWrapperFactory size = IntWrapperFactory.createIntWrapperWithInt(-1);
    private DoubleWrapperFactory speed = DoubleWrapperFactory.createDoubleWrapperWithDouble(-1.0);
    
    public Part(StringWrapperFactory type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntWrapperFactory size, DoubleWrapperFactory speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
        this.speed = speed;
    }
    
    // Memory
    public Part(StringWrapperFactory type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntWrapperFactory size) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
    }
    
    // Casing
    public Part(StringWrapperFactory type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
    }
    
    // Processor
    public Part(StringWrapperFactory type, StringWrapperFactory title, DoubleWrapperFactory price, DoubleWrapperFactory speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.speed = speed;
    }
    
    // Motherboard
    public Part(StringWrapperFactory type, StringWrapperFactory title, DoubleWrapperFactory price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    
    public DoubleWrapperFactory getPrice() {
        return price;
    }
    
    public BooleanWrapperFactory isCasing() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(StringWrapperFactory.createStringWrapperWithString("Casing")));
    }
    
    public BooleanWrapperFactory isProcessor() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(StringWrapperFactory.createStringWrapperWithString("Processor")));
    }
    
    public BooleanWrapperFactory isMemory() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(StringWrapperFactory.createStringWrapperWithString("Memory")));
    }
    
    public BooleanWrapperFactory isMotherboard() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(StringWrapperFactory.createStringWrapperWithString("Motherboard")));
    }
}
