package de.sd.ilmapp;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Sebastian on 04.07.2015.
 */
public class SdHelp {

    private GoogleMap mMap;

    public void drawMarker(String name, double latC, double lngC) {
        mMap.addMarker(new MarkerOptions().position(new LatLng(latC,lngC)).title(name));

    }
}
