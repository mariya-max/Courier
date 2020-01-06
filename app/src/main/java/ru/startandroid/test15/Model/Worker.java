package ru.startandroid.test15.Model;

import io.realm.RealmObject;

public class Worker extends RealmObject {

    private String cityName;
    private String timeZoneMSK;
    private Integer courierId;
    private String fio;
    private String pass;
    private String phoneNumber;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTimeZoneMSK() {
        return timeZoneMSK;
    }

    public void setTimeZoneMSK(String timeZoneMSK) {
        this.timeZoneMSK = timeZoneMSK;
    }

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
}
