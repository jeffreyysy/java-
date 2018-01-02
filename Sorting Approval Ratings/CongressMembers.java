//CongressMembers.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 4: Sorting Approval Ratings
//reads in data from a txt and sorts it alphabetically or by averages

public class CongressMembers {
  //instance variables
  private String firstName;
  private String lastName;
  private double monthOne;
  private double monthTwo;
  private double monthThree;
  private double monthFour;
  private double monthFive;

  //gets first name String from CongressMembersTest object array
  public void setFirstName(String x) {
    firstName = x;
  }
  //returns first name
  public String getFirstName() {
    return firstName;
  }
  //gets last name String from CongressMembersTest object array
  public void setLastName(String x) {
    lastName = x;
  }
  //returns last name
  public String getLastName() {
    return lastName;
  }
  //gets first month double from CongressMembersTest object array
  public void setFirstMonth(double x) {
    monthOne = x;
  }
  //return first month double
  public double getFirstMonth() {
    return monthOne;
  }
  //gets second month double from CongressMembersTest object array
  public void setSecondMonth(double x) {
    monthTwo = x;
  }
  //return second month double
  public double getSecondMonth() {
    return monthTwo;
  }
  //gets third month double from CongressMembersTest object array
  public void setThirdMonth(double x) {
    monthThree = x;
  }
  //return third month double
  public double getThirdMonth() {
    return monthThree;
  }
  //gets fourth month double from CongressMembersTest object array
  public void setFourthMonth(double x) {
    monthFour = x;
  }
  //return fourth month double
  public double getFourthMonth() {
    return monthFour;
  }
  //gets fifth month double from CongressMembersTest object array
  public void setFifthMonth(double x) {
    monthFive = x;
  }
  //return fifth month double
  public double getFifthMonth() {
    return monthFive;
  }

  //average of the total 5 months approval rating of each congress member
  public double average() {
    double average = (monthOne + monthTwo + monthThree + monthFour + monthFive) / 5;
    return average;
  }

}
