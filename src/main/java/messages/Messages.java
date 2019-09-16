package messages;

public class Messages {

  public static void hello() {
    System.out.println(
        "Witam w programie do nauki angielskiego \n"
            + "Wybierz numer z menu \n"
            + "0 - wyjście z programu \n"
            + "1 - nauka losowych 10 słów \n"
            + "2 - nauka wybranej kategorii \n"
            + "3 - wyświetl bazę słów do nauki \n"
            + "Aby wyjść z programu podczas nauki wpisz -> stop");
  }

  public static void goodbye() {
    System.out.println("Dziękuję za współną naukę :)");
    System.exit(0);
  }

  public static void chooseCategory() {
    System.out.println(
        "Wybierz kategorię: \n"
            + "1 - człowiek \n"
            + "2 - zwierzęta \n"
            + "3 - jedzenie \n"
            + "4 - sport \n"
            + "5 - pogoda \n"
            + "6 - rodzina \n"
            + "7 - podróże \n"
            + "8 - dom");
  }

  public static void translateMsg(){
    String msg = "Proszę wpisać tłumaczenie";
    String please = String.format("%s", msg);
    System.out.println(please);
  }
}
