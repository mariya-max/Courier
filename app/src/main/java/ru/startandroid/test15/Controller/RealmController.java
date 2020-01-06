package ru.startandroid.test15.Controller;

import android.content.Context;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import ru.startandroid.test15.Model.Worker;

public class RealmController {

    private Realm realm;

    public RealmController(Context context) {
        RealmConfiguration config = new RealmConfiguration.Builder(context).build();
        realm.setDefaultConfiguration(config);
        realm = Realm.getDefaultInstance();
    }

    public void removeAll() {

        realm.beginTransaction();

        RealmResults<Worker> workers = realm.where(Worker.class).findAll();
        workers.clear();

        realm.commitTransaction();
    }

    public void saveAll(List<Worker> workers) {

        realm.beginTransaction();

//        RealmList<Worker> workersRealm = new RealmList<>();
//        workersRealm.addAll(workers);
        realm.copyToRealm(workers);
        realm.commitTransaction();
    }

    public void getAll() {
        RealmResults<Worker> workers = realm.where(Worker.class).findAll();
        System.out.println(workers.toString());
    }

    public RealmResults<Worker> getWorkersByCity(String city) {

        RealmResults<Worker> workers = realm.where(Worker.class).equalTo("cityName", city).findAll();
        System.out.println(workers.toString());
        return workers;

    }
}
