package com.company;

import java.util.Arrays;

import static com.company.myCls.Probleme1.*;

public class Main {

    public static void main(String[] args) {


        String s = "Ana are mere";
        String s2 = "Carburator";
        String s3 = "leehel";
        String s4 = "abcabcabc";
        String s5 = "abc";
        String s6 = "bca";

        char c = '*';

        /*for(int i=0;i<(s3.length()/2); i++){

            if(s3.charAt(i)==s3.charAt((s3.length()-1)-i)){

                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
*/

        System.out.println(checkForAnagram(s5,s6));














    }
}
