package com.company.myCls;

import com.company.builders.Melon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Probleme5 {


    public static int[] sortArray1(int[]arr){

        int flag=1;

        do{
            flag=0;
            for(int i=0; i<arr.length-1; i++){

                if(arr[i]>arr[i+1]){
                    int aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;

                    flag=1;
                }
            }


        }while(flag==1);
        return arr;
    }

    public static List<Integer> sortArray2(int[]arr){

        List<Integer>myList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Collections.sort(myList);



        return myList;



    }

    public static int[] sortArrDesc(int [] arr){
        Arrays.sort(arr);
        int []arr2 = new int[arr.length];
        int j = 0;

        for(int i=arr.length-1; i>=0; i--){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }

    public static Integer[] sortArr3(){

        Integer[] integers = new Integer[]{3,1,5};

        Arrays.sort(integers);

        Arrays.sort(integers,Collections.reverseOrder());


        return integers;
    }

    public static boolean findElement(int el,int[]arr){

        for(int i=0; i<arr.length; i++){

           if(el==arr[i]){

               return true;
           }

        }
        return false;
    }

    public static boolean containsElement(Melon[]arr,Melon toContain){

//        for(Melon m:arr){
//            if(m.equals(toContain)){
//                return true;
//            }
//        }
//        return false;

      //  boolean statement = Arrays.asList(arr).contains(toContain);



        return true;

    }

    public static boolean containsElement2(Melon[]arr, Melon toContain){

        Comparator<Melon> c = Comparator.comparing(Melon::getWeight);

        Arrays.sort(arr,c);

        int index = Arrays.binarySearch(arr,toContain,c);
          if(index>=0){
              return true;
          }else{
              return false;
          }

    }

    public static void minMaxAvg(int[]arr){

//        Arrays.sort(arr);
//
//        System.out.println("min : " + arr[0]);
//        System.out.println("max : " + arr[arr.length-1]);
        double sum = 0;
        for(int x:arr){
            sum+=x;
        }

        System.out.println(sum/ arr.length);

    }



}
