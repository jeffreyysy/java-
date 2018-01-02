//GuessingGame.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 2 (GuessingGame)
//user gets 3 tries to guess a number between 1 to 10

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame{

  public static void main(String[] args){
    String userName;
    int userNum; //set varibale for user input on number
    int minNum = 1;
    int maxNum = 10;
    double randNum = (Math.random() * (maxNum - minNum) + minNum);

    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome to the number guessing game. What is your name?");
    userName = scnr.next(); //allows for user to type their name
    System.out.println();

    System.out.println("I'm thinking of an integer between 1 and 10. You have 3 guesses.\n");

    System.out.print("Your first guess: ");
    userNum = scnr.nextInt();
    //first guess is too low
    if (userNum < (int)(randNum)){
      System.out.println("Too low, guess higher.\n");

      //second guess since first guess was too low
      System.out.print("Your second guess: ");
      userNum = scnr.nextInt();
      //second guess is still too low
      if (userNum < (int)(randNum)) {
        System.out.println("Too low, guess higher.\n");

        //third guess since first and second guess failed
        System.out.print("Your third guess: ");
        userNum = scnr.nextInt();
        System.out.println();
        //third guess too low, user loses
        if (userNum < (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess too high user loses
        else if (userNum > (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess suceeds, user wins
        else {
          System.out.println("Congratulations " + userName + "!" + " You won in 3 guesses.");
        }
      }

      //second guess is too high
      else if (userNum > (int)(randNum)) {
        System.out.println("Too high, guess lower.\n");

        //third guess since first and second failed
        System.out.print("Your third guess: ");
        userNum = scnr.nextInt();
        System.out.println();
        //third guess too low, user fails
        if (userNum < (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess too high, user fails
        else if (userNum > (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess suceeds, user wins
        else {
          System.out.println("Congratulations " + userName + "!" + " You won in 3 guesses.");
        }
      }

      //user successfully guesses on the second try
      else {
        System.out.println();
        System.out.println("Congratulations " + userName + "!" + " You won in 2 guesses.");
      }

    }

    //first guess is too high
    else if (userNum > (int)(randNum)) {
      System.out.println("Too high, guess lower.\n");

      //second guess since first guess was too high
      System.out.print("Your second guess: ");
      userNum = scnr.nextInt();

      //second guess, guess is too low
      if (userNum < (int)(randNum)) {
        System.out.println("Too low, guess higher.\n");

        System.out.print("Your third guess: ");
        userNum = scnr.nextInt();
        System.out.println();
        //third guess is too low, user loses
        if (userNum < (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess is too high, user loses
        else if (userNum > (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //successfully gets it on third try, user wins
        else if (userNum == (int)(randNum)){
          System.out.println("Congratulations " + userName + "!" + " You won in 3 guesses.");
        }
      }

      //second guess, guess is too high
      else if (userNum > (int)(randNum)) {
        System.out.println("Too high, guess lower.\n");

        //third guess since first and second failed
        System.out.print("Your third guess: ");
        userNum = scnr.nextInt();
        System.out.println();
        //third guess too low, user loses
        if (userNum < (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess is too high, user loses
        else if (userNum > (int)(randNum)) {
          System.out.println("Game over " + userName + ", you lose.");
        }
        //third guess suceeds, user wins
        else {
          System.out.println("Congratulations " + userName + "!" + " You won in 3 guesses.");
        }
      }

      //user successfully guesses on the second try
      else {
        System.out.println();
        System.out.println("Congratulations " + userName + "!" + " You won in 2 guesses.");
      }
    }

    //user successfully guesses on the first try
    else {
      System.out.println();
      System.out.println("Congratulations " + userName + "!" + " You won in 1 guess.");
    }


  }
}
