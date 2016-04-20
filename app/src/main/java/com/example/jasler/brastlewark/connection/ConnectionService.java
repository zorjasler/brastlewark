package com.example.jasler.brastlewark.connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jasler on 17/04/2016.
 */
public class ConnectionService {

    public static final String baseURL = "https://raw.githubusercontent.com";

    private static okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(baseURL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass){
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }
}
