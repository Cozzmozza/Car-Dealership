import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> carType;
    private Till till;

    public Dealership(ArrayList<Vehicle> carType, Till till) {
        this.carType = carType;
        this.till = till;
    }

    public ArrayList<Vehicle> getCarType() {
        return carType;
    }

    public Till getTill() {
        return till;
    }
}
