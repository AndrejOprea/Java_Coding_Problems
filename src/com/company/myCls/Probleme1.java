package com.company.myCls;

import com.company.Main;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.BinaryOperator;

public class Probleme1 {

    //todo (P1): counting duplicate characters





    //todo; show method







    //todo (P3): reversing letters and words

    //Metoda1:




    //todo (P4): checking whether a string contains only digits

    public static boolean checkForNumbers(String str){

        for(int i=0; i<str.length(); i++){

            if(!Character.isDigit(str.charAt(i))){

                return false;
            }

        }

        return true;
    }

    public static List<Character> reverseArray(String s) {

        List<Character> myList = new ArrayList<>();

        for (char c : s.toCharArray()) {

            myList.add(c);
        }

        Collections.reverse(myList);

        return myList;

    }

    // todo (P2): find the first non-repeated character
    //todo !!!!!!!!!!!!! de discutat cu Bogdan
    public static void showCharacter(Map<Character, Integer> map) {

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(entry.getKey());
                break;
            }


        }


    }

    public static void showMap(Map<Character, Integer> map) {

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

    public static Map<Character, Integer> countDuplicates(String str) {

        Map<Character, Integer> myMap = new HashMap<>();
        int i = 1;

        for (char c : str.toCharArray()) {

            if (myMap.containsKey(c)) {

                myMap.put(c, myMap.get(c) + 1);

            } else {
                myMap.put(c, i);
            }
        }
        return myMap;

    }

    public static int counting_vowels1(String s){

        int counter = 0;

        int [] v = {65,69,73,79,85,97,101,105,111,117};

        for(char c: s.toCharArray()){

          for(int i=0; i<v.length; i++){

              if(c==v[i]){

                  counter++;
              }
          }
        }

        return counter;


    }

    public static int counting_vowels2(String s){

        int vocale = 0;

        Set<Character>dictionar = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for(int i=0; i<s.length(); i++){

            if(dictionar.contains(s.charAt(i))){
                vocale++;
            }
        }
        return vocale;
    }

    public static int[] vector_frecventa(String s){

        int f[] = new int[128];

        for(int i=0; i<s.length(); i++){

            f[s.charAt(i)]++;
        }
        return f;
    }

    public static int char_frequency(char c, String s){

        return vector_frecventa(s)[c];

    }

    public static void conversions(String s){

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti tipul in care vreti sa transformati stringul(int,long,float,double)" );
        String conversii = scanner.nextLine();


        switch(conversii){

            case ("int"):
                System.out.println(Integer.parseInt(s));
                break;
            case ("long"):
                System.out.println(Long.parseLong(s));
                break;

            case("float"):
                System.out.println(Float.parseFloat(s));
                break;
            case("double"):
                System.out.println(Double.parseDouble(s));
                break;

        }

    }

    public static void deleteSpaces1(String s){

        StringBuilder stringBuilder = new StringBuilder();
       for(Character c: s.toCharArray()){

           if(c!=32){

               stringBuilder.append(c);


           }


       }

        System.out.println(stringBuilder.toString());




    }

    public static void joinStrings(char c,String...args){

        StringBuilder sb = new StringBuilder(args.length+1);

        for(int i=0; i< args.length; i++){

            sb.append(args[i]).append(c);
        }

        System.out.println(sb.toString());



    }

    public static void allPermutations(String s){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<s.length()-1; i++){

            for(int j=0; j<s.length()-1; j++){

                if(i!=j){

                    stringBuilder.append(s.charAt(i)).append(s.charAt(j)).append(s.charAt(j+1)).append(" ");
                }

            }


        }

        System.out.println(stringBuilder.toString());
    }

    //???

    public static boolean isPalindrome(String s){

        for(int i=0; i<(s.length()/2);i++){

            if(s.charAt(i)==s.charAt((s.length()-1)-i)){
                return true;
            }

        }


        return false;
    }

    public static String deleteDuplicates(String s){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){

           if(sb.indexOf(String.valueOf(s.charAt(i)))==-1){

               sb.append(s.charAt(i));
           }

        }

         return sb.toString();


    }

    public static String remove_char(String s, char c){


        StringBuilder stringBuilder = new StringBuilder();
        for(Character x: s.toCharArray()){

            if(x!=c){

                stringBuilder.append(x);

            }

        }

        return stringBuilder.toString();



    }
