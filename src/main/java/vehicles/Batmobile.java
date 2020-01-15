package vehicles;

import components.EngineType;
import components.TyreType;

public class Batmobile extends Vehicle {
    private String weapons;


    public Batmobile(String name, String colour, EngineType engine, TyreType tyre, Double price, String  weapons){
        super(name, colour, engine, tyre, price);
        this.weapons = weapons;
    }


    public String getWeapons() {
        return this.weapons;
    }
}
