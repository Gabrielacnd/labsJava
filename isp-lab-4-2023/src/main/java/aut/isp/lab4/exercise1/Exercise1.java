package aut.isp.lab4.exercise1;

public class Exercise1 {


    public static void main(String[] args) {
        AquariumController aquarium=AquariumController.getInstance("Juwel","Hailea K30");
        aquarium.setCurrentTime(22);
       System.out.println(aquarium.toString());

    }
}
