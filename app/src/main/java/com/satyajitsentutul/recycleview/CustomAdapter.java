package com.satyajitsentutul.recycleview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    String countryName[] ;
    int img_flag[];
    Context context ;

    public CustomAdapter(Context context,String countryName[],int img_flag []){

        this.countryName=countryName;
        this.img_flag= img_flag ;
        this.context=context ;

    }
    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item,viewGroup,false);
        MyViewHolder vh=new MyViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder myViewHolder, final int position) {

        myViewHolder.txt_name.setText(countryName[position]);
        myViewHolder.imgCountryFlag.setImageResource(img_flag[position]);

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,countryName[position],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,Details_Activity.class);
                intent.putExtra("name",countryName[position]);
                intent.putExtra("flag",img_flag[position]);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_name;
        ImageView imgCountryFlag;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name=itemView.findViewById(R.id.txt_name);
            imgCountryFlag=itemView.findViewById(R.id.img_flag);
        }
    }
}
