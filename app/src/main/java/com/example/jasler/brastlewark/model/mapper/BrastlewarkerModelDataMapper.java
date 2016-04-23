package com.example.jasler.brastlewark.model.mapper;

import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.example.jasler.brastlewark.model.BrastlewarkerResponse;
import com.example.jasler.brastlewark.utils.Utils;

/**
 * Created by Jasler on 22/04/2016.
 */
public class BrastlewarkerModelDataMapper {

    public static BrastlewarkerModel mapToBrastlewarkerModel(BrastlewarkerResponse brastlewarkerResponse) {

        BrastlewarkerModel brastlewarkerModel = new BrastlewarkerModel();

        brastlewarkerModel.setName(brastlewarkerResponse.getName());
        brastlewarkerModel.setThumbnail(brastlewarkerResponse.getThumbnail());
        brastlewarkerModel.setAge(brastlewarkerResponse.getAge());
        brastlewarkerModel.setHeight(Utils.convertToCentimeters(brastlewarkerResponse.getHeight()));
        brastlewarkerModel.setWeight(Utils.convertToCentimeters(brastlewarkerResponse.getWeight()));
        brastlewarkerModel.setHairColor(brastlewarkerResponse.getHairColor());
        brastlewarkerModel.setProfessions(brastlewarkerResponse.getProfessions());
        brastlewarkerModel.setFriends(Utils.convertToStringList(brastlewarkerResponse.getFriends()));

        return brastlewarkerModel;
    }
}
