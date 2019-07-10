package sqlRequest;

import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
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
        Integer id = rs.getInt("id");
        String polishWord = rs.getString("polish_word");
        String englishWord = rs.getString("english_word");
        tw = new TenWords(id, polishWord, englishWord);

        unlearnedWords.put(id, tw);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    // splited words by id
    //        System.out.println(unlearnedWords.get(i).toStringPolishWord() + " -> "
    // +unlearnedWords.get(i).toStringEnglishWord());

      for (Integer i : unlearnedWords.keySet()) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Proszę wpisać tłumaczenie");
      System.out.println(unlearnedWords.get(i).toStringPolishWord());
      String reply = scanner.nextLine();

      // TODO if we make mistake programs end -> need to put unlearned word into map and continue loop
      if (reply.contains(unlearnedWords.get(i).getEnglish_word())) {
          System.out.println("Dobra robota :)");
      } else {
          System.out.println(unlearnedWords.get(i).getEnglish_word());
          System.out.println("Za chwilę wrócimy do tego słowa");
          return unlearnedWords.get(i).toStringPolishWord();
      }
    }
      return null;
  }
}
