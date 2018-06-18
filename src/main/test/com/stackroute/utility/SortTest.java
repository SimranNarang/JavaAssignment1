package com.stackroute.utility;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SortTest {

	Sort s = new Sort();
    
    @Test
    public void testsortNumber() {
        ArrayList <Integer> actual = new ArrayList<Integer>();  
        actual = s.sortNumber(223);
        ArrayList <Integer> expected = new ArrayList<Integer>(){{
            add(3);
            add(2);
            add(2);
        }};
        assertTrue(actual.equals(expected));        
    }
    
    @Test
    public void testsumOfEven() {
        int actual = s.sumOfEven(223);
        assertEquals(4,actual);
    }

}
