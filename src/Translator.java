import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Integer, String> numericAlpha = new HashMap<>();

    public Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }

    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}
