package com.example.jasler.brastlewark.utils;

import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.example.jasler.brastlewark.repository.response.BrastlewarkerResponse;
import com.example.jasler.brastlewark.repository.mapper.BrastlewarkerModelDataMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jasler on 22/04/2016.
 */
public class Utils {

    public static int convertToCentimeters(double height) {
        return (int) height;
    }

    public static List<String> convertToStringList(List<Object> list) {
        List<String> strings = new ArrayList<>();
        if (list != null) {
            for (Object object : list) {
                strings.add(object != null ? object.toString() : null);
            }
        }
        return strings;
    }

    public static List<BrastlewarkerModel> convertToBrastlewarkerModelList(List<BrastlewarkerResponse> list) {
        List<BrastlewarkerModel> brastlewarkerModels = new ArrayList<>();
        if (list != null) {
            for (BrastlewarkerResponse brastlewarkerResponse : list) {
                brastlewarkerModels.add(brastlewarkerResponse != null ?
                        BrastlewarkerModelDataMapper.mapToBrastlewarkerModel(brastlewarkerResponse) : null);
            }
        }
        return brastlewarkerModels;
    }
}
