package com.stackroute.tdd;

import java.util.Scanner;

public class OddOrEven {

    public  String oddEven(int number){

        if(number>=20 && number<=30){

            if(number%2==0)                                       //check  the  number is even

              return "Jerry";

            else                                                    //check the number is odd
                return "Tom";


        }
        else
             return "Invalid";

    }



}
