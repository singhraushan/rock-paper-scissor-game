package com.rau.mavericks_consulting.rockpaperscissor;

import java.util.Scanner;

public class ComputerVsComputerGame extends PlayGame {
    public ComputerVsComputerGame(Scanner scan ){
        super(scan);
    }
    protected String playGame() {
        String result=null;
        do {
            int player1 = random.nextInt(seedSize) + 1;
            int player2 = random.nextInt(seedSize) + 1;
            System.out.println("Computer move: " + numberMoveMap.get(player1) + " and " + numberMoveMap.get(player2));
            result = applyGameRule(player1, player2);
            System.out.println("Computer1 game result: " + result + "\nDo you want to play again? Y/N");

        } while (console.next().trim().equalsIgnoreCase("Y"));
        return result;
    }
}