import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Till till;
    private Dealership dealerShip;
    private ArrayList<Vehicle> vehicles;
    private Car car;
    private Car car2;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void before(){
        vehicles = new ArrayList<>();
        engine = new Engine("Petrol");
        tyres = new Tyres("Dunlop");
        car = new Car(2000, "blue", engine, tyres, 5 );
        vehicles.add(car);
        till = new Till(20000.00);
        dealerShip = new Dealership(vehicles, till);
    }

    @Test
    public void hasCar() {
        assertEquals(vehicles, dealerShip.getCarType());
    }

    @Test
    public void hasTill() {
        assertEquals(till, dealerShip.getTill());
    }

    @Test
    public void canBuyVehicle(){
        car2 = new Car(2000, "blue", engine, tyres, 3 );
        dealerShip.buyVehicle(car2);
        ArrayList testArraylist = new ArrayList<>();
        testArraylist.add(car);
        testArraylist.add(car2);
        assertEquals(testArraylist, dealerShip.getCarType());
        assertEquals(18000.00, dealerShip.getTill().getCurrentBalance(), 0.01);
    }

}