//???
    /*public static int charMostPresent(String s){
        int max = Collections.max(Arrays.asList(vector_frecventa(s)));

        return max;


    }*/

    public static String [] addStrings(String...args){

        String [] strings = new String[args.length];

        for(int i=0; i<args.length; i++){

            strings[i]=args[i];
        }

        return strings;
    }

    public static String [] sortByLength(String []s){

          Arrays.sort(s, new Comparator<String>() {
              @Override
              public int compare(String o1, String o2) {
                  return o1.length()-o2.length();
              }
          });

      return s;


    }

    public static boolean containsSubStr(String str,String subStr){

        for(int i=0; i<str.length()-2; i++){

            if(subStr.equals(str.substring(i,i+3))){

                return true;
            }
        }

        return false;
    }

    public static int subStrFreq(String str, String subStr){

        int counter = 0;

        for(int i=0; i<str.length()-2; i++){

            if(subStr.equals(str.substring(i,i+3))){

                counter++;


            }
        }


        return counter;

    }
//???
    public static boolean checkForAnagram(String s1,String s2){

        int[]v1 = vector_frecventa(s1);
        int[]v2 = vector_frecventa(s2);

        Arrays.sort(v1);
        Arrays.sort(v2);

        for(int i=0; i <v2.length; i++){


            return v1[i]==v2[i];

        }

        return false;
    }

    public static String stringConcat(String s1, int n){
        String text = "";

        for(int i=0; i<n; i++){

            text += s1;

        }
        return text;
    }

    public static String removingSpaces(String s){

        String trimmed = s.trim();

        return trimmed;
    }

    public static String longestPrefix(String s1, String s2){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i< Math.min(s1.length(),s2.length()); i++){

            if(s1.charAt(0)==s2.charAt(0)&&s1.charAt(i)==s2.charAt(i)){

                sb.append(s1.charAt(i));
            }

        }
        return sb.toString();
    }
//???
    public static void applyIndent(String s1, int n){


        String indent = "";
        for(int i=0; i<n; i++){
            s1 = indent+s1;
            indent = "-"+ indent;


            System.out.println(s1);
        }












    }
//???
    public static String transformString(String s1){




        return s1;
    }

    public static Map<String,Integer> minMax(int a, int b){

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("maximum",Math.max(a,b));
        myMap.put("minimum",Math.min(a,b));

        return myMap;


    }

    public static int sumLargeNumb(){

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        BinaryOperator<Integer>op = Math::addExact;

        int sum = op.apply(x,y);

        return sum;



    }
//???
    public static void unsignedNumb(String s){





    }

    public static void logicals(boolean b1, boolean b2){


        System.out.println(Boolean.logicalAnd(b1,b2));
        System.out.println(Boolean.logicalOr(b1,b2));
        System.out.println(Boolean.logicalXor(b1,b2));


    }

    public static void transformBigInt(){


      BigInteger x = BigInteger.valueOf(Long.MAX_VALUE);
      long xLong = x.longValue();
      int xInt = x.intValueExact();

        System.out.println(xInt);



    }

    public static void convertLongToInt(){

        long maxLong = Long.MAX_VALUE;

       // not correct ---> int x = (int)maxLong;

        int x = Math.toIntExact(maxLong);

        System.out.println(x);

    }

    public static void floorDivision(int a, int b){

        int result1 = Math.floorDiv(a,b);
        int result2 = Math.floorMod(a,b);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static void multiplyLargeNumb(){

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        // nu e corect ---> int result1 = a*b;


        int result2 = Math.multiplyExact(a,b);



        System.out.println(result2);



    }

    public static void nextFloatValue(){

        float f = 0.1f;

        float nextFloat1 = Math.nextAfter(f,Float.NEGATIVE_INFINITY);
        float nextFloat2 = Math.nextAfter(f, Float.POSITIVE_INFINITY);

        float down = Math.nextDown(f);
        float up = Math.nextUp(f);

        System.out.println(nextFloat1);
        System.out.println(nextFloat2);
        System.out.println(down);
        System.out.println(up);
        //same for "double"
    }

    public static void multiplyLarge(){

       long x = Long.MAX_VALUE;
       long y = Long.MAX_VALUE;
       long z1 = Math.multiplyExact(x,y);

     //   long z2 = Math.multiplyHigh(x,y); -> available in jdk 9

        System.out.println(z1);

    }
















}
