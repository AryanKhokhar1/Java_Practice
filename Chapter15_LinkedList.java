import java.util.LinkedList;

public class Chapter15_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> abc = new LinkedList<>();
        abc.add(5);
        abc.add(6);
        abc.add(7);
        abc.offer(8);
        int a = abc.poll(); // It will remove and store first element of the Linked List
        System.out.println("First Element of the Linked List: "+a);
        System.out.println(abc);
        for(int i = 0; i<abc.size(); i++){
            System.out.println(abc.get(i));
        }
    }
}
