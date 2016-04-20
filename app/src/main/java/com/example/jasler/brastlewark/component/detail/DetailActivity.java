package com.example.jasler.brastlewark.component.detail;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.models.Brastlewarker;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jasler on 17/04/2016.
 */
public class DetailActivity extends AppCompatActivity implements DetailView {

    /* Bindings */
    @Bind(R.id.rl_detail) public RelativeLayout rlDetail;
    @Bind(R.id.char_thumb_big) public ImageView characterThumbnailBig;
    @Bind(R.id.progressBar2) public ProgressBar progressBar;
    @Bind(R.id.detail_name) public TextView detailName;
    @Bind(R.id.detail_age) public TextView detailAge;
    @Bind(R.id.detail_weight) public TextView detailWeight;
    @Bind(R.id.detail_height) public TextView detailHeight;
    @Bind(R.id.detail_hair_color) public TextView detailHairColor;
    @Bind(R.id.detail_professions) public TextView detailProfessions;
    @Bind(R.id.detail_friends) public TextView detailFriends;

    public DetailPresenter mPresenter = new DetailPresenterImpl(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        Brastlewarker brastlewarker = getIntent().getParcelableExtra("brastelwark");
        mPresenter.onCreate(brastlewarker);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorMessage(int error_msg) {
        Snackbar.make(rlDetail, getString(error_msg), Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void setData(Brastlewarker brastlewarker) {
        setThumbnail(brastlewarker.getThumbnail());
        setName(brastlewarker.getName());
        setAge(brastlewarker.getAge());
        setWeight(brastlewarker.getWeight());
        setHeight(brastlewarker.getHeight());
        setHairColor(brastlewarker.getHairColor());
        setProfessions(brastlewarker.getProfessions());
        setFriends(brastlewarker.getFriends());
    }

    public void setThumbnail(String thumbnail) {
        Picasso.with(this).load(thumbnail).into(characterThumbnailBig);
    }

    public void setName(String name) {
        detailName.setText(name);
    }

    public void setAge(Integer age) {
        detailAge.setText(String.valueOf(age));
    }

    public void setWeight(Double weight) {
        detailWeight.setText(String.valueOf(weight));
    }

    public void setHeight(Double height) {
        detailHeight.setText(String.valueOf(height));
    }

    public void setHairColor(String hairColor) {
        detailHairColor.setText(hairColor);
    }

    public void setProfessions(List<String> professions) {
        detailProfessions.setText(professions.toString().substring(1, professions.toString().length()-1));
    }

    public void setFriends(List<Object> friends) {
        detailFriends.setText(friends.toString().substring(1, friends.toString().length()-1));
    }
}
