package com.example.vharshinee.hello;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView2=(TextView) findViewById(R.id.textView2);
        Button ChangeFontSize= (Button) findViewById(R.id.button3);
        Button ChangeFontColor= (Button) findViewById(R.id.button2);
        Button ChangeFont= (Button) findViewById(R.id.button);
        ChangeFontSize.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView2.setTextSize(50);
            }
        });
        ChangeFontColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Log.d("okay",textView1.toString());
                textView2.setTextColor(Color.GREEN);
            }
        });
        ChangeFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
            }
        });
    }
}
