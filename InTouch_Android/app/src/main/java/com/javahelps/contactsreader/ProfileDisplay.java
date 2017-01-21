package com.javahelps.contactsreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ProfileDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();

        TextView textview = (TextView) findViewById(R.id.name);
        String name = intent.getStringExtra("name");
        textview.setText(name);
    }
}
