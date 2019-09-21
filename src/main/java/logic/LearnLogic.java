package logic;

import menu.MenuContext;
import messages.Messages;
import tenWords.TenWords;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LearnLogic {
  public static void learnLogic(HashMap<Integer, TenWords> savedHM, Messages msg, MenuContext menuc)
      throws SQLException {
    while (savedHM.size() != 0) {

      Iterator<Map.Entry<Integer, TenWords>> iterator = savedHM.entrySet().iterator();
      while (iterator.hasNext()) {
        Map.Entry<Integer, TenWords> entry = iterator.next();

        String txtPolish = entry.getValue().toStringPolishWord();
        String answerPolish = String.format("%s", txtPolish);

        String txtEnglishWord = entry.getValue().getEnglishWord();
        String answerEnglish = String.format("%s", txtEnglishWord);

        Scanner scanner = new Scanner(System.in);
        msg.translateMsg();
        System.out.println(answerPolish);
        String reply = scanner.nextLine().toLowerCase().trim();

        if (reply.equals("stop")) {
          System.out.println("Nauka zatrzymana, szkoda :/");
          msg.menu();
          menuc.menu();
        } else if (reply.equals(answerEnglish)) {
          System.out.println("Dobra robota :) \n");
          iterator.remove();
        } else {
          System.out.println(answerEnglish);
          System.out.println("Za chwilę wrócimy do tego słowa \n");
        }
      }
      System.out.println("Liczba słów do powtórzenia: " + savedHM.size() + "\n");
    }
  }
}
