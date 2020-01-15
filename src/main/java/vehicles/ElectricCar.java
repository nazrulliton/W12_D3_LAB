package vehicles;

import components.EngineType;
import components.TyreType;

public class ElectricCar extends Vehicle{
    private int numOfWindows;

    public ElectricCar(String name, String colour, EngineType engine, TyreType tyre, Double price, int numOfWindows){
        super(name, colour, engine, tyre, price);
        this.numOfWindows = numOfWindows;
    }

    public int getNumOfTires() {
        return this.numOfWindows;
    }
}
