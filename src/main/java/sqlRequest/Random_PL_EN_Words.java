package sqlRequest;

import java.sql.*;

public class Random_PL_EN_Words {

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
    }

    public static String randomTen() {
        try (Connection conn = getConnection()) {

            PreparedStatement randomTen = conn.prepareStatement(Constants.RANDOM_TEN);
            ResultSet rs =randomTen.executeQuery();

            while (rs.next()) {
                rs.getString("polish_word");
                rs.getString("english_word");


                TenWords tenWords =
                        new TenWords(
                                rs.getString("polish_word"),
                                rs.getString("english_word"));
                System.out.println(tenWords);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
