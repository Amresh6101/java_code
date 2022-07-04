
import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        Map<Character, Integer> m1 = new HashMap<>();
        int count = 97;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (m1.containsKey(ch) == false && ch != 32) {
                m1.put(ch, count);
                count++;
            } else {

            }
        }
        StringBuilder sb1 = new StringBuilder("");
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == 32) {
                sb1.append(" ");

            } else {
                int temp = m1.get(ch);
                char ch1 = (char) temp;
                sb1.append(ch1);
            }

        }
        System.out.println(m1);
        System.out.println(sb1);
    }

}
