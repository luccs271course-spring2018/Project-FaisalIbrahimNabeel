package com.luccomp163.faisalibrahimnabeel.gradeanalyzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*class T{
    double points;
    String name;

    T(double points){
        this.points = points;
    }
    T(String name) {
            this.name = name;
    }
}
*/
public class AddClassActivity extends AppCompatActivity {
    //public static final String COURSE_MAP = "com.example.myfirstapp.MESSAGE";
    //public static List<Object> courseAssignments = new ArrayList<>();
    public static final String COURSE_NAME = "com.example.myfirstapp.MESSAGE";
    HashMap<String, List<String>> courseMap = new HashMap<>();
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.COURSE_NAME);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        //String courseName = message;


        //Button
        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickCount += 1;

                LinearLayout linearLayout2=(LinearLayout)findViewById(R.id.linL2);
                LinearLayout linearLayout3=(LinearLayout)findViewById(R.id.linL3);
                LinearLayout linearLayout4=(LinearLayout)findViewById(R.id.linL4);
                LinearLayout linearLayout5=(LinearLayout)findViewById(R.id.linL5);

                if (clickCount > 0 && clickCount < 5) {

                    if (clickCount == 1) {
                        linearLayout2.setVisibility(View.VISIBLE);
                    } else if (clickCount == 2) {
                        linearLayout3.setVisibility(View.VISIBLE);
                    } else if (clickCount == 3) {
                        linearLayout4.setVisibility(View.VISIBLE);
                    } else if (clickCount == 4) {
                        linearLayout5.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

    }

    public void saveValues(View view) {
        /** Defines "intentCourseName". */
            /** receives the course's name from MainActivity. */
        Intent intentCourseName = getIntent();
            /** creates a String "courseNameHolder" to save the course's name from "intentCourseName". */
        String courseNameHolder = intentCourseName.getStringExtra(MainActivity.COURSE_NAME);

        /**Initiates a new Intent.
            // to open DisplayMessageActivity. */
        Intent intent = new Intent(this, DisplayMessageActivity.class);




        //HashMap<String, String> hashMap = new HashMap<String, String>();
        //hashMap.put("key", "value");
        //Intent intent = new Intent(this, MyOtherActivity.class);
        //intent.putExtra("map", hashMap);
        //startActivity(intent);

        //String courseName = courseNameHolder;

        // Do something in response to button click
        // USE: Float.valueOf(String) later.

        // The input of
        LinearLayout linearLayout2=(LinearLayout)findViewById(R.id.linL2);
        LinearLayout linearLayout3=(LinearLayout)findViewById(R.id.linL3);
        LinearLayout linearLayout4=(LinearLayout)findViewById(R.id.linL4);
        LinearLayout linearLayout5=(LinearLayout)findViewById(R.id.linL5);

        EditText editText10 = (EditText) findViewById(R.id.editText10);
        EditText editText11 = (EditText) findViewById(R.id.editText11);
        EditText editText12 = (EditText) findViewById(R.id.editText12);
        EditText editText13 = (EditText) findViewById(R.id.editText13);
        EditText editText14 = (EditText) findViewById(R.id.editText14);
        EditText editText15 = (EditText) findViewById(R.id.editText15);
        EditText editText16 = (EditText) findViewById(R.id.editText16);
        EditText editText17 = (EditText) findViewById(R.id.editText17);
        EditText editText18 = (EditText) findViewById(R.id.editText18);
        EditText editText19 = (EditText) findViewById(R.id.editText19);
        EditText editText20 = (EditText) findViewById(R.id.editText20);
        EditText editText21 = (EditText) findViewById(R.id.editText21);
        EditText editText22 = (EditText) findViewById(R.id.editText22);
        EditText editText23 = (EditText) findViewById(R.id.editText23);
        EditText editText24 = (EditText) findViewById(R.id.editText24);
        EditText editText25 = (EditText) findViewById(R.id.editText25);
        EditText editText26 = (EditText) findViewById(R.id.editText26);
        EditText editText27 = (EditText) findViewById(R.id.editText27);
        EditText editText28 = (EditText) findViewById(R.id.editText28);
        EditText editText29 = (EditText) findViewById(R.id.editText29);

        List<String> assignment1 = Arrays.asList(editText10.getText().toString(),
                editText11.getText().toString(), editText12.getText().toString(),
                editText13.getText().toString());
        courseMap.put(courseNameHolder, assignment1);
        //courseAssignments.add(assignment1);
        if (linearLayout2.getVisibility() == View.VISIBLE) {
            List<String> assignment2 = Arrays.asList(editText14.getText().toString(),
                    editText15.getText().toString(), editText16.getText().toString(), editText17.getText().toString());
            courseMap.put(courseNameHolder, assignment2);
            //courseAssignments.add(assignment2);
        }
        if (linearLayout3.getVisibility() == View.VISIBLE) {
            List<String> assignment3 = Arrays.asList(editText18.getText().toString(),
                    editText19.getText().toString(), editText20.getText().toString(), editText21.getText().toString());
            courseMap.put(courseNameHolder, assignment3);
            //courseAssignments.add(assignment3);
        }
        if (linearLayout4.getVisibility() == View.VISIBLE) {
            List<String> assignment4 = Arrays.asList(editText22.getText().toString(),
                    editText23.getText().toString(), editText24.getText().toString(), editText25.getText().toString());
            courseMap.put(courseNameHolder, assignment4);
            //courseAssignments.add(assignment4);
        }
        if (linearLayout5.getVisibility() == View.VISIBLE) {
            List<String> assignment5 = Arrays.asList(editText26.getText().toString(),
                    editText27.getText().toString(), editText28.getText().toString(), editText29.getText().toString());
            courseMap.put(courseNameHolder, assignment5);
            //courseAssignments.add(assignment5);
        }

        //String message1 = courseMap.toString();
        //intent.putExtra(COURSE_NAME, message1);

        //String courseName1 = message1;

        //String courseMapString = courseMap.toString();
        //intent.putExtra(COURSE_NAME, courseMapString);

        //Intent intent = new Intent(this, MyOtherActivity.class);

        //Create appState: an instance of the application state.
        // Used to retrieve data from and to the global "GradeAnalyzerClass"
        // Contains:
        //  1. The courses data in the form of Linkedlists, Maps, and Lists.
        //  2. The algorithm to predict the user's grade.

        GradeAnalyzerApplication appState = ((GradeAnalyzerApplication)this.getApplication());
        appState.service.SaveCourseValues(courseMap);

        /** Passes the course's name to the DisplayMessageActivity.*/
        intent.putExtra(COURSE_NAME, courseNameHolder);
        //intent.putExtra(COURSE_NAME, String.valueOf(courseAssignments));
        startActivity(intent);
    }
}

