package com.example.gpsapp;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.ArrayDeque;

public class MyApplication extends Application {
    private static MyApplication singleton;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    private List<Location> myLocations;

    public MyApplication getInstance(){

        /*if(singleton == null){
            singleton = new MyApplication();
        }*/
        return singleton;
    }

    public void onCreate(){
        super.onCreate();
        singleton = this;
        myLocations = new ArrayList<>();
    }
}
