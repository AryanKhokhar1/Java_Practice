import java.util.ArrayList;

public class Chapter15_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(9);
        a.add(0,1);
        a.add(2);
        b.add(45);
        b.add(12);
        b.add(87);
        a.addAll(b);
        a.add(2);
        // Adding two ArrayList
        System.out.println("Index of 4 in the ArrayList : "+a.indexOf(2)); // Tells index of perticular element
        System.out.println("Index of 4 in the ArrayList : "+a.lastIndexOf(2)); // Tells last index of perticular element
        System.out.println("Is ArrayList contain element 56: "+a.contains(56));
        System.out.println("Is ArrayList A and ArrayList B same: "+a.equals(b));
        System.out.println("Remove element from index = 4 : "+a.remove(4));
        a.set(3,455); // Set an Element at perticular position
        System.out.println(a);
        System.out.print("Elements in the ArrayList: ");
        for(int i =0 ; i<a.size(); i++){
            System.out.print(a.get(i)+", ");
        }
        System.out.println(a.size());

        System.out.println(a.subList(2, 5));

    }
}
