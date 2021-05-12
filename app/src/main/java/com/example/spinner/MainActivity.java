package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner s1;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1=findViewById(R.id.s1);
        i1=findViewById(R.id.i1);

        String[] country= new String[]{"NONE","INDIA","USA","SRILANKA","ENGLAND","AUSTRAILA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,country);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s1.setAdapter(adapter);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    i1.setBackground(null);
                }
                if(position==1)
                {
                    i1.setBackground(getResources().getDrawable(R.drawable.in));
                }
                if(position==2)
                {
                    i1.setBackground(getResources().getDrawable(R.drawable.us));
                }
                if(position==3)
                {
                    i1.setBackground(getResources().getDrawable(R.drawable.sri));
                }if(position==4)
                {
                    i1.setBackground(getResources().getDrawable(R.drawable.en));
                }if(position==5)
                {
                    i1.setBackground(getResources().getDrawable(R.drawable.as));
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}