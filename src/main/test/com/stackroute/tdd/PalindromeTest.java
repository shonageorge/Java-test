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

        check=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindromeAndMore() {

        String result=check.palindromeCheck(12321);
        assertEquals("palindrome nd sum<25",result);
    }
    @Test
    public void palindromeAndLess(){

        String result=check.palindromeCheck(2468642);
        assertEquals("palindrome nd sum>25",result);
    }
    @Test
    public void notPalindrome(){

        String result=check.palindromeCheck(24321);
        assertEquals("not palindrome",result);
    }
}