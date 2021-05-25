import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ArrayList<Vehicle> testArraylist;
    private Car car;
    private Tyres tyres;
    private Engine engine;


    @Before
    public void setUp(){
        customer = new Customer(2000.00);
        engine = new Engine("Petrol");
        tyres = new Tyres("Dunlop");
        car = new Car(1000.00, "Red", engine, tyres, 5) ;
    }

    @Test
    public void hasMoney() {
        assertEquals(2000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void hasOwnedVehiclesList() {
        testArraylist = new ArrayList<>();
        assertEquals(testArraylist, customer.getOwnedVehicles());
    }

    @Test
    public void canAddVehicle() {
        testArraylist = new ArrayList<>();
        customer.addVehicle(car);
        testArraylist.add(car);
        assertEquals(testArraylist, customer.getOwnedVehicles());
    }
}
