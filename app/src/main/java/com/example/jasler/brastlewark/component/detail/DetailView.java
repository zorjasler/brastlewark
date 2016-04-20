package com.example.jasler.brastlewark.component.detail;

import com.example.jasler.brastlewark.models.Brastlewarker;

/**
 * Created by Jasler on 17/04/2016.
 */
public interface DetailView {

    void showProgress();

    void hideProgress();

    void setData(Brastlewarker brastlewarker);

    void showErrorMessage(int error_msg);
}
