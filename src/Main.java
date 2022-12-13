import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    int x = map.get(c);
                    x++;
                    map.put(c, x);
                } else {
                    map.put(c, 1);
                }
            }
        }

        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);

        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (minEntry == null || minEntry.getValue() > entry.getValue()) {
                minEntry = entry;
            }
        }
        System.out.println(minEntry);
    }

    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
}
