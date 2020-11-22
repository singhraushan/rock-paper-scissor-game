package com.rau.mavericks_consulting.rockpaperscissor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayerVsComputerGame extends PlayGame {
    public PlayerVsComputerGame(Scanner scan ){
        super(scan);
    }
    protected String playGame() {
        System.out.println("Enter R for: ROCK\nEnter P for: PAPER\nEnter S for: SCISSOR\nEnter anything else to quit");
        String pressedKey = console.next().trim().toUpperCase();
        Map<String, Integer> map = getKeywordIdentityMap();
        String result=null;
        while (map.get(pressedKey) != null) {
            int computerInput = random.nextInt(seedSize) + 1;
            System.out.println("Computer input: " + numberMoveMap.get(computerInput));
            result = applyGameRule(map.get(pressedKey), computerInput);
            System.out.println("Your game result: " + result + "\nDo you want to play again? Enter R/P/S for: ROCK/PAPER/SCISSOR respectively.Anything else to quit");
            pressedKey = console.next().trim().toUpperCase();
        }
        return result;
    }

    private Map<String, Integer> getKeywordIdentityMap() {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("R", 1);
        m.put("P", 2);
        m.put("S", 3);
        return m;
    }
}