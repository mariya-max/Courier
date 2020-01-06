
package ru.startandroid.test15.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Courier_  {

    @SerializedName("courierId")
    @Expose
    private Integer courierId;
    @SerializedName("fio")
    @Expose
    private String fio;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("linkEnable")
    @Expose
    private Boolean linkEnable;
    @SerializedName("isChina")
    @Expose
    private Boolean isChina;
    @SerializedName("ableToOnlineCheck")
    @Expose
    private Boolean ableToOnlineCheck;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;



    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getLinkEnable() {
        return linkEnable;
    }

    public void setLinkEnable(Boolean linkEnable) {
        this.linkEnable = linkEnable;
    }

    public Boolean getIsChina() {
        return isChina;
    }

    public void setIsChina(Boolean isChina) {
        this.isChina = isChina;
    }

    public Boolean getAbleToOnlineCheck() {
        return ableToOnlineCheck;
    }

    public void setAbleToOnlineCheck(Boolean ableToOnlineCheck) {
        this.ableToOnlineCheck = ableToOnlineCheck;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
