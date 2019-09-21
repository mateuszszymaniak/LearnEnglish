package sql.executeRequest;

import logic.DataStorage;
import sql.Constants;
import sql.DownloadFromBase;
import sql.SqlConnection;
import tenWords.TenWords;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class LearnFamilyExecute {
  public HashMap<Integer, TenWords> learnByCategory() {
    HashMap<Integer, TenWords> unlearnedWords = new HashMap<>();
    DataStorage ds = new DataStorage();
    try (Connection conn = SqlConnection.getConnection()) {

      PreparedStatement lbn = conn.prepareStatement(Constants.LEARN_FAMILY);
      ResultSet rs = lbn.executeQuery();

      DownloadFromBase.downloadFromBase(unlearnedWords, rs);
    } catch (SQLException e) {
      System.out.println("Coś się zepsuło :o");
      e.printStackTrace();
    }
    return ds.setUnlearnedWords(unlearnedWords);
  }
}
