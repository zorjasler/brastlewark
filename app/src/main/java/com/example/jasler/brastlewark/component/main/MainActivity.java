package com.example.jasler.brastlewark.component.main;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.component.detail.DetailActivity;
import com.example.jasler.brastlewark.component.main.adapter.MainAdapter;
import com.example.jasler.brastlewark.model.Brastlewarker;
import com.example.jasler.brastlewark.model.Population;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String INTENT_OBJECT_KEY = "brastlewark";

    /* Bindings */
    @Bind(R.id.rl_population) public RelativeLayout rlPopulation;
    @Bind(R.id.rv_population) public RecyclerView rvPopulation;
    @Bind(R.id.progressBar) public ProgressBar progressBar;

    public MainPresenter mPresenter = new MainPresenterImpl(this);
    public RecyclerView.Adapter mAdapter;
    public RecyclerView.LayoutManager mLayoutManager;

    /* ADAPTER LISTENER */
    public interface AdapterEventListener {
        void onClick(Brastlewarker brastlewarker);
    }

    private AdapterEventListener mAdapterEventListener = new AdapterEventListener() {
        @Override
        public void onClick(Brastlewarker brastlewarker) {
            mPresenter.onItemClick(brastlewarker);
        }
    };
    /* FIN ADAPTER LISTENER */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter.onCreate();
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
        Snackbar.make(rlPopulation, getString(error_msg), Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void navigateToDetail(Brastlewarker brastlewarker) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(INTENT_OBJECT_KEY, brastlewarker);
        startActivity(intent);
    }

    @Override
    public void setData(Population population) {
        mLayoutManager = new LinearLayoutManager(this);
        rvPopulation.setLayoutManager(mLayoutManager);
        mAdapter = new MainAdapter(this, population, mAdapterEventListener);
        rvPopulation.setHasFixedSize(true);
        rvPopulation.setAdapter(mAdapter);
    }
}
