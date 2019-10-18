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
        System.err.println("sleeping for some time " + new java.util.Date());
        try { Thread.sleep(20 * 1000); } catch(Exception e) {}
        System.err.println("waking up after some time " + new java.util.Date());
        System.err.println("Hello, World!");
        assertTrue( true );
    }
}
