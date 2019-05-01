package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputCheckTest {
    InputCheck in;

    @Before
    public void setUp() throws Exception {

        in=new InputCheck();                                              //object creation
    }

    @Test
    public void testCheckSymbol(){

        String result=in.characterCheck("+");                           // to check if the input is special symbol
        assertEquals("Special Symbols",result);
    }

    @Test
    public void testCheckDigit(){

        String result=in.characterCheck("1");                            // to check if the input is special symbol
        assertEquals("digit",result);
    }

    @Test
    public void testCheckUppercase(){

        String result=in.characterCheck("A");                          //to check if uppercase
        assertEquals("upper Case",result);
    }

    @Test
    public void testCheckLowercase(){

        String result=in.characterCheck("a");                         //to check if uppercase
        assertEquals("Lower Case",result);
    }



    @After
    public void tearDown() throws Exception {
        in=null;
    }
}