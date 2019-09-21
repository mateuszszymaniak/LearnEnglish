package sql;

import tenWords.TenWords;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DownloadFromBase {
  public static void downloadFromBase(HashMap<Integer, TenWords> unlearnedWords, ResultSet rs)
      throws SQLException {
    TenWords tw;
    while (rs.next()) {
      int id = rs.getInt("id");
      String polishWord = rs.getString("polishWord");
      String englishWord = rs.getString("englishWord");
      tw = new TenWords(polishWord, englishWord);
      unlearnedWords.put(id, tw);
    }
  }
}
