package ru.startandroid.test15;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.test15.Model.Courier;
import ru.startandroid.test15.Model.Courier_;
import ru.startandroid.test15.Model.Data;
import ru.startandroid.test15.Model.Worker;

public class ConverterWorker {

    private List<Worker> workers = null;

    public List<Worker> convertToWorker(Data data) {

        workers = new ArrayList<>();

        for (Courier city : data.getCouriers()) {
            if (city != null)
                for (Courier_ courier : city.getCouriers()) {
                    if (courier == null) continue;
                    if (city.getCityName() == null) continue;

                    Worker worker = new Worker();
                    worker.setCityName(city.getCityName());
                    worker.setTimeZoneMSK(city.getTimeZoneMSK());
                    worker.setCourierId(courier.getCourierId());
                    worker.setFio(courier.getFio());
                    worker.setPass(courier.getPass());
                    worker.setPhoneNumber(courier.getPhoneNumber());
                    workers.add(worker);
                }
        }
        return workers;
    }
}
