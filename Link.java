import java.util.*;

public class Link {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.addLast(1);
        arr.addLast(2);
        arr.addFirst(8);
        arr.addLast(0);
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(67);
        temp.addAll(arr);
        System.out.println(temp);

    }
}