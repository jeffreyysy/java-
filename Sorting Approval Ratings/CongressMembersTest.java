import java.io.*;
import java.util.Scanner;

public class CongressMembersTest {
  public static void main(String[] args) {

    int lines = 0;

    //counts the lines of txt file to determine amount of congress members
    //got the concept from technicalkeeda.com/java-tutorials/count-total-number-of-lines-of-file-using-java
    try {
      File f = new File("approval.txt");
      LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(f));
      lineNumberReader.skip(Long.MAX_VALUE);
      lines = lineNumberReader.getLineNumber();
      lineNumberReader.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException Occurred" + e.getMessage());
    }
    catch (IOException e) {
      System.out.println("IOException Occurred" + e.getMessage());
    }

    final int TOTAL = lines + 1; //total integer of congress members
    CongressMembers[] member = new CongressMembers[TOTAL]; //object array containing first/last names and the five months
    String nameFirst;
    String nameLast;
    double oneMonth;
    double twoMonth;
    double threeMonth;
    double fourMonth;
    double fiveMonth;
    String space = " ";

    //initializes each object in the array with the data from each line of text from the data file
    try {
      File f = new File("approval.txt");
      Scanner scnr = new Scanner(f);
      for (int i = 0; i < TOTAL; i++) {
        member[i] = new CongressMembers();
        nameFirst = scnr.next();
        member[i].setFirstName(nameFirst); //passes first name string to member object array
        nameLast = scnr.next();
        member[i].setLastName(nameLast); //passes last name string to member obejct array
        oneMonth = scnr.nextDouble();
        member[i].setFirstMonth(oneMonth); //passes first month double to member object array
        twoMonth = scnr.nextDouble();
        member[i].setSecondMonth(twoMonth); //passes second month double to member object array
        threeMonth = scnr.nextDouble();
        member[i].setThirdMonth(threeMonth); //passes third month double to member object array
        fourMonth = scnr.nextDouble();
        member[i].setFourthMonth(fourMonth); //passes fourth month double to member object array
        fiveMonth = scnr.nextDouble();
        member[i].setFifthMonth(fiveMonth); //passes fifth month double to member object array
      }
    }
    catch(FileNotFoundException ex) {
      System.out.println("File not Found");
    }

    //outputs the "output.txt" file in alphabeticalized order or highest to lowest order in one single file
    FileWriter f;
    PrintWriter p;
    try {
      f = new FileWriter("output.txt");
      p = new PrintWriter(f);
      sortByFirstName(member, TOTAL); //method that sorts alphabetically with passed on object array and the total amount of congress members
      p.println("There are " + TOTAL + " congress members.");
      p.println();
      p.println("Alphabeticalized names of each congress member");
      p.println();
      for(int i = 0; i < TOTAL; i ++) {
        p.println(member[i].getFirstName() + space + member[i].getLastName() + space + member[i].getFirstMonth() + space + member[i].getSecondMonth() + space + member[i].getThirdMonth() + space + member[i].getFourthMonth() + space + member[i].getFifthMonth());
      }
      p.println();
      p.println();
      sortByApprovalRating(member, TOTAL); //method that sorts approval ratings from greatest to least with passed on object array and the total amount of congress members
      p.println("Sorted from greatest to least by average of approval ratings");
      p.println();
      for(int i = 0; i < TOTAL; i++) {
        p.println(member[i].getFirstName() + space + member[i].getLastName() + space + member[i].getFirstMonth() + space + member[i].getSecondMonth() + space + member[i].getThirdMonth() + space + member[i].getFourthMonth() + space + member[i].getFifthMonth());
      }
      p.close();
    }
    catch(IOException ex) {
      System.out.println(ex.toString() + " file error.");
    }


  }


  //method with bubblesort that sorts alphabetically by first name which accepts and returns the array of CongressMembers
  public static CongressMembers[] sortByFirstName(CongressMembers[] member, int TOTAL) {
    int i;
    int j;
    for(i = 0; i < TOTAL; i++) {
      for(j = 1; j < TOTAL; j++) {
        if(member[j - 1].getFirstName().compareTo(member[j].getFirstName()) > 0) {
          CongressMembers temp = member[j - 1];
          member[j - 1] = member[j];
          member[j] = temp;
        }
      }
    }
    return member;
  }

  //method with bubblesort that sorts approval ratings from greatest to least which accepts and returns the array of CongressMembers
  public static CongressMembers[] sortByApprovalRating(CongressMembers[] member, int TOTAL) {
    int i;
    int j;
      for(i = 0; i < TOTAL; i++) {
      for(j = 1; j < TOTAL; j++) {
        if(member[j - 1].average() < member[j].average()) {
          CongressMembers temp = member[j - 1];
          member[j - 1] = member[j];
          member[j] = temp;
        }
      }
    }
    return member;
  }

}
