package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder feeder = new FishFeeder("Boyu", "ZW-66");
        for (int i = 0; i < 14; i++)
            feeder.feed();
        System.out.println(feeder.toString());
    }
}
