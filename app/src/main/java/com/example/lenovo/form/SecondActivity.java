package com.example.lenovo.form;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lenovo on 1/23/2018.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView name2 = (TextView)findViewById(R.id.name2);
        final TextView number2 = (TextView)findViewById(R.id.number2);
        name2.setText(getIntent().getExtras().getString("NAME"));
        number2.setText(getIntent().getExtras().getString("PHONE NUMBER"));

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String Number = number2.getText().toString();
                 Intent callIntent = new Intent(Intent.ACTION_DIAL);
                 callIntent.setData(Uri.parse("tel:"+Number));
                 startActivity(callIntent);
             }
         });


    }
}
