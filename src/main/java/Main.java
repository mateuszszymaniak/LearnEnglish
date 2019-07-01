import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Witam w programie do nauki angielskiego v0.1");
    System.out.println("Wybierz numer z menu");
    System.out.println("0 - wyjście z programu");
    System.out.println("1 - nauka losowych 10 słów");
    System.out.println("2 - sprawdzian");
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
          return;
        default:
      }
    } while (menuNumber == 0);
  }
}
