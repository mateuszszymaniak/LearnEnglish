package sqlRequest;

public class Constants {

    public static final String URL =
            "jdbc:mysql://localhost:3306/words?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static final String SHOW_ALL = "SELECT * FROM word_table";
    public static final String RANDOM_TEN = "SELECT id, polish_word, english_word FROM word_table ORDER BY rand() LIMIT 10";
}
