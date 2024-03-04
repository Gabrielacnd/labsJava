package isp.lab3.exercise3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class VehicleTest {
    @Test
    public void testToString(){
    Vehicle veh1=new Vehicle("Audi","A3",180,'D');
    assertEquals("Vehicle{ model=Audi(A3), Speed=180, fuelType=D}",veh1.toString());
    }
}
