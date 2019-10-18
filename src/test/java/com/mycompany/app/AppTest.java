package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try { Thread.sleep(10); } catch(Exception e) {}
        System.err.println("Hello, World!");
        assertTrue( true );
    }
}
