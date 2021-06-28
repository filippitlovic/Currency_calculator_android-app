package hr.ferit.orwma_aplikacija;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ExampleViewHolder>{

    Context mContext;
    List<elementi_recyclera> elementi_recycleras_holder;


    public RecyclerAdapter(List<elementi_recyclera> elementi_recycleras_holder,Context mContext) {
        this.elementi_recycleras_holder = elementi_recycleras_holder;
        this.mContext = mContext;

    }


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        private LinearLayout svaki_red;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            svaki_red = (LinearLayout) itemView.findViewById(R.id.recycler_red);
            mImageView = itemView.findViewById(R.id.zastava);
            mTextView1 = itemView.findViewById(R.id.drzava);


        }

    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(mContext).inflate(R.layout.svaki_red_u_recycleru,parent,false);
        ExampleViewHolder viewHolder = new ExampleViewHolder(view);

        return new ExampleViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {

        holder.mImageView.setImageResource(elementi_recycleras_holder.get(position).getImage());
        holder.mTextView1.setText(elementi_recycleras_holder.get(position).getIme_drzave());

        holder.svaki_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,opis_svake_drzave.class);
                intent.putExtra("my image",elementi_recycleras_holder.get(position).getImage());
                intent.putExtra("my data",elementi_recycleras_holder.get(position).getIme_drzave());
                //int index = holder.getAdapterPosition();
                intent.putExtra("index",holder.getAdapterPosition());
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return elementi_recycleras_holder.size();
    }

}