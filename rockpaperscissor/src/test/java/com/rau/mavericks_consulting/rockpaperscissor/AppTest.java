package com.rau.mavericks_consulting.rockpaperscissor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest
{
    App app;

    @Before
    public void setUp(){
        app = new App();
    }
    @Test
    public void testApp()
    {
        Assert.assertNotNull(new App());
    }

    @Test
    public void testShouldExit()
    {
    	String input = "3";
    	InputStream in = new ByteArrayInputStream(input.getBytes());
    	System.setIn(in);
    	Assert.assertEquals(app.run(),null);
    }
    @Test
    public void testShouldPlayPlayerVsComputerGame()
    {
        String input = "1\nN";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PlayGame obj = app.run();
        Assert.assertTrue(obj instanceof PlayerVsComputerGame);
    }
    @Test
    public void testShouldPlayComputerVsComputerGame()
    {
        String input = "2\nN";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PlayGame obj = app.run();
        Assert.assertTrue(obj instanceof ComputerVsComputerGame);
    }
}
