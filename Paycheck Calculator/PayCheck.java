// Paycheck.java
// Jeffrey Yeung
// jeyyeung
// Programming Assignment 1
// gives users paycheck value in account for overtime

import java.util.Scanner;

public class PayCheck {
  public static void main(String[] args){
    double userTime;
    double userHours;
    double userOvertime;
    double userRate;

    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter the total hours worked Monday through Sunday."); //takes user imput for total hours worked
    userTime = scnr.nextInt();
    System.out.println("Please enter your pay rate (in terms of dollars per hour)."); //takes user imput for hourly payscale
    userRate = scnr.nextInt();

    //got the if statement idea from Overtime.java
    //if work hours exceed 40, then overtime will be accounted for and payscale will be x1.5
    if (userTime > 40){
      userOvertime = userTime - 40;
      userHours = userTime - userOvertime;
      System.out.println("Your paycheck for this week is: " + ((userHours * userRate) + (userOvertime * (userRate * 1.5))));
    }

    //if work hours do not exceed 40, the payscale stays the same
    else {
      userOvertime = 0;
      System.out.println("Your paycheck for this week is: " + (userTime * userRate));
    }


  }
}
