package com.example.jasler.brastlewark.component.detail;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.models.Brastlewarker;

/**
 * Created by Jasler on 17/04/2016.
 */
public class DetailPresenterImpl implements DetailPresenter {

    private DetailView mView;
    public DetailPresenterImpl(DetailView view) {
        mView = view;
    }

    @Override
    public void onCreate(Brastlewarker brastlewarker) {
        mView.showProgress();
        setData(brastlewarker);
        mView.hideProgress();
    }

    @Override
    public void onDestroy() {
        mView = null;
    }

    private void setData(Brastlewarker brastlewarker) {
        if (brastlewarker != null)
            mView.setData(brastlewarker);
        else
            mView.showErrorMessage(R.string.error_null_object);
    }
}
