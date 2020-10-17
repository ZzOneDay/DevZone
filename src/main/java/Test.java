import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Task039Impl task039 = new Task039Impl();
        Map<Character, Integer> resultEncoding =
                new HashMap<>(Map.of(
                        'A', 5,
                        'B', 34,
                        'C', 23,
                        'D', 15,
                        'E', 23,
                        'F', 6));
        Map<Character, String> map = task039.getEncoding(resultEncoding);
        for (Character character : map.keySet()) {
            System.out.println("Char: " + character + "; code: " + map.get(character));
        }

        String text = "FABCAEFD";
        System.out.println("my text : " + text);

        final String targetEncodedString = "1001100011001000011001101";
        System.out.println("codeTarget: " + targetEncodedString);

        String code = task039.getEncodedString(resultEncoding, text);

        System.out.println("my code " + code);

        String decode = task039.getDecodedString(resultEncoding, code);
        System.out.println(decode);
    }

}
