//BoardMember.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 5: Payroll for Startup Comany
//preforms calculations from the provided integers and doubles

import java.lang.Math;

public class BoardMember extends Employee {
  //constructor since yearsWorked is private in superclass
  public BoardMember(int yearsWorked) {
    super(yearsWorked);
  }

  //integers and doubles
  final double YEARLY_BONUS = 20000;
  final int PAID_VACATION = 20;
  final int UNPAID_VACATION = 10;
  final int SICK_LEAVE = 10;
  final double HEALTH_INSURANCE = 20000;
  final double INCOME = 200000;

  //private instance variables
  private int usedUnpaidVacation;
  private int usedVacation;
  private int usedSickDays;

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
  public void setusedSickDays(int sick) {
    usedSickDays = sick;
  }

  //getter methods for the private instance variables
  public int getusedUnpaidVacation() {
    return usedUnpaidVacation;
  }
  public int getusedVacation() {
    return usedVacation;
  }
  public int getsickDays() {
    return usedSickDays;
  }

  //method that adds one to usedVacation instance variable
  public void usePaidVacation() {
    usedVacation++;
  }
  //method that adds one to usedUnpaidVacation instance variable
  public void useUnpaidVacation() {
    usedUnpaidVacation++;
  }
  //method that adds one to usedSickDays
  public void useSickDay() {
    usedSickDays++;
  }
  //method that adds one to yearsWorked
  public void workYear() {
    setYears(getYears()+1);
  }

  //overrides the superclass YTDValue method to preform the calculation in the return statement
  public double YTDValue() {
    return (YEARLY_BONUS + HEALTH_INSURANCE + INCOME + (PAID_VACATION * (INCOME / 260)) + (SICK_LEAVE - usedSickDays) *  ((INCOME / 260) / 2));
  }
  //overrides the superclass yearsTillRetirement method to preform the calculation in the return statement and rounds up to the nearest integer.
  public int yearsTillRetirement() {
    return (int)Math.round((35 - ((double)getYears() + ((double)usedUnpaidVacation / 260) + (((double)usedVacation / 260) * 2) + ((double)usedSickDays / 260))));
  }
}
