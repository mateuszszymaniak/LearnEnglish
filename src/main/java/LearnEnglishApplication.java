import menu.MenuContext;
import messages.Messages;

import java.sql.SQLException;

public class LearnEnglishApplication {

  public static void main(String[] args) throws SQLException {
    Messages msg = new Messages();
    msg.welcome();
    msg.menu();
    MenuContext menuc = new MenuContext();
    menuc.menu();
  }
}
