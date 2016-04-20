package com.example.jasler.brastlewark.component.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jasler.brastlewark.R;
import com.example.jasler.brastlewark.component.main.MainActivity.AdapterEventListener;
import com.example.jasler.brastlewark.models.Brastlewarker;
import com.example.jasler.brastlewark.models.Population;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jasler on 17/04/2016.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private Population mDataset;
    private AdapterEventListener mAdapterEventListener;

    public MainAdapter(Context context, Population myDataset,
                       AdapterEventListener adapterEventListener) {

        this.context = context;
        this.mDataset = myDataset;
        this.mAdapterEventListener = adapterEventListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_main_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(context, mDataset.getBrastlewarkers().get(position), mAdapterEventListener);
    }

    @Override
    public int getItemCount() {
        return mDataset.getBrastlewarkers().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.char_thumb) ImageView characterThumbnail;
        @Bind(R.id.char_name) TextView characterName;
        @Bind(R.id.char_age) TextView characterAge;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bind(Context context, final Brastlewarker brastlewarker,
                         final AdapterEventListener mAdapterEventListener) {

            String thumb = brastlewarker.getThumbnail();

            if (thumb != null)
                Picasso.with(context).load(thumb).into(characterThumbnail);

            characterName.setText(brastlewarker.getName());
            characterAge.setText(String.valueOf(brastlewarker.getAge()));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAdapterEventListener.onClick(brastlewarker);
                }
            });
        }
    }
}
