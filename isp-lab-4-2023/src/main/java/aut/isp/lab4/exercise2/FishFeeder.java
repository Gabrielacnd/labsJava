package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals = 14;

    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String fillUp() {
        if (meals != 14) {
            meals = 14;
            return "The automatic fish feeder is again full";
        } else
            return "The automatic fish feeder is already full";

    }

    public void feed() {
        if (meals != 0) {
            meals--;
            System.out.println(" the feed operation is called :)");
        } else if (meals == 0) {
            fillUp();
        }
    }

    public String toString() {
        return
                fillUp() + " FishFeeder{" +
                        " manufacturer=" + manufacturer +
                        ", model=" + model +
                        ", Current numberMeals=" + meals +
                        '}';
    }
}
