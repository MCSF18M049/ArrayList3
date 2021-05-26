package com.example.arraylist3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SeekBar seekBar=findViewById(R.id.seekBar);
        ListView listView=findViewById(R.id.listView);

        seekBar.setMax(40);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.i("Seekbar value is", String.valueOf(progress));
                int tablenum=progress;
                ArrayList <String> tableArraylist=new ArrayList<String>();
                for(int x=0;x<11;x++){
                    tableArraylist.add(Integer.toString(x*progress));
                    ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_activated_1,tableArraylist);
                    listView.setAdapter(arrayAdapter);

                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}