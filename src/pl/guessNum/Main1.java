package pl.guessNum;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        guessNum();
    }

    static void guessNum() {
        Random r = new Random();
        int rand = r.nextInt(101);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int counter=1;
        while (true) {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("This is not the number, please input once again:");
            }
            int number = sc.nextInt();
            if (number < rand) {
                System.out.println("Too little! please input once again:");
                counter++;
            } else if (number > rand) {
                System.out.println("Too much! please input once again:");
                counter++;
            } else if (number == rand) {
                System.out.println("You guessed! CONGRATULATIONS!!! you guessed the "+ counter +" time");
                break;
            }
        }
        sc.close();
    }
}

