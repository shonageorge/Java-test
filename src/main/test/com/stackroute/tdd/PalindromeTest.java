package com.stackroute.tdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome check;
    @Before
    public void setUp() throws Exception {

        check=new Palindrome();                                 //Object creation
    }

    @After
    public void tearDown() throws Exception {
        check=null;
    }

    @Test
    public void testPalindromeAndMore() {

        String result=check.palindromeCheck(12321);                  //to check if the sum of even numbers is greater than 25
        assertEquals("palindrome nd sum<25",result);
    }
    @Test
    public void testPalindromeAndLess(){

        String result=check.palindromeCheck(2468642);              //to check if the sum of even numbers is lower than 25
        assertEquals("palindrome nd sum>25",result);
    }
    @Test
    public void testNotPalindrome(){

        String result=check.palindromeCheck(24321);                //not palindrome case
        assertEquals("not palindrome",result);
    }
}