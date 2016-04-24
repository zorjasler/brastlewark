package com.example.jasler.brastlewark.connection;

import com.example.jasler.brastlewark.repository.response.PopulationResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jasler on 17/04/2016.
 */

public interface ConnectionInterface {

    @GET("/AXA-GROUP-SOLUTIONS/mobilefactory-test/master/data.json")
    Call<PopulationResponse> getPopulation();
}
