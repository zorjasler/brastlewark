package com.example.jasler.brastlewark.component.detail;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.example.jasler.brastlewark.utils.Utils;

import okhttp3.internal.Util;

/**
 * Created by Jasler on 17/04/2016.
 */
public class DetailPresenterImpl implements DetailPresenter {

    private DetailView mView;
    public DetailPresenterImpl(DetailView view) {
        mView = view;
    }

    @Override
    public void onCreate(BrastlewarkerModel brastlewarker) {
        mView.showProgress();
        setData(brastlewarker);
        mView.hideProgress();
    }

    private void setData(BrastlewarkerModel brastlewarker) {
        if (brastlewarker != null) {
            mView.setThumbnail(brastlewarker.getThumbnail());
            mView.setName(brastlewarker.getName());
            mView.setAge(brastlewarker.getAge());
            mView.setWeight(brastlewarker.getWeight());
            mView.setHeight(brastlewarker.getHeight());
            mView.setHairColor(brastlewarker.getHairColor());
            mView.setProfessions(brastlewarker.getProfessions());
            mView.setFriends(brastlewarker.getFriends());
        } else {
            mView.showErrorMessage(R.string.error_null_object);
        }
    }
}
