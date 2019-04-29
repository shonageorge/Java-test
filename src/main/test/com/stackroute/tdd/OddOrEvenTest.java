package com.stackroute.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {

    OddOrEven oddeven=new OddOrEven();

    @Before
    public void setUp() {
        oddeven=new OddOrEven();
    }

    @Test
    public void oddEven() {
//        String expectedValue="Tom";
//        String actualValue="Jerry";
          String result=oddeven.oddEven(23);
          assertEquals("Tom",result);

    }
    @Test
    public void range() {
         String result=oddeven.oddEven(50);
         assertEquals("Invalid",result);
    }
}