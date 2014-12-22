package com.soham.gosftest.network;

import com.soham.gosftest.network.model.GOSFData;


import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by sohammondal on 23/12/14.
 */
public class API {
    private static String API_URL = "https://www.kimonolabs.com/api";
    private static GOSFApiInterface gosfApiInterface = null;

    public static GOSFApiInterface getApi() {
        if(gosfApiInterface == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(API_URL)
                    .build();

            gosfApiInterface = restAdapter.create(GOSFApiInterface.class);
        }
        return gosfApiInterface;
    }

    public interface GOSFApiInterface {
        @GET("/dh5sm01o?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ")
        GOSFData getGSOFDeals();

        @GET("/dh5sm01o?apikey=ZdSnJCoFzxb1gjUS3m9wSx97NrSPDbdQ")
        void getGSOFDeals(Callback<GOSFData> gosfDataCallback);
    }
}
