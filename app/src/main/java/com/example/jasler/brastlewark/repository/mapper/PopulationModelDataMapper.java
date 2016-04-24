package com.example.jasler.brastlewark.repository.mapper;

import com.example.jasler.brastlewark.model.PopulationModel;
import com.example.jasler.brastlewark.repository.response.PopulationResponse;
import com.example.jasler.brastlewark.utils.Utils;

/**
 * Created by Jasler on 22/04/2016.
 */
public class PopulationModelDataMapper {

    public static PopulationModel mapToPopulationModel(PopulationResponse populationResponse) {
        PopulationModel populationModel = new PopulationModel();

        populationModel.setBrastlewarkers(Utils.convertToBrastlewarkerModelList(populationResponse.getBrastlewarkers()));

        return populationModel;
    }
}
