package com.example.jasler.brastlewark.component.main;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.model.Brastlewarker;
import com.example.jasler.brastlewark.model.Population;

/**
 * Created by Jasler on 17/04/2016.
 */
public class MainPresenterImpl implements MainPresenter {

    public interface ResultCallback {
        void onSuccess(Population population);
        void onError();
    }

    private MainView mView;
    private MainInteractor mInteractor = new MainInteractorImpl();
    private ResultCallback mResultCallback = new ResultCallback() {
        @Override
        public void onSuccess(Population population) {
            mView.hideProgress();
            mView.setData(population);
        }

        @Override
        public void onError() {
            mView.hideProgress();
            mView.showErrorMessage(R.string.error_fetching_data);
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
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void onItemClick(Brastlewarker brastlewarker) {
        mView.navigateToDetail(brastlewarker);
    }
}
