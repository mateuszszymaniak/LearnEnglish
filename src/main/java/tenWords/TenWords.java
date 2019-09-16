package tenWords;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TenWords {

    private String polishWord;
    private String englishWord;

    public String toStringPolishWord() {
        return polishWord;
    }

    public String toStringEnglishWord() {
        return englishWord;
    }
}