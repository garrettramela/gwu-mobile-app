package com.example.gwu_mobile_apps;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.ListView;
import android.widget.AdapterView;

public class Strength_Training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_training);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                    View v,
                                    int position,
                                    long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                if (position == 0) {     //workout 1
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=UItWltVZZmE"));
                    startActivity(intent);
                }
                if (position == 1) { //workout 2
                    //can't figure out how to programmatically get the html from the XML so I hardcoded in the values
                    // String choice  = ((SpannedString) listView.getItemAtPosition(position)).toString();
                    //System.out.println(choice);
                    //String link = (TextView)
                    intent.setData(Uri.parse("https://www.youtube.com/watch?v=vf8iaXr9Vmw"));
                    startActivity(intent);
                }
            }
        };

        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(itemClickListener);

    }
}