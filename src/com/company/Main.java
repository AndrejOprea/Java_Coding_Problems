package com.company;



import com.company.Immutable.Coordonate;
import com.company.Immutable.MyImmuableClass;
import com.company.builders.BuilderPhone;
import com.company.builders.ExamplePhone;
import com.company.builders.Melon;
import com.company.myCls.Melons;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static com.company.myCls.Probleme1.*;
import static com.company.myCls.Probleme2.*;
import static com.company.myCls.Probleme3.*;
import static com.company.myCls.Probleme5.*;

import static com.company.Immutable.MyImmuableClass.*;
import static javafx.scene.input.KeyCode.V;

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
//        int []a = {1,2,3};
//
//        changeArrSize(a,9);



//        for(Integer i : immCollections()){
//
//            System.out.println(i);
//        }

       // System.out.println(immCollections());



        //getValueFromMap(map,5);

//        String s1 = map.getOrDefault(6,"nu este");
//
//        System.out.println(s1);

//        absentPresent(map,"trei");
//
//       mapRemoval(map,3);
//
//        for(Map.Entry<Integer,String>entry:map.entrySet()){
//
//            System.out.println(entry.getKey() +"-----"+entry.getValue());
//        }

//        replaceEntrances(map,2,"doisijumatate");
//
//
//        for(Map.Entry<Integer,String>entry:map.entrySet()){
//
//            System.out.println(entry.getKey() + "-----" +entry.getValue());
//        }

//        Map<Integer,String> map2 = new HashMap<>();
//
//        map2.put(6,"sase");
//        map2.put(7,"sapte");
//        map2.put(8,"opt");
//        map2.put(9,"noua");
//        map2.put(10,"zece");


       // System.out.println(compaireMaps(map, map2));
//        mergeMaps(map,map2);
//        for(Map.Entry<Integer,String>entry:map.entrySet()){
//
//            System.out.println(entry.getKey() + "-----" +entry.getValue());
//        }

//        Map<Integer,String> map = new HashMap<>();
//        map.put(5,"cc");
//        map.put(2,"dd");
//        map.put(3,"aa");
//        map.put(1,"z");
//
//        sortMap(map);
//
//
//        for(Map.Entry<Integer,String>entry:sortMap(map).entrySet()){
//
//            System.out.println(entry.getKey()+ "......."+entry.getValue());
//        }


//        Collection<String>c1 = new ArrayList<>();
//        Collection<String>c2 = new ArrayList<>();
//        Predicate<String>p1 = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//
//                return s.equals("s1");
//            }
//
//        };

//        Predicate<String>p3 = s -> s.equals("s5");
//        List<Integer>myList = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9));
//        Predicate<Integer>p2 = p -> p>5;

        //System.out.println(p2.test(myList.get(5)));


        //c2.add("s4");

//        for(String s: removeElem(c1,c2)){
//
//            System.out.println(s);
//        }

//        for(int i=0;i<conversionToArr(c1).length;i++){
//
//            System.out.println(conversionToArr(c1)[i]);
//        }

//        removeElem2(c1,p3);
//
//        for(String s: c1){
//            System.out.println(s);
//        }


        List<Melons>ml = new ArrayList<>();

        ml.add(new Melons(236,"t1"));
        ml.add(new Melons(300,"t2"));
        ml.add(new Melons(320,"t8"));
        ml.add(new Melons(180,"t6"));
        ml.add(new Melons(210,"t30"));

        List<String>sl = new ArrayList<>();

        sl.add("t2");
        sl.add("t30");
        sl.add("t6");

       List<Melons>melonsCollection = filterCollection(ml,sl);

//        for(int i=0; i< melonsCollection.size(); i++){
//
//            System.out.println(melonsCollection.get(i));
//        }
//relace using operator
//        sl.replaceAll(new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return s + "&&&???***";
//            }
//        });


//        for(int i=0; i<sl.size(); i++){
//
//            System.out.println(sl.get(i));
//        }



//        Stack<Integer>myS = new Stack<>();
//
//        myS.push(2);
//        myS.push(3);
//        myS.push(4);
//        myS.push(5);
//        myS.push(6);
//
//
//        stackUsage(myS);

       Queue<Integer>myQ = new ArrayDeque<>();

        myQ.add(1);
        myQ.add(2);
        myQ.add(3);
        myQ.add(4);
        myQ.add(5);

        queuesUsage(myQ);








    }
}
