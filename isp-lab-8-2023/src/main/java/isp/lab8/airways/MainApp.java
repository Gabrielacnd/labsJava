package isp.lab8.airways;

public class MainApp {
    public static void main(String[] args) {
        try {
            RouteManager manager = new RouteManager();

            // Creăm ruta LRCL-LROP
            manager.createRoute("LRCL-LROP");

            manager.addWaypoint("LRCL-LROP", new Waypoint(1, "LRCL", 46.7852, 23.6862, 415));
            manager.addWaypoint("LRCL-LROP", new Waypoint(2, "TASOD", 47.0548, 23.9212, 10460));
            manager.addWaypoint("LRCL-LROP", new Waypoint(3, "SOPAV", 46.9804, 24.7365, 10900));
            manager.addWaypoint("LRCL-LROP", new Waypoint(4, "BIRGU", 45.9467, 26.0217, 10200));
            manager.addWaypoint("LRCL-LROP", new Waypoint(5, "LROP", 44.5711, 26.0858, 106));

            // Încărcăm și afișăm ruta
            Route route = manager.loadRoute("LRCL-LROP");
            System.out.println("Waypoints in route " + route.getName() + ":");
            for (Waypoint wp : route.getWaypoints()) {
                System.out.println(" - " + wp);
            }
            System.out.println("Total distance: " + route.calculateTotalDistance() + " km");

            // Listăm rutele disponibile
            System.out.println("\nAvailable routes:");
            for (String r : manager.listRoutes()) {
                System.out.println(" * " + r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
