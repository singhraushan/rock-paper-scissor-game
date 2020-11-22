package com.rau.mavericks_consulting.rockpaperscissor;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	new App().run();
        System.out.println("Thank you.");
    }
    public PlayGame run() {
        System.out.println("Enter 1 for: Player vs Computer\nEnter 2 for: Computer vs Computer\nEnter anything else to exit");
        PlayGame obj;
        Scanner scn = new Scanner(System.in);
        switch (scn.nextInt()) {
            case 1:
                obj = new PlayerVsComputerGame(scn);
                break;
            case 2:
                obj = new ComputerVsComputerGame(scn);
                break;
            default:
                System.out.println("Exiting.");
                return null;
        }
        obj.playGame();
        return obj;
    }
}
