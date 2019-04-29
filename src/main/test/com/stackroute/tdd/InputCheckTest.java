package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputCheckTest {
    InputCheck in;

    @Before
    public void setUp() throws Exception {

        in=new InputCheck();
    }

    @Test
    public void checkSymbol(){

        String result=in.characterCheck("+");
        assertEquals("Special Symbols",result);
    }

    @Test
    public void checkDigit(){

        String result=in.characterCheck("1");
        assertEquals("digit",result);
    }

    @Test
    public void checkUppercase(){

        String result=in.characterCheck("A");
        assertEquals("upper Case",result);
    }

    @After
    public void tearDown() throws Exception {
    }
}