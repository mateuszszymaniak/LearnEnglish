package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnAnimalsExecute;

import java.sql.SQLException;

public class LearnAnimals {
  private LearnAnimalsExecute lae = new LearnAnimalsExecute();
  private GameLogic gl = new GameLogic();

  public void studyAnimals() throws SQLException {
    lae.learnByCategory();
    gl.start();
  }
}
