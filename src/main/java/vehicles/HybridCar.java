package vehicles;

import components.EngineType;
import components.TyreType;

public class HybridCar extends  Vehicle{
    public HybridCar(String name, String colour, EngineType engine, TyreType tyre, Double price){
        super(name, colour, engine, tyre, price);
    }

}
