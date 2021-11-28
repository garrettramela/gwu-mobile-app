package com.example.gwu_mobile_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Stretching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View v,
                                    int position,
                                    long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                if (position == 0) {     //neck stretches
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=AdUme1Z-DDE"));
                    startActivity(intent);
                }
                if (position == 1) { //pec stretches
                    //can't figure out how to programmatically get the html from the XML so I hardcoded in the values
                    // String choice  = ((SpannedString) listView.getItemAtPosition(position)).toString();
                    //System.out.println(choice);
                    //String link = (TextView)

                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=iaH0A4PhldQ&list=PLqMWsWQP14-0vq2F-Xiwr0G8DCD_23Bml&index=4"));
                    startActivity(intent);
                }
            }
        };

        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(itemClickListener);


    }
}


/*
forward bend: https://www.youtube.com/watch?v=hrp6Q_QyDkc
Seated spinal twist:  https://www.youtube.com/watch?v=xfv_hXg0_So*/
