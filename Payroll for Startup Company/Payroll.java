//Payroll.java
//Jeffrey Yeung
//jeyyeung
//Programming Assignment 5: Payroll for Startup Comany
//sorts the output of the array using bubble sort

public class Payroll {
  //constructor
  public Payroll(int x) {
    //initialize the size of employees
    employees = new Employee[x];
  }

  //object array
  Employee[] employees;

  //pass the data from the main class
  public Employee[] getEmployees(){
    return employees;
  }

  //sorts the employees by retirement from least to greatest using bubblesort
  public void sortEmployeesByRetirement() {
    for(int i = 0; i < employees.length; i++) {
      for(int j = 1; j < employees.length - i; j++) {
        if (employees[j-1].yearsTillRetirement() > employees[j].yearsTillRetirement()) {
          Employee temp = employees[j-1];
          employees[j-1] = employees[j];
          employees[j] = temp;
        }
      }
    }
  }

  //sorts the employees years until retirement from greatest to least using bubblesort
  public void sortEmployeesByCost() {
    for(int i = 0; i < employees.length; i++) {
      for(int j = 1; j < employees.length; j++) {
        if (employees[j-1].YTDValue() < employees[j].YTDValue()) {
          Employee temp = employees[j-1];
          employees[j-1] = employees[j];
          employees[j] = temp;
        }
      }
    }
  }

}
