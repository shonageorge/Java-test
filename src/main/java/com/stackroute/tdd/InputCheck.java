package com.stackroute.tdd;

public class InputCheck {


        public String characterCheck(String s){

            char ch=s.charAt(0);                                        //convert string input to character
            if(Character.isDigit(ch)){                                  // check if the character is is digit
                return "digit";

            }
            else if(Character.isLowerCase(ch)){                         //check if lower case
                return "Lower Case";
            }
            else if(Character.isUpperCase(ch)){                         // check if upper case
                return "upper Case";
            }
            else{                                                        // else special characters
                return "Special Symbols";
            }
        }

    }
