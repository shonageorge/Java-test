package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GuessNumberTest {
    GuessNumber number;

    @Before
    public void setUp() throws Exception {
        number=new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void greater() {

        String result=number.numberGuess(20,30);
        assertEquals("Number guessed is more than original number",result);
    }
    
    @Test
    public void less(){

        String result=number.numberGuess(20,10);
        assertEquals("Number guessed is less than original number",result);
    }
    
    @Test
    public void equal(){

        String result=number.numberGuess(20,20);
        assertEquals("Number guessed matches the original number",result);
    }
}