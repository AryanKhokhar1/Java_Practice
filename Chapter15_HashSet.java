import java.util.HashSet;

class Chapter15_HashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(8);
        hs1.add(23);
        hs1.add(8);
        System.out.println(hs1);
        System.out.println(hs1.size());
    }
}