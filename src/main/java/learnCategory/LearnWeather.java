package learnCategory;

import logic.GameLogic;
import sql.executeRequest.LearnWeatherExecute;

import java.sql.SQLException;

public class LearnWeather {
  private LearnWeatherExecute lwe = new LearnWeatherExecute();
  private GameLogic gl = new GameLogic();

  public void studyWeather() throws SQLException {
    lwe.learnByCategory();
    gl.start();
  }
}
