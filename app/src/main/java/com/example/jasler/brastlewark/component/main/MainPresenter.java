package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.models.Brastlewarker;

/**
 * Created by Jasler on 17/04/2016.
 */
public interface MainPresenter {

    void onCreate();

    void onDestroy();

    void onItemClick(Brastlewarker brastlewarker);
}
