package com.stackroute.tdd;

import java.util.Scanner;

public class OddOrEven {

//    int number;
//
//    public OddOrEven(int number) {
//
//        this.number=number;
//
//    }

    public  String oddEven(int number){

        if(number>=20 && number<=30){

            if(number%2==0)                                       //check  the  number is even
//              System.out.println("Jerry");

              return "Jerry";


            else                                                    //check the number is odd
//                System.out.println("Tom");
                return "Tom";


        }
        else
//            System.out.println("invalid");
             return "Invalid";

    }



}
