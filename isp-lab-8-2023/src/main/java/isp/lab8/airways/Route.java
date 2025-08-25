package isp.lab8.airways;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
    private String name;
    private List<Waypoint> waypoints = new ArrayList<>();

    public Route(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addWaypoint(Waypoint wp) {
        waypoints.add(wp);
        Collections.sort(waypoints); // ensure order by index
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public double calculateTotalDistance() {
        double total = 0.0;
        for (int i = 0; i < waypoints.size() - 1; i++) {
            Waypoint w1 = waypoints.get(i);
            Waypoint w2 = waypoints.get(i+1);
            total += WaypointDistanceCalculator.calculateDistance(
                    w1.getLatitude(), w1.getLongitude(),
                    w2.getLatitude(), w2.getLongitude()
            );
        }
        return total;
    }
}
