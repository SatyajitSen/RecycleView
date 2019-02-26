package com.satyajitsentutul.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity {


    ImageView imgFlag;
    TextView txtName ;
    TextView txtDesc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_);

        txtName=findViewById(R.id.txtName);
        imgFlag=findViewById(R.id.img_country_flag);
        txtDesc=findViewById(R.id.txt_Desc);

        String getName=getIntent().getExtras().getString("name");
        int getFlag=getIntent().getExtras().getInt("flag");

        txtName.setText(getName);
        imgFlag.setImageResource(getFlag);

        if(getName.equals("Bangladesh"))
        {
            txtDesc.setText(R.string.bd);
        }

    }
}
