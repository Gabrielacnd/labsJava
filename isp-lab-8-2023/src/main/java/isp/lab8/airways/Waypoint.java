package isp.lab8.airways;


import java.io.Serializable;

public class Waypoint implements Serializable, Comparable<Waypoint> {
    private static final long serialVersionUID = 1L;

    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public Waypoint(int index, String name, double latitude, double longitude, int altitude) {
        this.index = index;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public int getIndex() { return index; }
    public String getName() { return name; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public int getAltitude() { return altitude; }

    @Override
    public int compareTo(Waypoint o) {
        return Integer.compare(this.index, o.index);
    }

    @Override
    public String toString() {
        return name + " (" + latitude + ", " + longitude + ", " + altitude + "m)";
    }
}
