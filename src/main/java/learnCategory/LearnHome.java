package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnHomeExecute;

import java.sql.SQLException;

public class LearnHome {
  private LearnHomeExecute lhoe = new LearnHomeExecute();
  private GameLogic gl = new GameLogic();

  public void studyHome() throws SQLException {
    lhoe.learnByCategory();
    gl.start();
  }
}
