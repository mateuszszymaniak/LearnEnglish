package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnFoodExecute;

import java.sql.SQLException;

public class LearnFood {
  private LearnFoodExecute lfoe = new LearnFoodExecute();
  private GameLogic gl = new GameLogic();

  public void studyFood() throws SQLException {
    lfoe.learnByCategory();
    gl.start();
  }
}
