package ru.startandroid.test15;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.test15.Controller.RealmController;
import ru.startandroid.test15.Model.Courier;
import ru.startandroid.test15.Model.Courier_;
import ru.startandroid.test15.Model.Data;
import ru.startandroid.test15.Model.Worker;

public class NewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    RealmController realmController;
    List<Worker> workers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        String city = getIntent().getStringExtra("city");
        realmController = new RealmController(this);
        workers = realmController.getWorkersByCity(city);
        recyclerView = findViewById(R.id.rv2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        Toast.makeText(NewActivity.this, "city: " + city, Toast.LENGTH_LONG).show();

        if (workers != null) {
            CourierAdapter adapter = new CourierAdapter(workers);
            recyclerView.setAdapter(adapter);
        }
    }
}
