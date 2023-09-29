/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Game {
    private final Scanner scanner;
    private int score;

    public Game() {
        this.scanner = new Scanner(System.in);    
        this.score = 0;
    }

    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.score = 0;
    }
    
    public void run(){
        Random random = new Random();
        boolean repeat = true;
        do {
            int secretNumber = random.nextInt(10) + 1;
            System.out.println("Нажмите 0 чтобы закончить программу");
            System.out.println("Задумано число от 1 до 10");
            
            int attempts = 3;
            
            while (attempts > 0){
                System.out.println("Какое число загадано?");
                System.out.print("Ваш ответ: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == 0) {
                    repeat = false;
                    break;
                } else if (userGuess == secretNumber) {
                    System.out.println("Вы угадали! Вы выиграли!");
                    score += 5;
                    break;
                } else {
                    System.out.println("Вы не угадали. Попробуйте еще раз.");
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("У вас осталось " + attempts + " попыток.");
                    } else {
                        System.out.println("У вас закончились попытки.Загаданное число было: "+ secretNumber);
                        score -= 3;
                    }
                }
            }
            System.out.println("Ваши баллы: " + score);
            
        } while (repeat);
        
    }
    
}
