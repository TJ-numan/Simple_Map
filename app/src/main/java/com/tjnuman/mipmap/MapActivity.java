package com.tjnuman.mipmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tjnuman.mipmap.Retrofit.JsonPlaceHolderApi;
import com.tjnuman.mipmap.Retrofit.PostModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapActivity extends AppCompatActivity {
    TextView textView;
    Button getAlldata,getSingledata;
    String lattitude,longitutde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        textView = findViewById(R.id.textView);
        getAlldata = findViewById(R.id.button);
        getSingledata = findViewById(R.id.button2);


        getSingledata.setOnClickListener(v ->

                getSingledata()

        );

        getAlldata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapActivity.this, LocationActivity.class);
                intent.putExtra("latitude", lattitude);
                intent.putExtra("longitude", longitutde);
                startActivity(intent);
            }
        });
    }


    private void getSingledata() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipstack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<PostModel> call = jsonPlaceHolderApi.getSinglePost();
        call.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                if (!response.isSuccessful()){
                    textView.setText(response.code());
                }
                PostModel postModel = response.body();
                String content = "";


                content += "IP: " + postModel.getIp() + "\n";
                content += "continent_code: " + postModel.getContinent_code() + "\n";
                content += "continent_name: " + postModel.getContinent_name() + "\n";
                content += "country_code: " + postModel.getCountry_code() + "\n";
                content += "country_name: " + postModel.getContinent_name() + "\n";
                content += "region_code: " + postModel.getRegion_code() + "\n";
                content += "region_name: " + postModel.getRegion_name() + "\n";
                content += "city: " + postModel.getCity() + "\n";
                content += "zip: " + postModel.getZip() + "\n";
                content += "latitude: " + postModel.getLatitude() + "\n";
                 lattitude = postModel.getLatitude();
                content += "longitude: " + postModel.getLongitude() + "\n\n";
                 longitutde = postModel.getLongitude();

                textView.setText(content);


            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }
}