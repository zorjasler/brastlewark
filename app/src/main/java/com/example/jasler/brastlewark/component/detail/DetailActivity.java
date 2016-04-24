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
import com.example.jasler.brastlewark.model.BrastlewarkerModel;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jasler on 17/04/2016.
 */
public class DetailActivity extends AppCompatActivity implements DetailView {

    private static final String INTENT_OBJECT_KEY = "brastlewark";

    /* Bindings */
    @Bind(R.id.rl_detail) public RelativeLayout rlDetail;
    @Bind(R.id.char_thumb_big) public ImageView characterThumbnailBig;
    @Bind(R.id.progressBar) public ProgressBar progressBar;
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
        BrastlewarkerModel brastlewarker = getIntent().getParcelableExtra(INTENT_OBJECT_KEY);
        mPresenter.onCreate(brastlewarker);
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
    public void setThumbnail(String thumbnail) {
        Picasso.with(this).load(thumbnail).into(characterThumbnailBig);
    }

    @Override
    public void setName(String name) {
        detailName.setText(name);
    }

    @Override
    public void setAge(int age) {
        detailAge.setText(String.valueOf(age));
    }

    @Override
    public void setWeight(int weight) {
        detailWeight.setText(String.valueOf(weight));
    }

    @Override
    public void setHeight(int height) {
        detailHeight.setText(String.valueOf(height));
    }

    @Override
    public void setHairColor(String hairColor) {
        detailHairColor.setText(hairColor);
    }

    @Override
    public void setProfessions(List<String> professions) {
        detailProfessions.setText(professions.toString().substring(1, professions.toString().length()-1));
    }

    @Override
    public void setFriends(List<String> friends) {
        detailFriends.setText(friends.toString().substring(1, friends.toString().length()-1));
    }
}
