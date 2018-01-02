//GuessingGame.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 2 (GuessingGame)
//user gets 3 tries to guess a number between 1 to 10

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
  public static void main(String[] args){
    String userName;
    int userNum;
    int min = 1;
    int max = 10;
    double randNum = ((Math.random() * (max - min)) + min);

    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome to the number guessing game. What is your name?");
    userName = scnr.next(); //takes user's name
    System.out.println();

    System.out.println("I'm thinking of an integer between 1 and 10. You have 3 guesses.\n");

    System.out.print("Your first guess: ");
    userNum = scnr.nextInt(); //user's first guess

    //user doesnt guess correctly on first try
    if (userNum != (int)(randNum)) {

      //loop goes for three times or if user guesses correctly on 2nd or 3rd try
      for (int i = 1; i <= 3; i++) {
        //if guess is lower than random number
        if (userNum < (int)(randNum)) {
          System.out.println("Too low, guess higher.");
          //second guess
          if (i == 1) {
            System.out.println();
            System.out.print("Your second guess: ");
            userNum = scnr.nextInt();
          }
          //third guess
          else if (i == 2) {
            System.out.println();
            System.out.print("Your third guess: ");
            userNum = scnr.nextInt();
          }
          //user fails to guess the correct number
          else if (i == 3) {
            System.out.println();
            System.out.println("Game over " + userName + ", you lose.");
          }
        }

        //if guess is higher than random number
        else if (userNum > (int)(randNum)){
          System.out.println("Too high, guess lower.");
          //second guess
          if (i == 1) {
            System.out.println();
            System.out.print("Your second guess: ");
            userNum = scnr.nextInt();
          }
          //third guess
          else if (i == 2) {
            System.out.println();
            System.out.print("Your third guess: ");
            userNum = scnr.nextInt();
          }
          //user fails to guess the correct number
          else if (i == 3) {
            System.out.println();
            System.out.println("Game over " + userName + ", you lose.");
          }
        }

        //user successfully guesses the number on the 2nd or 3rd try
        else if (userNum == (int)(randNum)) {
          System.out.println();
          System.out.println("Congratulations " + userName + "! You won in " + i + " guesses.");
          break; //if user successfully guesses number on second try, loop stops
        }

      }
    }

    //user successfully guesses the number on the first try
    else if (userNum == (int)(randNum)) {
      System.out.println();
      System.out.println("Congratulations " + userName + "! You won in 1 guess.");
    }



  }

}
