package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.connection.ConnectionInterface;
import com.example.jasler.brastlewark.connection.ConnectionService;
import com.example.jasler.brastlewark.model.Population;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jasler on 18/04/2016.
 */
public class MainInteractorImpl implements MainInteractor {

    public MainInteractorImpl(){}

    @Override
    public void getPopulation(final MainPresenterImpl.ResultCallback mResultCallback) {

        ConnectionInterface mService = ConnectionService.createService(ConnectionInterface.class);

        Call<Population> call = mService.getPopulation();

        call.enqueue(new Callback<Population>() {
            @Override
            public void onResponse(Call<Population> call, Response<Population> response) {
                if (response.isSuccessful()) {
                    Population mData = response.body();
                    mResultCallback.onSuccess(mData);
                } else {
                    mResultCallback.onError();
                }
            }

            @Override
            public void onFailure(Call<Population> call, Throwable t) {
                mResultCallback.onError();
            }
        });
    }
}
