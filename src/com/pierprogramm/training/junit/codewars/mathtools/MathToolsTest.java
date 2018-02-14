package com.pierprogramm.training.junit.codewars.mathtools;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MathToolsTest {

    @Before
    public void setUp() throws Exception {
        mathTools = new MathTools(10);

    }

    private MathTools mathTools;

    @Test
    public void testPrimeGenerator() throws Exception {
        List<Integer> returnValue = mathTools.primeGenerator();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);

        assertEquals(expected, returnValue);
    }


    @Test
    public void testFactorGenerator() throws Exception {
        List<Integer> returnValue = mathTools.factorGenerator();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(5);

        assertEquals(expected, returnValue);
    }
}