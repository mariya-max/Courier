package ru.startandroid.test15;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.startandroid.test15.Model.Courier;
import ru.startandroid.test15.Model.Data;

public interface DataApi {

    @GET("/android/getCouriersUpdates")
    Call<Data> getCouriers();

    @GET("/android/getCouriersUpdates")
    Call<Courier> getCourier();

}
