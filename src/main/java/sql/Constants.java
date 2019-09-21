package sql;

public class Constants {

  static final String URL =
      "jdbc:mysql://localhost:3306/words?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
  static final String USER = "root";
  static final String PASSWORD = "root";

  public static final String SHOW_ALL = "SELECT * FROM word_table";
  public static final String RANDOM_TEN =
      "SELECT id, polishWord, englishWord FROM word_table ORDER BY rand() LIMIT 10";
  public static final String LEARN_HUMAN =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'człowiek' ORDER BY rand() LIMIT 10";
  public static final String LEARN_ANIMALS =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'zwierzęta' ORDER BY rand() LIMIT 10";
  public static final String LEARN_FOOD =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'jedzenie' ORDER BY rand() LIMIT 10";
  public static final String LEARN_SPORT =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'sport' ORDER BY rand() LIMIT 10";
  public static final String LEARN_WEATHER =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'pogoda' ORDER BY rand() LIMIT 10";
  public static final String LEARN_FAMILY =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'rodzina' ORDER BY rand() LIMIT 10";
  public static final String LEARN_JOURNEY =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'podróże' ORDER BY rand() LIMIT 10";
  public static final String LEARN_HOME =
      "SELECT id, polishWord, englishWord FROM word_table WHERE category LIKE 'dom' ORDER BY rand() LIMIT 10";
}
