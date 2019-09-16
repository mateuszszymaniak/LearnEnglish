package showBase;

import sql.Constants;
import sql.SqlConnection;

import java.sql.*;

public class ShowAll implements SqlConnection {

  public static void showAll() {
    try (Connection conn = SqlConnection.getConnection()) {

      PreparedStatement showAll = conn.prepareStatement(Constants.SHOW_ALL);
      ResultSet rs = showAll.executeQuery();

      while (rs.next()) {
        System.out.println(new AllWords(
                rs.getInt("id"),
                rs.getString("polishWord"),
                rs.getString("englishWord"),
                rs.getString("category")));
      }
    } catch (SQLException e) {
      System.out.println("Coś się zepsuło :o");
    }
  }
}
