package com.example.asd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.first_layout);

       b1=findViewById(R.id.sy2_1);
       b1.setOnClickListener(this);
        b2=findViewById(R.id.sy2_2);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.sy2_3);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.sy2_4);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sy2_1){
            Intent intent=new Intent(this,sy2and1.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy2_2){
            Intent intent=new Intent(this,sy2and5.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy2_3){
            Intent intent=new Intent(this,sy2and3.class);
            startActivity(intent);
        }else if(v.getId()==R.id.sy2_4){
            Intent intent=new Intent(this,sy2and2.class);
            startActivity(intent);
        }





    }
}