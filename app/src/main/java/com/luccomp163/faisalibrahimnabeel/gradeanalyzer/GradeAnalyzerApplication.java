package com.luccomp163.faisalibrahimnabeel.gradeanalyzer;

import android.app.Application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Faisal on 11/14/17.
 */

class GradeAnalyzerApplication extends Application{

    // Creates new service instance.
    public GradeAnalyzerApplication service = new GradeAnalyzerApplication();

    public void SaveCourseValues(HashMap<String, Set<List<String>>> myCourseMap, String courseNameHolder){

        Set<List<String>> myAssignmentSet = new HashSet<>();

    }

    /** public void GradePredictor(courseName){
        ////Scanner clasname = new //Scanner(System.in);
        //System.out.println("Enter class name : ");
        String course;
        clas= clasname.next();

        ////Scanner grade= new //Scanner(System.in);
        System.out.println("Grade you want to receive : ");
        String grad;
        grad= grade.next();

        System.out.println("Enter Total number of assignments : ");
        //Scanner numassign = new //Scanner(System.in);
        int n = numassign.nextInt();

        System.out.println("Enter Total number of assignments graded so far : ");
        //Scanner assigngraded = new //Scanner(System.in);
        int ng= assigngraded.nextInt();

        //reader.close();
        //System.out.println("");
        String[] asname = new String[n];
        double[] mpoints= new double[n];
        double[] opoints= new double[n];
        double[] weightt= new double[n];
        for(int i=0; i<n; i++)
        {
            //Scanner //scanner = new //Scanner(System.in);
            System.out.print("Enter assignment names : ");
            String name;
            name = //scanner.next();
            ////Scanner assn= new //Scanner(System.in);
            //String[] array = new String[n];
            asname[i] = name;
        }
        for (int l=0; l<n; l++){
            //Scanner weigh = new //Scanner(System.in);
            System.out.println("Enter assignment weight for : " +asname[l]);
            double weight= weigh.nextDouble();
            weightt[l]=weight;
        }
        //System.out.println(Arrays.toString(array));
        for (int j=0; j<n; j++) {
            //Scanner read= new //Scanner(System.in);
            System.out.println("Enter Max points for  : " + asname[j]);
            double max= read.nextDouble();
            mpoints[j]= max;
        }
        //System.out.println(Arrays.toString(mpoints));
        for (int k=0; k<ng; k++){
            //Scanner rea= new //Scanner(System.in);
            System.out.println("Enter points obtained for  : " + asname[k]);
            double max= rea.nextDouble();
            opoints[k]= max;
        }
        if (n>ng){
            {
                double g=90;
                double percent;
                double a;
                double[] ws= new double[n];

                double totalmax=0;
                for(double q : mpoints) {
                    totalmax+=q;
                }
                double totalo=0;
                for(double e : opoints){
                    totalo+=e;
                }
                // double [] percent=new double[ng];
                //for(int o=0; o<n;o++){
                //  double per= (opoints[o]/mpoints[o])*weightt[o];
                //per=percent[o];
                //}
                //for(int y=0;y<ng;y++){

                //}
                //double totalweight=0;
                //for(double x:weightt){
                //  totalweight+=x;
                //}
                //double total=0;
                //for(double r: percent){
                //  total+=r;
                //}

                if (grad.equals("A")){
                    double pointsneeded= ((totalmax*0.9)-totalo)/(n-ng);
                    if (pointsneeded<(totalmax/n)) {
                        System.out.println("Points needed on each of the remaining assignments  " +
                                pointsneeded + " to still get " +grad + " in "+ clas );
                    }
                    //double weightneeded= 90-total;
                    //double percentneeded= weightneeded/(100-totalweight);
                    //double prediction[]= new double[n-ng-1];
                    //for(int kj=0; kj>=ng;kj++){
                    //  prediction[kj]=percentneeded*mpoints[kj];
                    //}
                    //System.out.println("Points needed on each of the remaining assignments  " +
                    //             percentneeded*100 + " to still get " +grad + " in "+ clas );

                    else {
                        System.out.println("Cannot get an A in this class");
                    }
                }}
            //else if (grad.equals("B")){
            //  double pointsneeded= ((totalmax*0.8)-totalo)/(n-ng);
            //if (pointsneeded<(totalmax/n)) {
            //  System.out.println("Points needed on each of the remaining assignments  " +
            //        pointsneeded + " to still get " +grad + " in "+ clas);
            //}
            //else {
            //  System.out.println("Cannot get a B in this class");
            //}
            //}
            //else if (grade.equals("C")){
            //  double pointsneeded= ((totalmax*0.7)-totalo)/(n-ng);
            //if (pointsneeded<(totalmax/n)) {
            //  System.out.println("Points needed on each of the remaining assignments  " +
            //        pointsneeded + " to still get " +grad + " in "+ clas);
            //}
            //else {
            //  System.out.println("Cannot get a C in this class");
            //}
            //}
            //else if (grade.equals("D")){
            //  double pointsneeded= ((totalmax*0.6)-totalo)/(n-ng);
            //if (pointsneeded<(totalmax/n)) {
            //  System.out.println("Points needed on each of the remaining assignments  " +
            //        pointsneeded + " to still get " +grad + " in "+ clas);
            //}
            //else {
            //  System.out.println("Cannot get a D in this class");
            //}
            //}
            //for(int h=0; h<n; h++){
            //  percent=opoints[h]/mpoints[h];
            //ws[h]= percent*weightt[h];
            //}
            //double totalw=0;
            //for(double u : ws){
            //   totalw+=u;
            //}


            //if (g<totalw){
            //  System.out.println("You have an A in the class");
            //}

        }
    }
    //double pre= 90-opoints[0];
    //pre= opoints[n-1];


    //System.out.println(Arrays.toString(opoints));
    // System.out.println("Classes      Max points     Points obtained");
    // for (int a=0; a<n;a++) {
    //   System.out.println(asname[a] + "      " + mpoints[a] + "      " + opoints[a]);
    //}
    //System.out.println("Points needed to still get a 90 in the class  : " + pre);
    }*/



}
