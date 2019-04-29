package com.stackroute.tdd;

public class Palindrome {

    public static String palindromeCheck(int num){
        int i,j,flag=0,sum=0;
        int n=num;
        int length = String.valueOf(num).length();
        int[] array = new int[num];                         // initialize the array
        for (i = 0; i < length; i++) {                          // enter elements to array
            array[i] = num % 10;
            num = num / 10;
        }

        for (i = 0; i <length; i++) {
            for (j = length; j>=0; j--) {
                if (array[i] == array[j])
                    flag = 0;
                else
                    flag++;
            }
        }

        if (flag == 0) {
            for (i = 0; i <length; i++) {
                if (array[i] % 2 == 0) {
                    sum = sum + array[i];                            //finding sum of even numbers
                }
            }
            if (sum > 25)                                           // checking sum is greater than 25
//                System.out.println(n+" is palindrome and sum of even numbers is greater than 25");
                return "palindrome nd sum>25";

            else
//                System.out.println(n+" is palindrome and sum of even numbers is less than 25");
                return "palindrome nd sum<25";
        }

        else{
//            System.out.println(n + " is not palindrome");
            return "not palindrome";
        }
    }


}
