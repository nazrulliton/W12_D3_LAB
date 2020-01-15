package dealership;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private double till;
    private ArrayList<Vehicle> stock;

    public  Dealership(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }
    public int getStockSize(){
        return stock.size();
    }
}
