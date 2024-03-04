package aut.isp.lab4.exercise3;

import aut.isp.lab4.exercise1.AquariumController;

public class AquariumControllerAgregare {
    private static AquariumControllerAgregare SINGLE_AQUARIUM;
    private String manufacturer;
    private String model;
    private float currentTime;
    private FishFeederAgregare feeder;
    private float feedingTime;


    private AquariumControllerAgregare(FishFeederAgregare feeder, String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }


    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;

    }

    public static AquariumControllerAgregare getInstance(FishFeederAgregare feeder, String manufacturer, String model) {
        if (SINGLE_AQUARIUM == null) {
            SINGLE_AQUARIUM = new AquariumControllerAgregare(feeder, manufacturer, model);
        }

        return SINGLE_AQUARIUM;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public float getFeedingTime() {
        return feedingTime;
    }
}
