package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GuessNumberTest {
    GuessNumber number;

    @Before
    public void setUp() throws Exception {
        number=new GuessNumber();                             //object creation
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }

    @Test
    public void testGreater() {

        String result=number.numberGuess(20,30);                          //to check guessed number greater than original number
        assertEquals("Number guessed is more than original number",result);
    }
    
    @Test
    public void testLess(){

        String result=number.numberGuess(20,10);                         //to check guessed number less than original number
        assertEquals("Number guessed is less than original number",result);
    }
    
    @Test
    public void testEqual(){

        String result=number.numberGuess(20,20);                        //to check guessed number matches than original number
        assertEquals("Number guessed matches the original number",result);
    }
}