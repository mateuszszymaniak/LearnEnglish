package sqlRequest;

import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RandomTenWords {

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
  }

  public static String shuffle() throws SQLException, IOException {
    HashMap<Integer, TenWords> unlearnedWords = new HashMap<>();
    PreparedStatement st = null;
    ResultSet rs = null;
    Connection con = getConnection();
    TenWords tw;

    try {
      st = con.prepareStatement(Constants.RANDOM_TEN);
      rs = st.executeQuery();
      while (rs.next()) {
        int id = rs.getInt("id");
        String polishWord = rs.getString("polish_word");
        String englishWord = rs.getString("english_word");
        tw = new TenWords(polishWord, englishWord);
        unlearnedWords.put(id, tw);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    while (unlearnedWords.size() != 0) {
      Iterator<Map.Entry<Integer, TenWords>> iterator = unlearnedWords.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<Integer, TenWords> entry = iterator.next();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wpisać tłumaczenie");
        System.out.println(entry.getValue().toStringPolishWord());
        String reply = scanner.nextLine().toLowerCase();

        if (reply.contains(entry.getValue().getEnglish_word())) {
          System.out.println("Dobra robota :) \n");
          iterator.remove();
          unlearnedWords.size();
        } else {
          System.out.println(entry.getValue().getEnglish_word());
          System.out.println("Za chwilę wrócimy do tego słowa \n");
          unlearnedWords.size();
        }
      }
      System.out.println("Liczba słów do powtórzenia: " + unlearnedWords.size() + "\n");
    }
    System.out.println("Dziękuję za naukę");
    return null;
  }
}
