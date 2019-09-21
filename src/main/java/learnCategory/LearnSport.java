package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnSportExecute;

import java.sql.SQLException;

public class LearnSport {
  private LearnSportExecute lse = new LearnSportExecute();
  private GameLogic gl = new GameLogic();

  public void studySport() throws SQLException {
    lse.learnByCategory();
    gl.start();
  }
}
