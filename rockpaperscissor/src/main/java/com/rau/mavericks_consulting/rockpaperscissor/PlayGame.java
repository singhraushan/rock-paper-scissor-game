package com.rau.mavericks_consulting.rockpaperscissor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public abstract class PlayGame {
    public Scanner console; //= new Scanner(System.in);
    protected int seedSize = 3;
    protected Random random = new Random();
    protected Map<Integer, String> numberMoveMap;
    public PlayGame(Scanner console){
        this.console = console;
    }
    {
        numberMoveMap = getNumberMoveMap();
    }
    
    protected abstract String playGame();

    protected String applyGameRule(int player1, int player2) {
        if (player1 == player2) {
            return "TIE";
        }
        if (player1 > player2) {
            return "WIN";
        }
        return "LOSE";
    }

    private Map<Integer, String> getNumberMoveMap() {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "ROCK");
        m.put(2, "PAPER");
        m.put(3, "SCISSOR");
        return m;
    }
}