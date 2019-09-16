package showBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
public class AllWords {
    private int id;
    private String polishWord;
    private String englishWord;
    private String category;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", polishWord='" + polishWord + '\'' +
                ", englishWord='" + englishWord + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}