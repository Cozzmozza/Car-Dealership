import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuyVehicle {

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


    public void addVehicle(Vehicle vehicle){
        carType.add(vehicle);
    }

    public void reduceMoney(Vehicle vehicle) {
        this.till.reduceBalance(vehicle.getPrice());
    }

    public void buyVehicle(Vehicle vehicle){
        addVehicle(vehicle);
        reduceMoney(vehicle);
    }
}
