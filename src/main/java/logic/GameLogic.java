package logic;

import menu.MenuContext;
import messages.Messages;
import tenWords.TenWords;

import java.sql.SQLException;
import java.util.HashMap;

public class GameLogic {
  private Messages msg = new Messages();
  private MenuContext menuc = new MenuContext();

  public void start() throws SQLException {
    HashMap<Integer, TenWords> savedHM = DataStorage.getUnlearnedWords();
    LearnLogic.learnLogic(savedHM, msg, menuc);
    System.out.println("Gratulacje! Wszystkie słowa zostały nauczone :)");
  }
}
