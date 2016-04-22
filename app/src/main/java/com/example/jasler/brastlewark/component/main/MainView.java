package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.model.Brastlewarker;
import com.example.jasler.brastlewark.model.Population;

/**
 * Created by Jasler on 17/04/2016.
 */
public interface MainView {

    void showProgress();

    void hideProgress();

    void setData(Population population);

    void showErrorMessage(int error_msg);

    void navigateToDetail(Brastlewarker brastlewarker);
}
