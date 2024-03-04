package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderld;
    private LocalDateTime date;
    private Double totalPrice;
    public Order(String orderld,LocalDateTime date,Double totalPrice){
        this.orderld=orderld;
        this.date=date;
        this.totalPrice=totalPrice;
    }
    @Override
    public String toString() {
        return "Order{"+"orderld="+orderld+"date="+date+"totalPrice="+totalPrice+'}';
    }
}
