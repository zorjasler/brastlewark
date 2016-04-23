package com.example.jasler.brastlewark.model;

import java.util.List;

/**
 * Created by Jasler on 17/04/2016.
 */

public class PopulationResponse {

    private List<BrastlewarkerResponse> Brastlewark;

    /**
     * No args constructor for use in serialization
     *
     */
    public PopulationResponse() {
    }

    /**
     *
     * @param brastlewark
     */
    public PopulationResponse(List<BrastlewarkerResponse> brastlewark) {
        this.Brastlewark = brastlewark;
    }

    /**
     *
     * @return
     * The Brastlewarkers
     */
    public List<BrastlewarkerResponse> getBrastlewarkers() {
        return Brastlewark;
    }
}