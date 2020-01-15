package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;


    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getNumOfVehiclesOwned(){
        return ownedVehicles.size();
    }
}
