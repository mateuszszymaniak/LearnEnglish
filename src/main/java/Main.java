import java.sql.*;
import java.util.Scanner;

public class Main {

  private static final String URL =
          "jdbc:mysql://127.0.0.1:3306/words?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
  private static final String USER = "root";
  private static final String PASSWORD = "root";

  private static final String SHOW_ALL = "SELECT * FROM word_table";

  public static void main(String[] args) {
//    Connection conn = null;
//    try {
//      conn = DriverManager.getConnection(URL, USER, PASSWORD);
//      conn.setAutoCommit(false);
//
//      PreparedStatement show_all = conn.prepareStatement(SHOW_ALL);
//      ResultSet rs = show_all.executeQuery();
//
//      while (rs.next()){
//        rs.getInt("id");
//        rs.getString("polish_word");
//        rs.getString("english_word");
//        rs.getString("category");
//
//        AllWords allWords = new AllWords(rs.getInt("id"), rs.getString("polish_word"), rs.getString("english_word"), rs.getString("category"));
//                System.out.println(allWords);
//      }
//
//    } catch (SQLException e){
//      e.printStackTrace();
//      try{
//        conn.rollback();
//      } catch (SQLException ex) {
//        ex.printStackTrace();
//      }
//    } finally{
//      try{
//        conn.close();
//      } catch (SQLException e) {
//        e.printStackTrace();
//      }
//    }

    System.out.println("Witam w programie do nauki angielskiego v0.1");
    System.out.println("Wybierz numer z menu");
    System.out.println("0 - wyjście z programu");
    System.out.println("1 - nauka losowych 10 słów");
    System.out.println("2 - nauka wybranej kategorii");
    System.out.println("3 - wyświetl bazę słów do nauki");
    Scanner scanner = new Scanner(System.in);
    int menuNumber = scanner.nextInt();

    do {
      switch (menuNumber) {
        case 0:
          System.out.println("Dziękuję za wspólną naukę");
          System.exit(1);
        case 1:
          return;
        case 2:
          System.out.println("Wybierz kategorię:");
          System.out.println("1 - człowiek");
          System.out.println("2 - zwierzęta");
          System.out.println("3 - jedzenie");
          System.out.println("4 - sport");
          System.out.println("5 - pogoda");
          System.out.println("6 - rodzina");
          System.out.println("7 - podróże");
          System.out.println("8 - dom");
          int categoryNumber = scanner.nextInt();

          switch (categoryNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
          }
        case 3:
          Connection conn = null;
          try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false);

            PreparedStatement show_all = conn.prepareStatement(SHOW_ALL);
            ResultSet rs = show_all.executeQuery();

            while (rs.next()){
              rs.getInt("id");
              rs.getString("polish_word");
              rs.getString("english_word");
              rs.getString("category");

              AllWords allWords = new AllWords(rs.getInt("id"), rs.getString("polish_word"), rs.getString("english_word"), rs.getString("category"));
              System.out.println(allWords);
            }

          } catch (SQLException e){
            e.printStackTrace();
            try{
              conn.rollback();
            } catch (SQLException ex) {
              ex.printStackTrace();
            }
          } finally{
            try{
              conn.close();
            } catch (SQLException e) {
              e.printStackTrace();
            }
          }
          default:
      }
    } while (menuNumber == 0);
  }
}
