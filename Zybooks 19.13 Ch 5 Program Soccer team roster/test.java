import java.util.Scanner;

public class test {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    final int TOTAL = 5;
    int[] jersey = new int[TOTAL];
    int[] players = new int[TOTAL];
    int i = 0;

    for (i = 0; i < TOTAL; i++) {
      System.out.println("Enter player " + (i + 1) + "'s jersey number:");
      jersey[i] = scnr.nextInt();
      System.out.println("Enter player " + (i + 1) + "'s rating:");
      players[i] = scnr.nextInt();
      System.out.println();
    }

    System.out.println("ROSTER");

    for (i = 0; i < TOTAL; i++) {
      System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + players[i]);
    }
    System.out.println();

    printMenu();
    char userInput = scnr.next().charAt(0);
    System.out.println();

    while (userInput != 'q') {
      switch(userInput){
        case 'u':
        System.out.println("Enter a jersey number:");
        int test = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        int test1 = scnr.nextInt();
        for (i = 0; i < TOTAL; i++) {
          if (test == jersey[i]){
            players[i] = test1;
          }
        }
        System.out.println();
        printMenu();
        userInput = scnr.next().charAt(0);
        System.out.println();
        break;

        case 'a':
        System.out.println("Enter a rating:");
        int test2 = scnr.nextInt();
        System.out.println();
        System.out.println("ABOVE " + test2);
        for (i = 0; i < TOTAL; i++) {
          if (test2 < players[i]) {
            System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + players[i]);
          }
        }
        System.out.println();
        printMenu();
        userInput = scnr.next().charAt(0);
        System.out.println();
        break;

        case 'r':
        System.out.println("Enter a jersey number:");
        int test3 = scnr.nextInt();
        for (i = 0; i < TOTAL; i++) {
          if (test3 == jersey[i]) {
            System.out.println("Enter a new jersey number:");
            int test5 = scnr.nextInt();
            System.out.println("Enter a rating for the new player:");
            int test6 = scnr.nextInt();
            for (i = 0; i < TOTAL; i++) {
              if (test3 == jersey[i]) {
                jersey[i] = test5;
                players[i] = test6;
              }
            }
          }
        }

        System.out.println();
        printMenu();
        userInput = scnr.next().charAt(0);
        System.out.println();
        break;

        case 'o':
        System.out.println("ROSTER");
        for (i = 0; i < TOTAL; i++) {
          System.out.println("Player " + (i + 1) + " -- Jersey number: " + jersey[i] + ", Rating: " + players[i]);
        }
        System.out.println();
        printMenu();
        userInput = scnr.next().charAt(0);
        System.out.println();
        break;
      }
    }


  }

  public static void printMenu() {
    System.out.println("MENU");
    System.out.println("u - Update player rating");
    System.out.println("a - Output players above a rating");
    System.out.println("r - Replace player");
    System.out.println("o - Output roster");
    System.out.println("q - Quit");
    System.out.println();
    System.out.print("Choose an option:");

  }


}
