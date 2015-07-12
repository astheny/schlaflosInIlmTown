package de.sd.ilmapp;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class Point {
    // TODO: wirklich benötigt?
    private int id;
    private String name;
    private double Latitude;
    private double longitude;
    private String shortInfo;
    private String longInfo;
    private String webLink;

    public int getId() {
        return id;
    }

    // TODO: ID is unique? why set it after construction?
    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public String getLongInfo() {
        return longInfo;
    }

    public void setLongInfo(String longInfo) {
        this.longInfo = longInfo;
    }

    public Point(int id, String name, double lat, double lng) {
        this.id = id;
        this.name = name;
        Latitude = lat;
        longitude = lng;
    }
}
