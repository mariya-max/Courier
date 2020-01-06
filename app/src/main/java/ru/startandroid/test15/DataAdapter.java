package ru.startandroid.test15;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.startandroid.test15.Model.Courier;
import ru.startandroid.test15.Model.Courier_;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private static ClickListener clickListener;

    private List<Courier> dataList;
    List<Courier_> courierList;

    public DataAdapter(List<Courier> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Courier data = dataList.get(position);

        holder.city.setText(data.getCityName());
        holder.couriers.setText("Курьеров: " + data.getCouriers().size());
        holder.time.setText("Тайм зона от Москвы: " + data.getTimeZoneMSK());

    }

    @Override
    public int getItemCount() {
        if (dataList == null) {
            return 0;
        }
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView city;
        TextView couriers;
        TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            city = itemView.findViewById(R.id.cityName);
            couriers = itemView.findViewById(R.id.couriers);
            time = itemView.findViewById(R.id.timeZoneMSK);
            //city.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            clickListener.onItemClick(view, city.getText().toString());
        }
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        DataAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(View view, String city);
    }
}
