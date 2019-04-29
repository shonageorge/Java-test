package com.stackroute.tdd;

public class InputCheck {


        public String characterCheck(String s){
            //Read the input

            char ch=s.charAt(0);                                        //convert string input to character
            if(Character.isDigit(ch)){                                  // check if the character is is digit
//                System.out.println("Digit");
                return "digit";

            }
            else if(Character.isLowerCase(ch)){                         //check if lower case
//                System.out.println("Lowecase");
                return "Lower Case";
            }
            else if(Character.isUpperCase(ch)){                         // check if upper case
//                System.out.println("Uppercase");
                return "upper Case";
            }
            else{                                                        // else special characters
//                System.out.println("Special Symbols");
                return "Special Symbols";
            }
        }

    }
