package isp.lab8.airways;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Waypoint implements Comparable<Waypoint>{
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public Waypoint(int index,String name,double latitude,double longitude,int altitude) {
        this.index = index;
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
    }

    @Override
    public compareTo(Waypoint o){
        return Integer.valueOf(this.index).compareTo(o.index);
    }
}
