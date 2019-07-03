import logic.StudyTenWords;
import sqlRequest.ShowAll;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Messages.hello();

    Scanner scanner = new Scanner(System.in);
    int menuNumber = scanner.nextInt();

    switch (menuNumber) {
      case 0:
        Messages.goodbye();
      case 1:
        StudyTenWords.letsStudy();
        break;
      case 2:
        Messages.chooseCategory();
        int categoryNumber = scanner.nextInt();

        switch (categoryNumber) {
          case 1:
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            break;
          case 8:
            break;
        }
        break;
      case 3:
        ShowAll.show_all();
        break;
    }
  }
}
