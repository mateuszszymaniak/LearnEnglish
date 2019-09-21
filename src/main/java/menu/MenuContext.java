package menu;

import learnCategory.*;
import messages.Messages;
import showBase.ShowAll;
import tenWords.RandomTenWords;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuContext {

  public void menu() throws SQLException {
    Messages msg = new Messages();
    Scanner scanner = new Scanner(System.in);
    int menuNumber = scanner.nextInt();

    switch (menuNumber) {
      case 0:
        msg.goodbye();
      case 1:
        RandomTenWords rtw = new RandomTenWords();
        rtw.shuffle();
        msg.repeatMenuMessage();
        break;
      case 2:
        msg.chooseCategory();
        int categoryNumber = scanner.nextInt();

        switch (categoryNumber) {
          case 1:
            LearnHuman lhu = new LearnHuman();
            lhu.studyHuman();
            msg.repeatMenuMessage();
            break;
          case 2:
            LearnAnimals la = new LearnAnimals();
            la.studyAnimals();
            msg.repeatMenuMessage();
            break;
          case 3:
            LearnFood lfo = new LearnFood();
            lfo.studyFood();
            msg.repeatMenuMessage();
            break;
          case 4:
            LearnSport ls = new LearnSport();
            ls.studySport();
            msg.repeatMenuMessage();
            break;
          case 5:
            LearnWeather lw = new LearnWeather();
            lw.studyWeather();
            msg.repeatMenuMessage();
            break;
          case 6:
            LearnFamily lfa = new LearnFamily();
            lfa.studyFamily();
            msg.repeatMenuMessage();
            break;
          case 7:
            LearnJourney lj = new LearnJourney();
            lj.studyJourney();
            msg.repeatMenuMessage();
            break;
          case 8:
            LearnHome lho = new LearnHome();
            lho.studyHome();
            msg.repeatMenuMessage();
            break;
          case 9:
            msg.repeatMenuMessage();
        }
        menu();
        break;
      case 3:
        ShowAll sa = new ShowAll();
        sa.showAll();
        msg.repeatMenuMessage();
        break;
    }
  }
}
