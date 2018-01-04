import java.util.Scanner;

public class test {

  public static void main(String[] args) {
    /* Type your code here. */
    String usertext;
    char userchoice;
    char quotes = '"';

    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a sample text:");
    usertext = scnr.nextLine();
    System.out.println();
    System.out.println("You entered: " + usertext);
    System.out.println();

    printMenu();
    System.out.println("Choose an option:");
    userchoice = scnr.next().charAt(0);

    while (userchoice != 'q'){
      switch (userchoice) {

        case 'c':
        System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(usertext));
        System.out.println();
        printMenu();
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

        case 'w':
        System.out.println("Number of words: " + getNumOfWords(usertext));
        System.out.println();
        printMenu();
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

        case 'f':
        System.out.println("Enter a word or phrase to be found:");
        scnr.nextLine();
        String wordToFind = scnr.nextLine();
        System.out.println("" + quotes + wordToFind + quotes + " instances: " + findText(wordToFind, usertext));
        System.out.println();
        printMenu();
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

        case 'r':
        System.out.println("Edited text: " + replaceExclamation(usertext));
        System.out.println();
        printMenu();
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

        case 's':
        System.out.println("Edited text:  " + shortenSpace(usertext) + " ");
        System.out.println();
        printMenu();
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

        default:
        System.out.println("Choose an option:");
        userchoice = scnr.next().charAt(0);
        break;

      }

    }


    return;
  }



  public static void printMenu() {
    System.out.println("MENU");
    System.out.println("c - Number of non-whitespace characters");
    System.out.println("w - Number of words");
    System.out.println("f - Find text");
    System.out.println("r - Replace all !'s");
    System.out.println("s - Shorten spaces");
    System.out.println("q - Quit");
    System.out.println();

  }

  public static int getNumOfNonWSCharacters(String usertext) {
    int i = 0;
    int t = usertext.length();
    for (int j = 0; j < usertext.length(); j++) {
      if(Character.isWhitespace(usertext.charAt(j))){
        i++;
      }
    }
    return t - i;
  }



  public static int getNumOfWords(String usertext) {
    int j = 1;
    for (int i = 0; i < usertext.length(); i++) {
      if ((usertext.charAt(i) == ' ') && (usertext.charAt(i + 1) != ' ')) {
        j++;
      }
    }
    return j;
  }



  public static int findText(String word, String usertext) {
    int i = 0;
    int result = usertext.indexOf(word);

    while (result != -1) {
      result = usertext.indexOf(word, result + 1);
      i++;
    }
    return i;
  }


  public static String replaceExclamation(String usertext) {
    usertext = usertext.replace('!', '.');
    return usertext;
  }



  public static String shortenSpace(String usertext) {
    usertext = usertext.trim().replaceAll(" +", " ");
    return usertext;
  }



}
