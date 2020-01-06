
package ru.startandroid.test15.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import ru.startandroid.test15.Model.Courier;

public class Data  {

    @SerializedName("couriers")
    @Expose
    private List<Courier> couriers;

    public List<Courier> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<Courier> couriers) {
        this.couriers = couriers;
    }

}
