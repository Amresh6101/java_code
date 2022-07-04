import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Character, Integer> m1 = new HashMap<>();
        m1.put('c', 1);
        System.out.println(m1.containsKey('c'));
        System.out.println(m1.get('p'));
        m1.remove('b');
    }

}
