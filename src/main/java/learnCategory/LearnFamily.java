package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnFamilyExecute;

import java.sql.SQLException;

public class LearnFamily {
  LearnFamilyExecute lfae = new LearnFamilyExecute();
  GameLogic gl = new GameLogic();

  public void studyFamily() throws SQLException {
    lfae.learnByCategory();
    gl.start();
  }
}
