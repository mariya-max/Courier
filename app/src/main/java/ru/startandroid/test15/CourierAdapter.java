package ru.startandroid.test15;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.startandroid.test15.Model.Courier_;
import ru.startandroid.test15.Model.Worker;

public class CourierAdapter extends RecyclerView.Adapter<CourierAdapter.ViewHolders> {

    private List<Worker> workers;

    public CourierAdapter(List<Worker> workers) {
        this.workers = workers;
    }

    @NonNull
    @Override
    public ViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
        return new ViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolders holder, int position) {

        Worker worker = workers.get(position);

        holder.fio.setText("ФИО: " + worker.getFio());
        holder.id.setText("ID: " + worker.getCourierId());

        if (worker.getPhoneNumber() == null) {
            holder.phone.setText("Нет телефона");
        } else {
            holder.phone.setText("Телефон: " + worker.getPhoneNumber());
        }

    }

    @Override
    public int getItemCount() {

        if (workers == null) {
            return 0;
        }
        return workers.size();
    }

    public class ViewHolders extends RecyclerView.ViewHolder {

        TextView fio;
        TextView id;
        TextView pass;
        TextView phone;

        public ViewHolders(@NonNull View itemView) {
            super(itemView);

            fio = itemView.findViewById(R.id.fio);
            id = itemView.findViewById(R.id.id);
            pass = itemView.findViewById(R.id.pass);
            phone = itemView.findViewById(R.id.phone);
        }
    }
}
