package isp.lab5.exercise1;

public class Customer {
    private String customerld;
    private String name;
    private String phone;
    private Address address;
    public Customer(String customerld,String name, String phone,Address address){
        this.customerld=customerld;
        this.name=name;
        this.phone=phone;
        this.address=address;
    }
   @Override
    public String toString() {
      return "Customer{"+"name="+name+"phone="+phone+"Address= "+address.toString()+'}';
    }
}
