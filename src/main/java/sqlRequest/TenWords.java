package sqlRequest;

public class TenWords {

    private String polish_word;
    private String english_word;

    public TenWords(String polish_word, String english_word){
        this.polish_word = polish_word;
        this.english_word = english_word;
    }

    public String getPolish_word() {
        return polish_word;
    }

    public void setPolish_word(String polish_word) {
        this.polish_word = polish_word;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public String toStringPolishWord() {
        return polish_word;
    }

    public String toStringEnglishWord() {
        return english_word;
    }
}
