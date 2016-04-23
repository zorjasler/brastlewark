package com.example.jasler.brastlewark.model;

import java.util.List;

/**
 * Created by Jasler on 22/04/2016.
 */
public class PopulationModel {

    private List<BrastlewarkerModel> Brastlewarker;

    /**
     * No args constructor for use in serialization
     *
     */
    public PopulationModel() {
    }

    /**
     *
     * @param Brastlewarker
     */
    public PopulationModel(List<BrastlewarkerModel> Brastlewarker) {
        this.Brastlewarker = Brastlewarker;
    }

    /**
     *
     * @return
     * The Brastlewarkers
     */
    public List<BrastlewarkerModel> getBrastlewarkers() {
        return Brastlewarker;
    }

    /**
     * @param brastlewarker The Brastlewarkers
     */
    public void setBrastlewarkers(List<BrastlewarkerModel> brastlewarker) {
        this.Brastlewarker = brastlewarker;
    }
}
