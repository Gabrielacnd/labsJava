package aut.isp.lab4.exercise1;

public class AquariumController {
    private static AquariumController SINGLE_AQUARIUM;
    private String manufacturer;
    private String model;
    private float currentTime;

    private AquariumController(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }


    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public static AquariumController getInstance(String manufacturer, String model) {
        if (SINGLE_AQUARIUM == null) {
            SINGLE_AQUARIUM = new AquariumController(manufacturer, model);
        }

        return SINGLE_AQUARIUM;
    }

    public String toString() {
        return "AquariumController{" +
                " manufacturer=" + manufacturer +
                ", model=" + model +" current time="+currentTime+
                '}';
    }
}
