package com.example.jasler.brastlewark.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasler on 17/04/2016.
 */

public class Population {

    @SerializedName("Brastlewark")
    @Expose
    private List<Brastlewarker> Brastlewarkers = new ArrayList<Brastlewarker>();

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
        this.Brastlewarkers = Brastlewarker;
    }

    /**
     *
     * @return
     * The Brastlewarkers
     */
    public List<Brastlewarker> getBrastlewarkers() {
        return Brastlewarkers;
    }

    /**
     *
     * @param Brastlewarkers
     * The Brastlewarkers
     */
    public void setBrastlewarkers(List<Brastlewarker> Brastlewarkers) {
        this.Brastlewarkers = Brastlewarkers;
    }

}