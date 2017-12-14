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
        String message = intent.getStringExtra(AddClassActivity.COURSE_NAME);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);

        //gradePredictor();
    }

    //public void gradePredictor(){
        //Scanner clasname = new Scanner(System.in);
        //System.out.println("Enter class name : ");
        //String clas;
        //clas= clasname.next();

        //// Take in wanted final grade in course.

        //Scanner grade= new Scanner(System.in);
        //System.out.println("Grade you want to receive : ");
        //String grad;
        //grad= grade.next();

        //System.out.println("Enter Total number of assignments : ");
        //Scanner numassign = new Scanner(System.in);
        //int n = numassign.nextInt();

        //System.out.println("Enter Total number of assignments graded so far : ");
        //Scanner assigngraded = new Scanner(System.in);
        //int ng= assigngraded.nextInt();

        //reader.close();
        //System.out.println("");
        //String[] asname = new String[n];
        //double[] mpoints= new double[n];
        //double[] opoints= new double[n];
        //double[] weightt= new double[n];
        //for(int i=0; i<n; i++)
        //{
            //Scanner scanner = new Scanner(System.in);
            //System.out.print("Enter assignment names : ");
            //String name;
            //name = scanner.next();
            //Scanner assn= new Scanner(System.in);
            //String[] array = new String[n];
            //asname[i] = name;
        //}
        //for (int l=0; l<n; l++){
            //Scanner weigh = new Scanner(System.in);
            //System.out.println("Enter assignment weight for : " +asname[l]);
            //double weight= weigh.nextDouble();
            //weightt[l]=weight;
        //}
        //System.out.println(Arrays.toString(array));
        //for (int j=0; j<n; j++) {
            //Scanner read= new Scanner(System.in);
            //System.out.println("Enter Max points for  : " + asname[j]);
            //double max= read.nextDouble();
            //mpoints[j]= max;
        //}
        //System.out.println(Arrays.toString(mpoints));
        //for (int k=0; k<ng; k++){
            //Scanner rea= new Scanner(System.in);
                //System.out.println("Enter points obtained for  : " + asname[k]);
                //double max= rea.nextDouble();
                //opoints[k]= max;
        //}
        //if (n>ng){
            //{
            //double g=90;
            //double percent;
            //double a;
                //double[] ws= new double[n];

            //double totalmax=0;
            //for(double q : mpoints) {
                        //totalmax+=q;
                    //}
                    //double totalo=0;
                    //for(double e : opoints){
                    //totalo+=e;
                    //}
            //if (grad.equals("A")){
            //double pointsneeded= ((totalmax*0.9)-totalo)/(n-ng);
            //if (pointsneeded<(totalmax/n)) {
            //System.out.println("Points needed on each of the remaining assignments  " +
            //pointsneeded + " to still get " +grad + " in "+ clas );
            //}
            //else {
            //System.out.println("Cannot get an A in this class");
            //}
            //}
            //else if (grad.equals("B")){
            //double pointsneeded= ((totalmax*0.8)-totalo)/(n-ng);
            //if (pointsneeded<(totalmax/n)) {
            //System.out.println("Points needed on each of the remaining assignments  " +
                //pointsneeded + " to still get " +grad + " in "+ clas);
                //}
                //else {
                //System.out.println("Cannot get a B in this class");
                //}
                //}
                //else if (grade.equals("C")){
                    //double pointsneeded= ((totalmax*0.7)-totalo)/(n-ng);
                    //if (pointsneeded<(totalmax/n)) {
//                            System.out.println("Points needed on each of the remaining assignments  " +
//                                    pointsneeded + " to still get " +grad + " in "+ clas);
//                        }
//                        else {
//                            System.out.println("Cannot get a C in this class");
//                        }
//                    }
//                    else if (grade.equals("D")){
//                        double pointsneeded= ((totalmax*0.6)-totalo)/(n-ng);
//                        if (pointsneeded<(totalmax/n)) {
//                            System.out.println("Points needed on each of the remaining assignments  " +
//                                    pointsneeded + " to still get " +grad + " in "+ clas);
//                        }
//                        else {
//                            System.out.println("Cannot get a D in this class");
//                        }
//                    }
//                    //for(int h=0; h<n; h++){
//                    //  percent=opoints[h]/mpoints[h];
//                    //ws[h]= percent*weightt[h];
//                    //}
//                    //double totalw=0;
//                    //for(double u : ws){
//                    //   totalw+=u;
//                    //}
//
//
//                    //if (g<totalw){
//                    //  System.out.println("You have an A in the class");
//                    //}
//
//                }
//            }
//            //double pre= 90-opoints[0];
//            //pre= opoints[n-1];
//
//
//            //System.out.println(Arrays.toString(opoints));
//            // System.out.println("Classes      Max points     Points obtained");
//            // for (int a=0; a<n;a++) {
//            //   System.out.println(asname[a] + "      " + mpoints[a] + "      " + opoints[a]);
//            //}
//            //System.out.println("Points needed to still get a 90 in the class  : " + pre);
//        }
//}
}
