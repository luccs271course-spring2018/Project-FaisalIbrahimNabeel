package com.luccomp163.faisalibrahimnabeel.gradeanalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import static com.luccomp163.faisalibrahimnabeel.gradeanalyzer.AddClassActivity.FINAL_ANSWER;

//import java.util.Scanner;
//import java.util.List;
//import java.util.Arrays;
//import java.util.str
public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Intent intent = getIntent();
        //HashMap<String, List<String>> courseMap = HashMap<String, List<String>>;
        //Log.v("HashMapTest", String.valueOf(hashMap.get("key")));

        Intent intent = getIntent();
        String message = intent.getStringExtra(AddClassActivity.FINAL_ANSWER);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);

        //gradePredictor();
    }
}
