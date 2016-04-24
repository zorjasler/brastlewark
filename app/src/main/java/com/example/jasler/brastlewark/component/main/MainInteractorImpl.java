package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.connection.ConnectionInterface;
import com.example.jasler.brastlewark.connection.ConnectionService;
import com.example.jasler.brastlewark.model.PopulationModel;
import com.example.jasler.brastlewark.repository.response.PopulationResponse;
import com.example.jasler.brastlewark.repository.mapper.PopulationModelDataMapper;

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

        Call<PopulationResponse> call = mService.getPopulation();

        call.enqueue(new Callback<PopulationResponse>() {
            @Override
            public void onResponse(Call<PopulationResponse> call, Response<PopulationResponse> response) {
                if (response.isSuccessful()) {
                    PopulationResponse mData = response.body();
                    if (mData.getBrastlewarkers() == null) {
                        mResultCallback.onParseError();
                    } else {
                        PopulationModel mPopulationData = PopulationModelDataMapper.mapToPopulationModel(mData);
                        mResultCallback.onSuccess(mPopulationData);
                    }
                } else {
                    mResultCallback.onError();
                }
            }

            @Override
            public void onFailure(Call<PopulationResponse> call, Throwable t) {
                mResultCallback.onError();
            }
        });
    }
}
