package com.company.myCls;

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








}
