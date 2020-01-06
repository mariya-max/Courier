package ru.startandroid.test15;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.startandroid.test15.Controller.RealmController;
import ru.startandroid.test15.Model.Courier;
import ru.startandroid.test15.Model.Courier_;
import ru.startandroid.test15.Model.Data;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Courier> dataList;
    ArrayList<Courier_> courierList;
    Data data;
    RealmController realmController;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        courierList = new ArrayList<>();
        realmController = new RealmController(this);

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

        App.getApi().getCouriers().enqueue(new Callback<Data>() {

            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.body() == null) return;

                data = response.body();

                ConverterWorker converterWorker = new ConverterWorker();
                realmController.removeAll();
                realmController.saveAll(converterWorker.convertToWorker(data));


                for (Courier c : data.getCouriers()) {
                    dataList.add(c);
                }
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                t.printStackTrace();
            }
        });

        DataAdapter adapter = new DataAdapter(dataList);

        adapter.setOnItemClickListener(new DataAdapter.ClickListener() {
            @Override
            public void onItemClick(View v, String city) {

                //Toast.makeText(MainActivity.this, "city: " + city, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("city", city);
                startActivity(intent);
            }
        });


        recyclerView.setAdapter(adapter);
    }
}
