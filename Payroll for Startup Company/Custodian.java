//Custodian.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 5: Payroll for Startup Comany
//preforms calculations from the provided integers and doubles

import java.lang.Math;

public class Custodian extends Employee {
  //constructor since yearsWorked is private in superclass
  public Custodian(int yearsWorked) {
    super(yearsWorked);
  }

  //integers and doubles
  final int PAID_VACATION = 10;
  final int UNPAID_VACATION = 10;
  final double HEALTH_INSURANCE = 10000;
  final double INCOME = 50000;

  //private instance variables
  private int usedUnpaidVacation;
  private int usedVacation;

  //getter method since yearsWorked is private in superclass
  public int getyearsWorked() {
    return getYears();
  }

  //setter methods for the private instance variables
  public void setusedUnpaidVacation(int unpaid) {
    usedUnpaidVacation = unpaid;
  }
  public void setusedVacation(int vacay) {
    usedVacation = vacay;
  }

  //getter methods for the private instance variables
  public int getusedUnpaidVacation() {
    return usedUnpaidVacation;
  }
  public int getusedVacation() {
    return usedVacation;
  }

  //method that adds one to usedVacation instance variable
  public void usePaidVacation() {
    usedVacation++;
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
    return (HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260));
  }
  //overrides the superclass yearsTillRetirement method to preform the calculation in the return statement and rounds up to the nearest integer
  public int yearsTillRetirement() {
    return (int)Math.round((35 - (double)(getYears() + ((double)usedUnpaidVacation / 260) + (((double)usedVacation / 260) * 2))));
  }
}
