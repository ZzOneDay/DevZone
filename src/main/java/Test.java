import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Task039Impl task039 = new Task039Impl();
        Map<Character, Integer> resultEncoding =
                new HashMap<>(Map.of(
                        'A', 100,
                        'B', 99,
                        'C', 50,
                        'D', 45,
                        'E', 10,
                        'F', 10));
        Map<Character, String> map = task039.getEncoding(resultEncoding);
        for (Character character : map.keySet()) {
            System.out.println("Char: " + character + "; code: " + map.get(character));
        }
    }

}
