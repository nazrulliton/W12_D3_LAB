package vehicles;

import components.EngineType;
import components.TyreType;

public abstract class Vehicle {
    private String name;
    private String colour;
    private EngineType engine;
    private TyreType tyre;
    private Double price;


    public Vehicle(String name, String colour, EngineType engine, TyreType tyre, Double price ){
        this.name = name;
        this.colour = colour;
        this.tyre = tyre;
        this.engine = engine;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public EngineType getEngine() {
        return engine;
    }

    public TyreType getTyre() {
        return tyre;
    }

    public Double getPrice() {
        return price;
    }
}
