//ReadFile.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 3 (Data Analysis)
//takes in an array of numbers and analyzes the highest, lowest, and average

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class ReadFile {

  //global variables for the methods
  static final int TOTAL = 168;
  static double[] average = new double[TOTAL];

  public static void main(String[] args) {
    populateArray();
    menuOption();
    findHighestYearIndex(average);
    findLowestYearIndex(average);
    findAverage(average);

    Scanner scnr = new Scanner(System.in);
    String userInput = scnr.next();
    DecimalFormat df = new DecimalFormat("####.00");

    //loops for one of the three user inputs "average, highest, or lowest" to output a statement
    while(userInput != "quit") {

      switch (userInput) {
        case "average": //outputs the average of all the numbers in the txt file
        System.out.println("Average rainfall since 1849: " + df.format(findAverage(average)) + " inches");
        System.out.println();
        System.out.println("Enter the option \"average\", \"highest\", \"lowest\":");
        userInput = scnr.next();
        break;

        case "highest": //outputs the highest number in the txt file
        System.out.println("Highest rainfall since 1849: " + average[findHighestYearIndex(average)] + " inches which occured during year " + (1849 + findHighestYearIndex(average)));
        System.out.println();
        System.out.println("Enter the option \"average\", \"highest\", \"lowest\":");
        userInput = scnr.next();
        break;

        case "lowest": //outputs the lowest number in the txt file
        System.out.println("Lowest rainfall since 1849: " + average[findLowestYearIndex(average)] + " inches which occured during year " + (1849 + findLowestYearIndex(average)));
        System.out.println();
        System.out.println("Enter the option \"average\", \"highest\", \"lowest\":");
        userInput = scnr.next();
        break;

        case "quit": //exits the loop
        System.out.println("Program done.");
        return;

        default: //user types the wrong input String
        System.out.println("Invalid input");
        System.out.println();
        System.out.println("Enter the option \"average\", \"highest\", \"lowest\":");
        userInput = scnr.next();
        break;
      }
    }
  }


  //shows the user the given choices
  public static void menuOption() {
    System.out.println("average - average of all yearly rain totals in the dataset");
    System.out.println("highest - highest amount of rainfall for that year");
    System.out.println("lowest - lowest amount of rainfall for that year");
    System.out.println("quit - exit program");
    System.out.println();
    System.out.println("Enter the option \"average\", \"highest\", \"lowest\":");
  }

  //assigns the values in the txt file to the array
  public static double[] populateArray() {
    int i = 0;
    //got concept from course website
    try {
      //reads .txt file
      File f = new File("rainfall.txt");
      Scanner scnr = new Scanner(f);
      while(scnr.hasNextDouble()) {
        for (i = 0; i < TOTAL; i++) {
          average[i] = scnr.nextDouble(); //sets the array with the given numbers in the .txt file
        }
      }
    }
    catch(FileNotFoundException ex) {
      System.out.println("File not Found");
    }

    return average;
  }

  //searches array for lowest rainfall average and returns its index
  public static int findHighestYearIndex(double[] average) {
    int i = 0;
    int x = 0;
    double highest = average[i];
    for (i = 0; i < TOTAL; i++) {
      if (average[i] >= highest) {
        highest = average[i]; // udpates everytime the there is a new high average
        x = i; //new index of the highest average if (double highest) is updated
      }
    }
    return x; //index of the highest average
  }

  //searches array for lowest rainfall average and returns its index
  public static int findLowestYearIndex(double[] average) {
    int i = 0;
    double lowest = average[i];
    int x = 0;
    for (i = 0; i < TOTAL; i++) {
      if (average[i] <= lowest) {
        lowest = average[i]; //updates everytime there is a new low average
        x = i; //new index of the lowest average if (double lowest) is updated
      }
    }
    return x; //index of the lowest average
  }

  //calculates the sum of all rainfall average and divides it by the given numbers of rainfall to find average
  public static double findAverage(double[] average) {
    int i = 0;
    double newavg = 0; //updates the sum of each rainfall average
    for (i = 0; i < TOTAL; i++) {
      newavg = average[i] + newavg; //updates a new sum as it keeps going down the array
    }
    return (newavg / TOTAL); //gives the sum of all the given rainfall average divided by the total numbers of rainfall
  }


}
