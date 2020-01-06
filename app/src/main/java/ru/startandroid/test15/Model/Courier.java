
package ru.startandroid.test15.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Courier  {

    @SerializedName("cityId")
    @Expose
    private Integer cityId;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("cityLinksEnable")
    @Expose
    private Boolean cityLinksEnable;
    @SerializedName("isFranch")
    @Expose
    private Boolean isFranch;
    @SerializedName("couriers")
    @Expose
    private List<Courier_> couriers;
    @SerializedName("timeZoneMSK")
    @Expose
    private String timeZoneMSK;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Boolean getCityLinksEnable() {
        return cityLinksEnable;
    }

    public void setCityLinksEnable(Boolean cityLinksEnable) {
        this.cityLinksEnable = cityLinksEnable;
    }

    public Boolean getIsFranch() {
        return isFranch;
    }

    public void setIsFranch(Boolean isFranch) {
        this.isFranch = isFranch;
    }

    public List<Courier_> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<Courier_> couriers) {
        this.couriers = couriers;
    }

    public String getTimeZoneMSK() {
        return timeZoneMSK;
    }

    public void setTimeZoneMSK(String timeZoneMSK) {
        this.timeZoneMSK = timeZoneMSK;
    }

}
