package com.company.myCls;

import com.company.builders.Melon;
import com.company.myCls.Melons;

import java.util.*;
import java.util.function.Predicate;
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

    public static void reverseArr(int[]arr){

        int[]reverse = new int[arr.length];

        int j=0;

        for(int i= arr.length-1; i>=0;i--){

            reverse[j]=arr[i];
            j++;
        }

        System.out.println(Arrays.toString(reverse));

    }

    public static void fillArray(int []arr){

//        for(int i=1; i<=10; i++){
//
//
//            arr[i]=i;
//        }
//
//        System.out.println(Arrays.toString(arr));

        Arrays.setAll(arr,t -> {
            if(t == 0){
                return arr[t];
            }else{
                return arr[t - 1] + 1;
            }
        });

        System.out.println(Arrays.toString(arr));

    }

    public static void nge(int []arr){
        int nge;
        for(int i=0; i<arr.length; i++){
            nge = -1;
            for(int j = i+1; j<arr.length; j++){

                if(arr[j]>arr[i]){

                    nge = arr[j];
                    break;
                }

            }
            System.out.println(arr[i] + ":" + nge);

        }


    }

    public static void changeArrSize(int[]arr, int item){

        int[]newArr = Arrays.copyOf(arr,arr.length+1);
        newArr[newArr.length-1] = item;

        System.out.println(Arrays.toString(newArr));


    }

    public static int immCollections(){

       final List<Integer> list = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5));

       // list.add(10);

        return list.get(0);

    }

    public static void getValueFromMap(Map<Integer,String>myMap, int myKey){

        //String s1 = map.getOrDefault(6,"nu este");

       for(Map.Entry<Integer,String> entry : myMap.entrySet()){

           if(entry.getKey().equals(myKey)){

               System.out.println(entry.getValue());
           }
       }
    }

    public static void absentPresent(Map<Integer,String>myMap, String v){

        for(Map.Entry<Integer,String>entry:myMap.entrySet()){

            if(entry.getValue().equals(v)){
                System.out.println("Am gasit valoarea !");
            }else{
                System.out.println("Try again !");
            }

        }

    }

    public static void mapRemoval(Map<Integer,String> myMap, int k){



      myMap.remove(k);
    }

    public static void replaceEntrances(Map<Integer,String> myMap, int newKey, String newValue){

        myMap.replace(newKey, myMap.get(newKey),newValue);



    }

    public static boolean compaireMaps(Map<Integer,String> myMap,Map<Integer,String> yourMap){

            return myMap.equals(yourMap);

    }

    public static void mergeMaps(Map<Integer,String> myMap,Map<Integer,String> yourMap){



        for(int i = 1; i<= myMap.size(); i++){

            myMap.merge(i, yourMap.get(i+5),String::concat);

        }




    }


    //de finalizat
    public static Map<Integer,String> performCopy(Map<Integer,String> myMap){

        //shallow copy

    myMap = new HashMap<>();

    //Map<Integer,String> shallow = new HashMap<>(myMap);
//    Map<Integer,String> shallow = new HashMap<>();
//
//    shallow.putAll(myMap);

        Map<Integer,String> deep = new HashMap<>();


    return deep;

    }

    public static Map<Integer,String> sortMap(Map<Integer,String> myMap){

        Map<Integer, String>map2 = new HashMap<>();

        List<Integer>l1 = new ArrayList<>(myMap.keySet());
        List<String>l2 = new ArrayList<>(myMap.values());

        Collections.sort(l1);
        Collections.sort(l2);

        for(int i =0; i< myMap.size(); i++){

            map2.put(l1.get(i),l2.get(i));
        }

        return map2;

    }

    //de vazut solutiile din carte
    public static Collection<String> removeElem(Collection<String>bigC,Collection<String>smallC){

       bigC.removeAll(smallC);


        return bigC;


    }


    public static boolean removeElem2(Collection<String>collection, Predicate<String> filter){

        return collection.removeIf(filter);
    }
    //de vazut solutiile din carte
    public static String[] conversionToArr (Collection<String>myCollection){

        return myCollection.toArray(new String[myCollection.size()]);

    }

    public static List<Melons> filterCollection(List<Melons> melonList, List<String>nameMelon){

        List<Melons>melonsCollection = new ArrayList<>();

       for(int i=0; i< melonList.size(); i++){

           for(int j=0; j< nameMelon.size(); j++){


               if(melonList.get(i).getType().equals(nameMelon.get(j))){

                   melonsCollection.add(melonList.get(i));

               }
           }
       }

        return melonsCollection;

    }

    public static void stackUsage(Stack<Integer>myStack){

       while(!myStack.isEmpty()){

           System.out.println(myStack.peek());

           myStack.pop();
       }





    }

    public static void queuesUsage(Queue<Integer>myQueue){


        while(!myQueue.isEmpty()){

            System.out.println(myQueue.peek());
            myQueue.remove();
        }
    }



}
