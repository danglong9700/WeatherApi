package com.example.vinicorp.api;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static String baseurl = "http://api.openweathermap.org/";
    public static String appid = "423eda64ebd1a12047afec5c28f2d9aa";
    public static String lat = "105.85";
    public static String lon = "21.03";
    public TextView temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
        getWeatherData();

    }

    public void initiate(){
        temp = findViewById(R.id.temp);
    }

    void getWeatherData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherObject> call = service.getCurrentWeatherData(lat,lon,appid);
        call.enqueue(new Callback<WeatherObject>() {
            @Override
            public void onResponse(Call<WeatherObject> call, Response<WeatherObject> response) {
                if (response.code() == 200){
                    WeatherObject weatherObject = response.body();
                    assert weatherObject != null;

                    String test = String.valueOf((weatherObject.main.temp));
                    temp.setText(test);
                }
            }

            @Override
            public void onFailure(Call<WeatherObject> call, Throwable t) {
                temp.setText(t.getMessage());
            }
        });
    }
}
