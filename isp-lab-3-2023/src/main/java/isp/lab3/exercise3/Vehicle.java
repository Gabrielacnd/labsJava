package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    char fuelType;
    private static int countObjects = 0;

    Vehicle(String model, String type, int speed, char fuelType) {
        countObjects++;
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String setModel() {
        return model;
    }

    public String settype() {
        return type;
    }

    public int setSpeed() {
        return speed;
    }

    public char setFueltype() {
        return fuelType;
    }

    public String toString() {
        return "Vehicle{ " +
                "model=" + model + '(' + type + ')' +
                ", Speed=" + speed +
                ", fuelType=" + fuelType +

                '}';

    }

    public static int count() {
        return countObjects;
    }

     boolean compare(Vehicle one, Vehicle two) {
        boolean isEqual = one.equals(two);
        if (isEqual) {
            System.out.println("Cele doua obiecte sunt egale!");
            return true;

        } else {
            System.out.println("Cele doua obiecte NU sunt egale!");
            return false;
        }
    }

    public static void main(String[] args) {
        Vehicle Vehicle1 = new Vehicle("Audi", "A4", 200, 'D');
        Vehicle Vehicle2 = new Vehicle("Mercedes", "Benz", 180, 'D');
        System.out.println(Vehicle1);
        System.out.println(Vehicle2);
        System.out.println("Numarul de obiecte create este:" );
        System.out.println(Vehicle.count());
        Vehicle2.compare(Vehicle1,Vehicle2);

    }

}
