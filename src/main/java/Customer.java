import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuyVehicle {

    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles= new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addVehicle(Vehicle vehicle){
        ownedVehicles.add(vehicle);
    }

    public void reduceMoney(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
    }

    public void buyVehicle(Vehicle vehicle){
        addVehicle(vehicle);
        reduceMoney(vehicle);
    }
}
