import messages.Messages;
import tenWords.RandomTenWords;
import showBase.ShowAll;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class LearnEnglishApplication {

  public static void main(String[] args) throws SQLException, IOException {
    Messages.hello();

    Scanner scanner = new Scanner(System.in);
    int menuNumber = scanner.nextInt();

    switch (menuNumber) {
      case 0:
        Messages.goodbye();
      case 1:
        RandomTenWords.shuffle();
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
        // done
        ShowAll.showAll();
        break;
    }
  }
}