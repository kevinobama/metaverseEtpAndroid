package com.example.kevingates.metaverseetp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import 	android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final Button buttonLoadData = findViewById(R.id.loadDataButton);

        Button buttonLoadData = (Button)findViewById(R.id.loadDataButton);

        buttonLoadData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //Toast.makeText('test', 'test', duration).show();
                //System.out.println("the US");

                //editText
                EditText editText = (EditText)findViewById(R.id.editText1);
                editText.setText("Google is your friend.", TextView.BufferType.EDITABLE);
            }
        });

    }
}
