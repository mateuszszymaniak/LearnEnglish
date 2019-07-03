package logic;

import sqlRequest.Random_PL_EN_Words;
import java.util.Random;

//TODO repair shuffling 10 words from sql
public class StudyTenWords {
  private int learnedWords = 0;
  private boolean correct = false;

  static Random random = new Random();
  static int[] words = new int [10];

  public static void letsStudy(){

    for (int i=0; i<words.length; i++){
      words[i]=i;
    }

    for (int i = 0; i<words.length; i++){
      Random_PL_EN_Words.random_ten();
      int randomPosition = random.nextInt(words.length);
      int temp = words[i];
      words[i] = words[randomPosition];
      words[randomPosition] = temp;
    }
  }
}
