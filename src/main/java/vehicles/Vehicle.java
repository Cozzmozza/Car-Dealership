package vehicles;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(double price, String colour, Engine engine, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
