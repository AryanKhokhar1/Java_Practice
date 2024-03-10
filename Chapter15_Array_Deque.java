import java.util.ArrayDeque;

public class Chapter15_Array_Deque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(7);
        ad1.add(89);
        ad1.add(43);
        ad1.addFirst(56);
        System.out.println(ad1.getFirst());
        System.out.println(ad1);
        System.out.println(ad1.size());
    }
}
