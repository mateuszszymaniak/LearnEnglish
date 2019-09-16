package tenWords;

import messages.Messages;
import sql.Constants;
import sql.SqlConnection;

import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RandomTenWords implements SqlConnection {

  public  String shuffle() throws SQLException{
    HashMap<Integer, TenWords> unlearnedWords = new HashMap<>();
    Connection con = SqlConnection.getConnection();
    PreparedStatement st = con.prepareStatement(Constants.RANDOM_TEN);
    ResultSet rs = st.executeQuery();
    TenWords tw;

    try {
      while (rs.next()) {
        int id = rs.getInt("id");
        String polishWord = rs.getString("polishWord");
        String englishWord = rs.getString("englishWord");
        tw = new TenWords(polishWord, englishWord);
        unlearnedWords.put(id, tw);
      }
    } catch (Exception ex) {
      System.out.println("Coś się zepsuło :o");
    }

    while (unlearnedWords.size() != 0) {

      Iterator<Map.Entry<Integer, TenWords>> iterator = unlearnedWords.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<Integer, TenWords> entry = iterator.next();

        String txtPolish = entry.getValue().toStringPolishWord();
        String answerPolish = String.format("%s", txtPolish);

        String txtEnglishWord = entry.getValue().getEnglishWord();
        String answerEnglish = String.format("%s",txtEnglishWord);

        Scanner scanner = new Scanner(System.in);
        Messages.translateMsg();
        System.out.println(answerPolish);
        String reply = scanner.nextLine().toLowerCase().trim();

        if(reply.equals("stop")){
          System.out.println("Nauka zatrzymana, szkoda :/");
          System.exit(0);
        } else if (reply.equals(answerEnglish)) {
          System.out.println("Dobra robota :) \n");
          iterator.remove();
        } else {
          System.out.println(answerEnglish);
          System.out.println("Za chwilę wrócimy do tego słowa \n");
        }
      }
      System.out.println("Liczba słów do powtórzenia: " + unlearnedWords.size() + "\n");
    }
    System.out.println("Dziękuję za naukę");
    return null;
  }
}
