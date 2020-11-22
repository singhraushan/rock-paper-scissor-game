package com.rau.mavericks_consulting.rockpaperscissor;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class PlayGameTest {

    //PlayerVsComputerGame game test
    @Test
    public void testShouldPlayOneGameWithROCKPlayerVsComputerGame() {
        String input = "R\nQ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new PlayerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }

    @Test
    public void testShouldNotPlayPlayerVsComputerGame() {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new PlayerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNull(result);
    }

    @Test
    public void testShouldPlayOneGameWithPaperPlayerVsComputerGame() {
        String input = "P\nQ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new PlayerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }

    @Test
    public void testShouldPlayOneGameWithScissorPlayerVsComputerGame() {
        String input = "S\nQ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new PlayerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }

    @Test
    public void testShouldPlayTwoGamePlayerVsComputerGame() {
        String input = "R\nP\nQ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new PlayerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }

    //ComputerVsComputerGame game test
    @Test
    public void testShouldPlayOnceComputerVsComputerGame() {
        String input = "N";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new ComputerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }

    @Test
    public void testShouldPlayTwiceComputerVsComputerGame() {
        String input = "Y\nN";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scan = new Scanner(in);
        PlayGame playGame = new ComputerVsComputerGame(scan);
        String result = playGame.playGame();
        Assert.assertNotNull(result);
    }
}
