package isp.lab5.exercise1;

public class Product {
    private String productld;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;
    private Order order;
    public Product(String productld,String name, double price, ProductCategory productCategory,Customer customer, Order order){
        this.productld=productld;
        this.name=name;
        this.price=price;
        this.productCategory=productCategory;
        this.customer=customer;
        this.order=order;
    }
    @Override
    public String toString() {
      return "Product{"+"productld="+productld+"name="+name+"price="+price+"productCategory="+
               productCategory+"customer="+customer.toString()+"order="+order.toString()+'}';
    }
}
