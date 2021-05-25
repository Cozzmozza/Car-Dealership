package Vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Petrol");
        tyres = new Tyres("Dunlop");
        car = new Car(1000.00, "blue", engine, tyres, 5);
    }

    @Test
    public void canGetPrice(){
        assertEquals(1000.00, car.getPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("blue", car.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void canGetSeats(){
        assertEquals(5, car.getSeats());
    }

    @Test
    public void canGetEngineType(){
        assertEquals("Petrol", car.getEngine().getEngineType());
    }

    @Test
    public void canGetTyreBrand(){
        assertEquals("Dunlop", car.getTyres().getBrand());
    }
}
