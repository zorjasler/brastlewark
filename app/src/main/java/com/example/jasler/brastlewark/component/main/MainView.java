package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.example.jasler.brastlewark.model.PopulationModel;

/**
 * Created by Jasler on 17/04/2016.
 */
public interface MainView {

    void showProgress();

    void hideProgress();

    void setData(PopulationModel population);

    void showErrorMessage(int error_msg);

    void navigateToDetail(BrastlewarkerModel brastlewarker);
}
