package de.sd.ilmapp;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class Point {
    private int id;
    private String name;
    private double Lat;
    private double Lng;
    private String shortInfo;
    private String longInfo;
    private String webLink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
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

    public double getLng() {
        return Lng;
    }

    public void setLng(double lng) {
        Lng = lng;
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
        Lat = lat;
        Lng = lng;


    }
}
