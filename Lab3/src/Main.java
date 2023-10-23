import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Вхідні дані: №1328
        // C3 = 1328 % 3; // 2 - "String"
        // C17 = 1328 % 17; // 2 - "	Знайти таке слово в першому реченні заданого тексту, якого не має в жодному з наступних"

        String text = "Доброго дня. Як ваши справи? рипмав!";
        text = text.toLowerCase(Locale.ROOT);
        String[] sentences = text.split("\\.|\\?\\s*|!\\s*");
        String[] sentence_first = sentences[0].split("\\s+|,\\s*");
        int len = sentences.length;
        if (len < 2) {
            System.out.println("Дуже маленький текст.");
            System.exit(0);
        }
        int calc = 0;
        int calc_2 = 0;
        int len_sen;
        String[] sentence_temp;
        for (String first : sentence_first) {
            for (int i = 1; i < len; i++) {
                sentence_temp = sentences[i].split("\\s+|,\\s*");
                len_sen = sentence_temp.length;
                for (int j = 0; j < len_sen; j++) {
                    if (first.equals(sentence_temp[j])) {
                        calc++;
                        break;
                    }
                }
                if (calc == 0) {
                    System.out.println(first);
                    calc_2++;
                    break;
                }
                calc = 0;
            }

        }
        if (calc_2 == 0) {
            System.out.println("Подібних слів немає.");
        }
    }
}
