//Intern.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 5: Payroll for Startup Comany
//preforms calculations from the provided integers and doubles

import java.lang.Math;

public class Intern extends Employee {
  //constructor since yearsWorked is private in superclass
  public Intern(int yearsWorked) {
    super(yearsWorked);
  }

  //integers and doubles
  final int UNPAID_VACATION = 10;
  final double HEALTH_INSURANCE = 5000;
  final double INCOME = 40000;

  //private instance variables
  private int usedUnpaidVacation;

  //getter method since yearsWorked is private in superclass
  public int getyearsWorked() {
    return getYears();
  }

  //setter methods for the private instance variable
  public void setusedUnpaidVacation(int unpaid) {
    usedUnpaidVacation = unpaid;
  }

  //getter methods for the private instance variable
  public int getusedUnpaidVacation() {
    return usedUnpaidVacation;
  }

  //method that adds one to usedUnpaidVacation instance variable
  public void useUnpaidVacation() {
    usedUnpaidVacation++;
  }
  //method that adds one to yearsWorked
  public void workYear() {
    setYears(getYears()+1);
  }

  //overrides the superclass YTDValue method to preform the calculation in the return statement
  public double YTDValue() {
    return (HEALTH_INSURANCE + INCOME);
  }
  //overrides the superclass yearsTillRetirement method to preform the calculation in the return statement and rounds up to the nearest integer
  public int yearsTillRetirement() {
    return (int)Math.round((35 - ((double)getYears() + ((double)usedUnpaidVacation / 260))));
  }
}
