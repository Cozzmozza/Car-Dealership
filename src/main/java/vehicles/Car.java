package vehicles;

import components.Engine;
import components.Tyres;

public class Car extends Vehicle{

    private int seats;

    public Car(double price, String colour, Engine engine, Tyres tyres, int seats) {
        super(price, colour, engine, tyres);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}
