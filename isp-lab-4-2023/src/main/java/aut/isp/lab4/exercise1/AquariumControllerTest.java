package aut.isp.lab4.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AquariumControllerTest {
    @Test
    public void  testToString(){
        AquariumController aquarium= AquariumController.getInstance("Juwel","34E");
        aquarium.setCurrentTime((float)15.20);
        assertEquals("AquariumController{ manufacturer=Juwel, model=34E current time=15.2}",aquarium.toString());


    }


}
