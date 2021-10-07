package com.company.myCls;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Probleme2 {


    public static int checkNullRef01(List<Integer>integers){

       /* List<Integer>myList = new ArrayList<>();
        myList.add(1);
        myList.add(null);
        myList.add(0);
        myList.add(null);

        myList.add(10);
        myList.add(5);
        myList.add(null);

        int counter= 0;

        for(int i=0; i<myList.size(); i++){

            if(myList.get(i)==null){

                counter++;
            }
        }

        System.out.println(counter);
*/

        if(integers == null){

            throw new IllegalArgumentException("List can not be null");
        }

        return integers.stream().filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();

    }

    public static void checkNullRef02(String name, String color){

       /* if(o == null){

            throw new NullPointerException("Object 'o' can t be null");

        }else{
            System.out.println("Bravo !!!");
        }*/

        class Car{

            private final String name;
            private final String color;

            public Car(String name,String color){

                this.name = Objects.requireNonNull(name,"Car name mandatory");
                this.color = Objects.requireNonNull(color, "Car color mandatory");
                System.out.println("My car is ready" +" "+ this.name+ " "+ this.color);
            }
        }
        Car car = new Car (name,color);
    }

    public static void checkNullRef03(int grade){

        if(grade<1 || grade>10){
            throw new IllegalArgumentException("Nota trebuie sa fie intre 1 si 10");

        }else{

            System.out.println("bravo !!!");
        }





    }

    public static String checkNullRef04(String name, Color color){

      /*  List<Integer>  mylist = Arrays.asList(3,4,null,5,6,100);

        for (int i = 0; i < mylist.size(); i++) {
            if(mylist.get(i)!=null){
                System.out.println(mylist.get(i));
            }else{
                System.out.println("101");
            }
        }
*/
        class Car{

            private final String name;
            private final Color color;

            public Car(String name,Color color){
                if(name==null){

                    this.name = "No name";

                }else{
                    this.name = name;
                }
                if(color==null){

                    this.color = new Color(0,0,0);
                }else{
                    this.color = color;
                }
            }

            @Override
            public String toString() {
                return "Car{" +
                        "name='" + name + '\'' +
                        ", color=" + color +
                        '}';
            }
        }
        Car car = new Car (name,color);


        return car.toString();



    }

    public static int checkRange(int x, int y, int min, int max){

        int dif = 0;

        if(x<min||x>max){
            throw new IndexOutOfBoundsException("X out of bounds");
        }else if(y>x){

            throw new IllegalArgumentException("Y can not be grater than X");

        }else{

            dif = x-y;
        }

       return dif;

    }

    public static void checkSubRange(int x, int y, int range){

        /*
        range = Objects.checkIndex(range, 100);

         */

        // Objects.checkFromToIndex(x,y,n);







    }

    public static void immutableClass(){


         final class MyClass {


            public final int x;
            public final int y;

            public MyClass(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

      /*  class OtherClass extends MyClass{


            public OtherClass(int x, int y) {
                super(x, y);
            }
        }*/

        // "OtherClass" can not inherit from MyClass



    }

















}
