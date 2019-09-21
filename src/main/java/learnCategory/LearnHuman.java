package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnHumanExecute;

import java.sql.SQLException;

public class LearnHuman {
  private LearnHumanExecute lhue = new LearnHumanExecute();
  private GameLogic gl = new GameLogic();

  public void studyHuman() throws SQLException {
    lhue.learnByCategory();
    gl.start();
  }
}
