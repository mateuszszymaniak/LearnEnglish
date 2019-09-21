package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnJourneyExecute;

import java.sql.SQLException;

public class LearnJourney {
  private LearnJourneyExecute lfe = new LearnJourneyExecute();
  private GameLogic gl = new GameLogic();

  public void studyJourney() throws SQLException {
    lfe.learnByCategory();
    gl.start();
  }
}
