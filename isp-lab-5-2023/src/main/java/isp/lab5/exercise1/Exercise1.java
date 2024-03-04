package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise1 {

    static ProductCategory catg=ProductCategory.TOYS;


    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        Address addr=new Address("Baia de Fier","Bucuresti");
        Order ord1=new Order("10",data,(Double)168.6);
        Customer customer1=new Customer("23bn","Mircea Ionescu","072465896378",addr);
       Product prod=new Product("12B","car",(double)20.5,catg,customer1,ord1);
        if(catg.equals(ProductCategory.valueOf("TOYS")))
            System.out.println((prod.toString()));
    }
}
