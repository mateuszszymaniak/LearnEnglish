package logic;

import tenWords.TenWords;

import java.util.HashMap;

public class DataStorage {
  private static HashMap<Integer, TenWords> unlearnedWords;

  public static HashMap<Integer, TenWords> getUnlearnedWords() {
    return unlearnedWords;
  }

  public HashMap<Integer, TenWords> setUnlearnedWords(HashMap<Integer, TenWords> unlearnedWords) {
    return DataStorage.unlearnedWords = unlearnedWords;
  }
}
