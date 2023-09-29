/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(scanner);
        game.run();
    }
    
}
