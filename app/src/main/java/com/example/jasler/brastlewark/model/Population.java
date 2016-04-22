package com.example.jasler.brastlewark.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasler on 17/04/2016.
 */

public class Population {

    private List<Brastlewarker> Brastlewarker = new ArrayList<Brastlewarker>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Population() {
    }

    /**
     *
     * @param Brastlewarker
     */
    public Population(List<Brastlewarker> Brastlewarker) {
        this.Brastlewarker = Brastlewarker;
    }

    /**
     *
     * @return
     * The Brastlewarkers
     */
    public List<Brastlewarker> getBrastlewarkers() {
        return Brastlewarker;
    }

    /**
     *
     * @param Brastlewarkers
     * The Brastlewarkers
     */
    public void setBrastlewarkers(List<Brastlewarker> Brastlewarkers) {
        this.Brastlewarker = Brastlewarkers;
    }

}