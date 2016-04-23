package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.example.jasler.brastlewark.model.BrastlewarkerResponse;
import com.example.jasler.brastlewark.model.PopulationModel;
import com.example.jasler.brastlewark.model.PopulationResponse;

/**
 * Created by Jasler on 17/04/2016.
 */
public class MainPresenterImpl implements MainPresenter {

    public interface ResultCallback {
        void onSuccess(PopulationModel population);
        void onError();
        void onParseError();
    }

    private PopulationModel populationModel;
    private MainView mView;
    private MainInteractor mInteractor = new MainInteractorImpl();
    private ResultCallback mResultCallback = new ResultCallback() {
        @Override
        public void onSuccess(PopulationModel population) {
            populationModel = population;
            mView.setData(population);
            mView.hideProgress();
        }

        @Override
        public void onError() {
            mView.hideProgress();
            mView.showErrorMessage(R.string.error_fetching_data);
        }

        @Override
        public void onParseError() {
            mView.hideProgress();
            mView.showErrorMessage(R.string.error_parsing_data);
        }
    };

    public MainPresenterImpl(MainView view) {
        mView = view;
    }

    @Override
    public void onCreate() {
        mView.showProgress();
        mInteractor.getPopulation(mResultCallback);
    }

    @Override
    public void onItemClick(int position) {
        BrastlewarkerModel brastlewarker = populationModel.getBrastlewarkers().get(position);
        mView.navigateToDetail(brastlewarker);
    }
}
