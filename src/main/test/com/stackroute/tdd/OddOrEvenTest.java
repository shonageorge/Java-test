package com.stackroute.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {

    OddOrEven oddeven;

    @Before
    public void setUp() {

        oddeven=new OddOrEven();                                      //object creation
    }

    @Test
    public void testOddEven() {
          String result=oddeven.oddEven(23);
          assertEquals("Tom",result);                        //condition to check if its even

    }
    @Test
    public void testRange() {
         String result=oddeven.oddEven(50);
         assertEquals("Invalid",result);                    //condition to check if its even
    }
}