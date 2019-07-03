package sqlRequest;

public class AllWords {
    private int id;
    private String polish_word;
    private String english_word;
    private String category;

    public AllWords(int id, String polish_word, String english_word, String category) {
        this.id = id;
        this.polish_word = polish_word;
        this.english_word = english_word;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", polish_word='" + polish_word + '\'' +
                ", english_word='" + english_word + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
