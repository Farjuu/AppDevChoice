package dev.farjana.appdevchoice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    List<Item> itemList;

    public RecyclerAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int view) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        final ViewHolder holder = new ViewHolder(v);
        v.setOnClickListener(view1 -> {
            int position = holder.getAdapterPosition();
            Intent intent = new Intent(parent.getContext(), WebActivity.class);
            intent.putExtra("url", itemList.get(position).getSiteURl());
            parent.getContext().startActivity(intent);

        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerAdapter.ViewHolder holder, int position) {

        Item item = itemList.get(position);
        holder.imageView.setImageResource(item.getImageId());
        holder.textView.setText(item.getImageName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recycler_img);
            textView = itemView.findViewById(R.id.recycler_text);
        }
    }
}

