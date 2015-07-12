package de.sd.ilmapp;

import java.util.ArrayList;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class Route {
    String type;
    ArrayList<Point> stations;

    public Route(String type, ArrayList<Point>  stations) {
        this.type = type;
        this.stations = stations;
    }

    // TODO: Change method signature to fit into Google Maps API
    public String calculateRoute() {
        return null;
    }

    // TODO: Add Check for types?
    public void addLocationAtLastPosition(Point location) {
        stations.add(location);
    }

    // TODO: Add Check for types?
    public void addLocationAtFirstPosition(Point location){
        stations.add(location);
    }



}
