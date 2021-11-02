package com.company.myCls;

import java.util.Arrays;
import java.util.Collections;
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




}
