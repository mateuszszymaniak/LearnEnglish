package sqlRequest;

import java.sql.*;

public class ShowAll {

  static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
  }

  public static void showAll() {
    try (Connection conn = getConnection()) {

      PreparedStatement show_all = conn.prepareStatement(Constants.SHOW_ALL);
      ResultSet rs = show_all.executeQuery();

      while (rs.next()) {
        rs.getInt("id");
        rs.getString("polish_word");
        rs.getString("english_word");
        rs.getString("category");

        AllWords allWords =
            new AllWords(
                rs.getInt("id"),
                rs.getString("polish_word"),
                rs.getString("english_word"),
                rs.getString("category"));
        System.out.println(allWords);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
