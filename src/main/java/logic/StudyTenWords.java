package logic;

import sqlRequest.Random_PL_EN_Words;

//TODO repair NullPointerException :(
public class StudyTenWords {

  private int learnedWords = 0;
  private int unLearnedWords = 0;

  public static void shuffle(){
      String[] string = Random_PL_EN_Words.randomTen().split(" -> ");
      String part1 = string[0];
      String part2 = string[1];
      String part3 = string[2];
      String part4 = string[3];
      String part5 = string[4];
      String part6 = string[5];
      String part7 = string[6];
      String part8 = string[7];
      String part9 = string[8];
      String part10 = string[9];
      String part11 = string[10];
      String part12 = string[11];
      String part13 = string[12];
      String part14 = string[13];
      String part15 = string[14];
      String part16 = string[15];
      String part17 = string[16];
      String part18 = string[17];
      String part19 = string[18];
      String part20 = string[19];
      System.out.println(part1);

  }
}
