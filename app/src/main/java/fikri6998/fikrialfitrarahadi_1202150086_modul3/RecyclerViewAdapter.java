package fikri6998.fikrialfitrarahadi_1202150086_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fikri6998 on 2/25/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MinumanViewHolder> {

    public ArrayList<DataAir> data;

    public RecyclerViewAdapter(ArrayList<DataAir> data) {
        this.data = data;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_main, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final DataAir item = data.get(position);
        holder.bindTo(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailActivity.class);
                go.putExtra("etitle",item.getNama());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MinumanViewHolder extends RecyclerView.ViewHolder{

        private TextView mAirJudul;
        private TextView mAirInfo;
        private ImageView mAirImg;
        private Context mContext;
        private DataAir mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            mAirJudul = (TextView)itemView.findViewById(R.id.Judul_brand);
            mAirInfo = (TextView)itemView.findViewById(R.id.Deskripsi_brand);
            mAirImg = (ImageView)itemView.findViewById(R.id.logo_brand);
        }

        public void bindTo(DataAir air){
            mCurrentMinuman = air;
            mAirImg.setImageResource(air.getGambar());
            mAirJudul.setText(air.getNama());
            mAirInfo.setText(air.getInfo());
        }
    }
}
