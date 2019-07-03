public class Messages {

  static void hello() {
    System.out.println(
        "Witam w programie do nauki angielskiego \n"
            + "Wybierz numer z menu \n"
            + "0 - wyjście z programu \n"
            + "1 - nauka losowych 10 słów \n"
            + "2 - nauka wybranej kategorii \n"
            + "3 - wyświetl bazę słów do nauki");
  }

  static void goodbye(){
    System.out.println("Dziękuję za współną naukę :)");
    System.exit(1);
  }

  static void chooseCategory() {
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
}
