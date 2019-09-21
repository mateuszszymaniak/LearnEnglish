package tenWords;

import logic.LearnLogic;
import menu.MenuContext;
import messages.Messages;
import sql.Constants;
import sql.DownloadFromBase;
import sql.SqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class RandomTenWords implements SqlConnection {

  public String shuffle() throws SQLException {
    Messages msg = new Messages();
    MenuContext menuc = new MenuContext();
    HashMap<Integer, TenWords> unlearnedWords = new HashMap<>();
    Connection con = SqlConnection.getConnection();
    PreparedStatement st = con.prepareStatement(Constants.RANDOM_TEN);
    ResultSet rs = st.executeQuery();

    try {
      DownloadFromBase.downloadFromBase(unlearnedWords, rs);
    } catch (Exception ex) {
      System.out.println("Coś się zepsuło :o");
      ex.printStackTrace();
    }

    LearnLogic.learnLogic(unlearnedWords, msg, menuc);
    System.out.println("Wszystkie słowa zostały nauczone :)");
    return null;
  }
}
