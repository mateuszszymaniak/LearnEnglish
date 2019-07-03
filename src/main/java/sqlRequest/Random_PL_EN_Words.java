package sqlRequest;

import java.sql.*;

public class Random_PL_EN_Words {

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
    }

    public static void random_ten() {
        try (Connection conn = getConnection()) {

            PreparedStatement random_ten = conn.prepareStatement(Constants.RANDOM_TEN);
            ResultSet rs = random_ten.executeQuery();

            while (rs.next()) {
                rs.getString("polish_word");
                rs.getString("english_word");

                TenWords randomTen =
                        new TenWords(
                                rs.getString("polish_word"),
                                rs.getString("english_word"));
                System.out.println(randomTen);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
