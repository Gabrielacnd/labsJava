package aut.isp.lab4.exercise2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishFeederTest {
 @Test
 public void testFillUp(){
     FishFeeder obj=new FishFeeder("eheim","3581");
     assertEquals("The automatic fish feeder is already full",obj.fillUp());
     obj.feed();
     assertEquals("The automatic fish feeder is again full",obj.fillUp());
 }
 @Test
    public void testToString(){
     FishFeeder obj2=new FishFeeder("eheim","0000");
     assertEquals("FishFeeder{ manufacturer=eheim, model=0000, Current numberMeals=14}",obj2.toString());
 }
}
