public class Employee {
  private int yearsWorked;
  Employee(int yearsWorked) {
    this.yearsWorked = yearsWorked;
  }
  public double YTDValue() {
    return 0;
  }
  public int yearsTillRetirement() {
    return 35 - yearsWorked;
  }
  public void setYears(int x) {
    yearsWorked = x;
  }
  public int getYears() {
    return yearsWorked;
  }
}
