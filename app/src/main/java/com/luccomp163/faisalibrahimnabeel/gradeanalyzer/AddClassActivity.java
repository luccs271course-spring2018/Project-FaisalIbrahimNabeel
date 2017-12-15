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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    HashMap<String, Set<List<String>>> courseMap = new HashMap<>();
    Set<List<String>> assignmentSet = new HashSet<>();
    int clickCount = 0;

    public static double WEIGHT_OBTAINED = 0.0;
    public static double WEIGHT_NEEDED;
    public static double GRADE_VALUE;
    public static double POINTS_REQUIRED;
    //public static String FINAL_ANSWER;


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
        final Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickCount += 1;

                LinearLayout linearLayout2= findViewById(R.id.linL2);
                LinearLayout linearLayout3= findViewById(R.id.linL3);
                LinearLayout linearLayout4= findViewById(R.id.linL4);
                LinearLayout linearLayout5= findViewById(R.id.linL5);

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

        /** The input of the assignments for each course consist 5 fields of:
         *      LinearLayouts, each containing 4 fields of:
         *          EditText (plain text) fields.
         * * Currently, the App only supports 5 assignments for the user to input.
         * * The First LinearLayout is not defined here because we will not need
         *   to check if it's visible or not since it'll always be available to
         *   the user.
         * * The other 4 layouts are defined in order to check their visibility
         *   status and therefore determine in an if-statement if we will need
         *   to save the values within the EditText fields inside them*/

        LinearLayout linearLayout2 = findViewById(R.id.linL2);
        LinearLayout linearLayout3 = findViewById(R.id.linL3);
        LinearLayout linearLayout4 = findViewById(R.id.linL4);
        LinearLayout linearLayout5 = findViewById(R.id.linL5);

        /** All EditText fields (mentioned) earlier are defined*/
        EditText editText10 = findViewById(R.id.editText10);
        EditText editText11 = findViewById(R.id.editText11);
        EditText editText12 = findViewById(R.id.editText12);
        EditText editText13 = findViewById(R.id.editText13);
        EditText editText14 = findViewById(R.id.editText14);
        EditText editText15 = findViewById(R.id.editText15);
        EditText editText16 = findViewById(R.id.editText16);
        EditText editText17 = findViewById(R.id.editText17);
        EditText editText18 = findViewById(R.id.editText18);
        EditText editText19 = findViewById(R.id.editText19);
        EditText editText20 = findViewById(R.id.editText20);
        EditText editText21 = findViewById(R.id.editText21);
        EditText editText22 = findViewById(R.id.editText22);
        EditText editText23 = findViewById(R.id.editText23);
        EditText editText24 = findViewById(R.id.editText24);
        EditText editText25 = findViewById(R.id.editText25);
        EditText editText26 = findViewById(R.id.editText26);
        EditText editText27 = findViewById(R.id.editText27);
        EditText editText28 = findViewById(R.id.editText28);
        EditText editText29 = findViewById(R.id.editText29);

        /** A type:List<String> is defined to hold the EditText values in each assignment
         *      All EditText fields are casted into Strings to ease the latter conversion
         *      in Class/Singleton:"GradeAnalyzerApplication.java".
         * * Each of the Lists then are added to a type:HashMap <String, List<String>> variable
         *   called "courseMap" which will be sent later to our "GradeAnalyzerApplication" for
         *   analysis and data structuring.
         * * The key-values for the Map is formatted such that:
         *   * The key is the course's name -> "courseNameHolder"
         *   * The value is the Set of Lists of assignments, each List containing a String value of:
         *     * The maximum amount of points for that assignment.
         *     * The current amount of points for that assignment.
         *     * The weight which each assignment holds toward the total grade.*/
        List<String> assignment1 = Arrays.asList(editText10.getText().toString(),
                editText11.getText().toString(), editText12.getText().toString(),
                editText13.getText().toString());
        assignmentSet.add(assignment1);
        //courseMap.put(courseNameHolder, assignment1);
        //courseAssignments.add(assignment1);
        if (linearLayout2.getVisibility() == View.VISIBLE) {
            List<String> assignment2 = Arrays.asList(editText14.getText().toString(),
                    editText15.getText().toString(), editText16.getText().toString(), editText17.getText().toString());
            assignmentSet.add(assignment2);
            //courseMap.put(courseNameHolder, assignment2);
            //courseAssignments.add(assignment2);
        }
        if (linearLayout3.getVisibility() == View.VISIBLE) {
            List<String> assignment3 = Arrays.asList(editText18.getText().toString(),
                    editText19.getText().toString(), editText20.getText().toString(), editText21.getText().toString());
            assignmentSet.add(assignment3);
            // courseMap.put(courseNameHolder, assignment3);
            //courseAssignments.add(assignment3);
        }
        if (linearLayout4.getVisibility() == View.VISIBLE) {
            List<String> assignment4 = Arrays.asList(editText22.getText().toString(),
                    editText23.getText().toString(), editText24.getText().toString(), editText25.getText().toString());
            assignmentSet.add(assignment4);
            //courseMap.put(courseNameHolder, assignment4);
            //courseAssignments.add(assignment4);
        }
        if (linearLayout5.getVisibility() == View.VISIBLE) {
            List<String> assignment5 = Arrays.asList(editText26.getText().toString(),
                    editText27.getText().toString(), editText28.getText().toString(), editText29.getText().toString());
            assignmentSet.add(assignment5);
            //courseMap.put(courseNameHolder, assignment5);
            //courseAssignments.add(assignment5);
        }

        //String message1 = courseMap.toString();
        //intent.putExtra(COURSE_NAME, message1);

        //String courseName1 = message1;

        //String courseMapString = courseMap.toString();
        //intent.putExtra(COURSE_NAME, courseMapString);

        //Intent intent = new Intent(this, MyOtherActivity.class);
        /** assign the final Set as the value for the course's key. */
        courseMap.put(courseNameHolder, assignmentSet);

        /** Defines EditText2 (the plain text holding the wanted Grade
         *  and saves it in String "gradeRequired".
         */

        EditText editText2 = findViewById(R.id.editText2);
        String gradeRequired = editText2.getText().toString();

        /** Create appState: an instance of the application state.
         * * Used to retrieve data from and to the global "GradeAnalyzerClass" that contains:
         *   * 1.Data storage of:
         *     * All courses using LinkedLists.
         *     * The assignments of each coursGradePredictorApplicatione using HashMaps.
         *     * The grades and description of each assignment using Lists.
         *   * 2.The algorithm to predict the user's grade.*/


        SaveCourseValues(courseMap, courseNameHolder, gradeRequired);

        /** Passes the course's name to the DisplayMessageActivity then starts that activity*/
        intent.putExtra(FINAL_ANSWER, courseNameHolder);
        //intent.putExtra(COURSE_NAME, String.valueOf(courseAssignments));
        //GradePredictorApplication.getInstance();
        //GradePredictorApplication.SaveCourseValues
        startActivity(intent);
    }

    public String SaveCourseValues(HashMap<String, Set<List<String>>> myCourseMap,
                                 String courseNameHolder, String gradeRequired){

        //Set<List<String>> myAssignmentSet = new HashSet<>();

        String finalAnswer;

        switch (gradeRequired) {
            case "A":
                GRADE_VALUE = 93;
                break;
            case "A-":
                GRADE_VALUE = 89;
                break;
            case "B+":
                GRADE_VALUE = 85;
                break;
            case "B":
                GRADE_VALUE = 80;
                break;
            case "B-":
                GRADE_VALUE = 75;
                break;
            case "C+":
                GRADE_VALUE = 70;
                break;
            case "C":
                GRADE_VALUE = 65;
                break;
            case "C-":
                GRADE_VALUE = 60;
                break;
            case "D+":
                GRADE_VALUE = 55;
                break;
            case "D":
                GRADE_VALUE = 50;
                break;
            default:
                GRADE_VALUE = 0.0;
                break;
        }

        for(List<String> assignmentList: myCourseMap.get(courseNameHolder)){
            System.out.println(assignmentList);

            if(assignmentList.get(1) != ""){
                WEIGHT_OBTAINED += (Double.parseDouble(assignmentList.get(1))
                        / Double.parseDouble(assignmentList.get(2))) * Double.parseDouble(assignmentList.get(3));
            }else if(assignmentList.get(1) == ""){
                WEIGHT_NEEDED = GRADE_VALUE - WEIGHT_OBTAINED;
                POINTS_REQUIRED = (WEIGHT_NEEDED / Double.parseDouble(assignmentList.get(3)))
                        * Double.parseDouble(assignmentList.get(2));
                finalAnswer = "You need to get "
                        + POINTS_REQUIRED + " points in " + assignmentList.get(0)
                        + " to receive a(an) " + gradeRequired + " in " + courseNameHolder;
            }
        }

    }
public void onClick(android.view.View view) {}}

