package com.company.myCls;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Probleme3 {

    public static void MyDate (String s){

//        String []p = s.split("-");
//
//        LocalDate localDate = LocalDate.of(Integer.parseInt(p[0]),Integer.parseInt(p[1]), Integer.parseInt(p[2]));
//
//        System.out.println(localDate.toString());

//        LocalDate localDate = LocalDate.parse(s);
//
//        System.out.println(localDate.toString());


//        LocalTime localTime = LocalTime.parse(s);
//
//        System.out.println(localTime.toString());


//        OffsetTime offsetTime = OffsetTime.parse(s);
//
//        System.out.println(offsetTime.toString());
//        System.out.println(offsetTime.toLocalTime().toString());
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(s);
//
//        LocalDate localDate = LocalDate.parse("01.16.2020",dateTimeFormatter);
//
//        System.out.println(localDate.toString());

    }


    public static void formatingDateTime(){


//         String myDateFormat =
//                 LocalDate.now().format(DateTimeFormatter.ofPattern("MMM~dd~yy"));

//        String myDateFormat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

//        String myDateFormat = ZonedDateTime.now().
//                format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss Z z"));


        String myDateFormat = OffsetDateTime.now().
                format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ"));

        System.out.println(myDateFormat);
    }

    public static void localNow(){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        String s1 = localDate.format(DateTimeFormatter.ofPattern("E MMM yyy"));
        System.out.println("Suntem in data de: " + s1);
        String s2 = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Ora este : " + s2);
    }

    public static void combineDateTime(){

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        String mystring = localDateTime.format(DateTimeFormatter.ofPattern("E yyyy MMM / HH:mm:ss"));

        System.out.println(mystring);

    }

    public static void timeViaInstant(){


      //  Instant instant = Instant.now();

      //  OffsetDateTime instant = OffsetDateTime.now();

//        Clock instant = Clock.systemUTC();
//
//        System.out.println(instant.instant());

        //convert string to instant -> string that follows the ISO-8601 standard

//        String s = "2021-10-17T13:57:13.969Z";
//
//        Instant i = Instant.parse(s);
//
//        System.out.println(i.toString());

        // adding, subtracting

//        Instant i = Instant.now().plus(5, ChronoUnit.DAYS);
//        System.out.println(i.toString());

//        Instant instant = Instant.now().minus(2,ChronoUnit.HOURS);
//        System.out.println(instant.toString());

        // comparing instant objects

//        Instant i1 = Instant.now();
//        Instant i2 = i1.plusSeconds(5);
//
//        System.out.println(i1.isAfter(i2));//expected result -> false
//
//        System.out.println(i1.isBefore(i2));//expected result -> true
//
//        long duration = i1.until(i2,ChronoUnit.SECONDS);
//
//        System.out.println(duration);
//
//        System.out.println();
//




    }











}
