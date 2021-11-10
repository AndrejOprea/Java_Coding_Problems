package com.company;



import com.company.Immutable.Coordonate;
import com.company.Immutable.MyImmuableClass;
import com.company.builders.BuilderPhone;
import com.company.builders.ExamplePhone;
import com.company.builders.Melon;
import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.company.myCls.Probleme1.*;
import static com.company.myCls.Probleme2.*;
import static com.company.myCls.Probleme3.*;
import static com.company.myCls.Probleme5.*;

import static com.company.Immutable.MyImmuableClass.*;
public class Main {

    public static void main(String[] args) {


      //  List<Integer>myList = Arrays.asList(4,2,1,null,2);

        //System.out.println(checkNullRef01(myList));
//Probleme1 p1 = null;
    //   checkNullRef02(p1);

      //  checkNullRef02("vw", null);

      //  Color myColor = new Color(77,33,100);

     //  checkNullRef04("vw",myColor);

       // System.out.println(checkRange(4,3,0,5));

        /*Coordonate coordonate = new Coordonate(3,new MyImmuableClass());

        coordonate.ic.setX(2);
        */

//        Coordonate coordonate = new Coordonate(4,new MyImmuableClass(2,3));
//
//        System.out.println(coordonate.getIc());

       /* BuilderPhone builderPhone = new BuilderPhone();
        builderPhone.setOs("Android").
                    setBattery(250).
                    setScreenSize(3000.90).
                    setCameraResolution(7986).
                    setProcessor("Intel");


        System.out.println(builderPhone.getPhone());
*/


//        String dateTime = "MM.dd.yyyy";
//
//        MyDate(dateTime);

      //  formatingDateTime();


        //localNow();

      //  combineDateTime();

       // timeViaInstant();

      //  definePeriod();

    //    getTimeUnits();

        //addAndSubtract();


   // getAllTimeZones();


       // getLocalDateTime();

      //  unix();

//        firstLastDayofMonth();

        //extractOffsets();

       // dateInstant();


        //dateIteration();

        //ageDetermination();

  //  startEndDay();

       // differenceBetweenDates();

       // implementChessClock();


//int[]a = {9,4,6,2,8};
//
////sortArray1(a);
////
////        System.out.println(Arrays.toString(a));
//
//        for(int i=0; i<sortArray2(a).size();i++){
//
//            System.out.println(sortArray2(a).get(i));
//        }

//        Melon []melons = new Melon[5];
//
//        melons[0] = new Melon(5);
//        melons[1] = new Melon(3);
//        melons[2] = new Melon(8);
//        melons[3] = new Melon(2);
//        melons[4] = new Melon(1);
//
//        Arrays.sort(melons, new Comparator<Melon>() {
//            @Override
//            public int compare(Melon o1, Melon o2) {
//                //ascending
//                //return Integer.compare(o1.getWeight(), o2.getWeight());
//
//                //descending
//                return (-1)*Integer.compare(o1.getWeight(), o2.getWeight());
//
//            }
//        });
//
//        System.out.println(Arrays.toString(melons));
//

       // System.out.println(Arrays.toString(sortArr3()));

//        int[]a={8,2,9,5,7};
//
//        int x = 6;
//
//        System.out.println(findElement(x,a));


//        Melon []melons = new Melon[5];
//
//        melons[0] = new Melon(5);
//        melons[1] = new Melon(3);
//        melons[2] = new Melon(8);
//        melons[3] = new Melon(2);
//        melons[4] = new Melon(1);
//
//
//        Melon x = new Melon(90);

      // boolean statement =  containsElement(melons,x);

       // System.out.println(containsElement(melons,melons[1]));



//       int[]a1 = {5,4,8,3};
//       int[]a2 = {8,4,5};
//
//        System.out.println(Arrays.equals(a1,a2));

//
//        Melon []melons = new Melon[5];
//
//        melons[0] = new Melon(5);
//        melons[1] = new Melon(3);
//        melons[2] = new Melon(8);
//        melons[3] = new Melon(2);
//        melons[4] = new Melon(1);
//
//        Melon tocontain = new Melon(5578);
//       // containsElement(melons,tocontain);
//        System.out.println(containsElement(melons,tocontain));

//        int[]a1 = {5,4,5,6};
//
//        minMaxAvg(a1);



       //fillArray(a);

       // reverseArr(a);
        int []a = {1,2,3};

        changeArrSize(a,9);




























    }
}
