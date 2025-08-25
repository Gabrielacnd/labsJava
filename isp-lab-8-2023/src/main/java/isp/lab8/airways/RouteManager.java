package isp.lab8.airways;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RouteManager {
    private static final String BASE_PATH = "routes";

    public RouteManager() {
        File base = new File(BASE_PATH);
        if (!base.exists()) {
            base.mkdir();
        }
    }

    // Create a new route folder
    public void createRoute(String routeName) throws IOException {
        File folder = new File(BASE_PATH, routeName);
        if (!folder.exists()) {
            folder.mkdir();
        } else {
            throw new IOException("Route already exists!");
        }
    }

    // Delete a route (folder + contents)
    public void deleteRoute(String routeName) throws IOException {
        Path folder = Paths.get(BASE_PATH, routeName);
        if (Files.exists(folder)) {
            Files.walk(folder)
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
        } else {
            throw new IOException("Route does not exist!");
        }
    }

    // Add waypoint (as serialized object)
    public void addWaypoint(String routeName, Waypoint wp) throws IOException {
        File folder = new File(BASE_PATH, routeName);
        if (!folder.exists()) throw new IOException("Route does not exist!");

        File wpFile = new File(folder, wp.getIndex() + "_" + wp.getName() + ".ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(wpFile))) {
            oos.writeObject(wp);
        }
    }

    // Load a route from folder
    public Route loadRoute(String routeName) throws IOException, ClassNotFoundException {
        File folder = new File(BASE_PATH, routeName);
        if (!folder.exists()) throw new IOException("Route does not exist!");

        Route route = new Route(routeName);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".ser"));
        if (files != null) {
            for (File f : files) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                    Waypoint wp = (Waypoint) ois.readObject();
                    route.addWaypoint(wp);
                }
            }
        }
        return route;
    }

    // List available routes
    public List<String> listRoutes() {
        File base = new File(BASE_PATH);
        String[] routes = base.list((current, name) -> new File(current, name).isDirectory());
        return routes != null ? Arrays.asList(routes) : new ArrayList<>();
    }
}
