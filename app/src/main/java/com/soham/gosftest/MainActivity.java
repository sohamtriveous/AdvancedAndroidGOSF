package com.soham.gosftest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.soham.gosftest.network.API;
import com.soham.gosftest.network.model.GOSFData;
import com.soham.gosftest.ui.DealsAdapter;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {
    private DealsAdapter dealsAdapter;
    private ListView listView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.contentListView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        listView.setVisibility(View.GONE);

        API.getApi().getGSOFDeals(new Callback<GOSFData>() {
            @Override
            public void success(GOSFData gosfData, Response response) {
                listView.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);
                dealsAdapter = new DealsAdapter(MainActivity.this, gosfData.getResults().getCollection1());
                listView.setAdapter(dealsAdapter);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("MainActivity", "error "+error.getMessage());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
