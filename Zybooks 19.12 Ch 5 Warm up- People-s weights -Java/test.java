import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    final int TOTAL = 5;
    double[] userNum = new double[TOTAL];
    int i = 0;
    double initial = 0;
    double totalweight = 0;

    for (i = 0; i < TOTAL; i++) {
      System.out.println("Enter weight " + (i + 1) + ":");
      userNum[i] = scnr.nextDouble();
    }
    System.out.print("You entered: ");
    for (i = 0; i < TOTAL; i++) {
      System.out.print("" + userNum[i] + " ");
    }
    System.out.println();
    System.out.println();
    for (i = 0; i < TOTAL; i++) {
      initial = userNum[i] + totalweight;
      totalweight = initial;
    }
    System.out.println("Total weight: " + totalweight);
    System.out.println("Average weight: " + (totalweight / TOTAL));

    double max = 0.0;
    double finalmax = 0.0;
    for (i = 0; i < TOTAL; i++) {
      if (userNum[i] > max){
        max = userNum[i];
      }
      finalmax = max;
    }
    System.out.println("Max weight: " + finalmax);



  }
}
