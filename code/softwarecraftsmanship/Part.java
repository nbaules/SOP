package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartType type;
    private final StringWrapperFactory title;
    private final DoubleWrapperFactory price;
    private StringWrapperFactory subtype = null;
    private IntWrapperFactory size = IntWrapperFactory.createIntWrapperWithInt(-1);
    private DoubleWrapperFactory speed = DoubleWrapperFactory.createDoubleWrapperWithDouble(-1.0);
    
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntWrapperFactory size, DoubleWrapperFactory speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
        this.speed = speed;
    }
    
    // Memory
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntWrapperFactory size) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
    }
    
    // Casing
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
    }
    
    // Processor
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, DoubleWrapperFactory speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.speed = speed;
    }
    
    // Motherboard
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    
    public DoubleWrapperFactory getPrice() {
        return price;
    }
    
    public BooleanWrapperFactory isCasing() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.CASING));
    }
    
    public BooleanWrapperFactory isProcessor() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.PROCESSOR));
    }
    
    public BooleanWrapperFactory isMemory() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.MEMORY));
    }
    
    public BooleanWrapperFactory isMotherboard() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.MOTHERBOARD));
    }
}
