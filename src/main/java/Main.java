import logic.StudyTenWords;
import sqlRequest.Random_PL_EN_Words;
import sqlRequest.ShowAll;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws SQLException {
    Messages.hello();

    Scanner scanner = new Scanner(System.in);
    int menuNumber = scanner.nextInt();

    switch (menuNumber) {
      case 0:
        // done
        Messages.goodbye();
      case 1:
        StudyTenWords.shuffle();
        break;
      case 2:
        // zrobione
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
        // zrobione
        ShowAll.showAll();
        break;
    }
  }
}
