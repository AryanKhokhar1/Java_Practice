public class Chapter2_Operator {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 9;
        int x;
        // Arthimatic Operators
        System.out.println("\nArthimatic Operators");
        System.out.println(a+b+c);
        System.out.println(a%b);
        System.out.println(++a);

        // Assignment Operators
        System.out.println("\nAssignment Operators");
        x = a;
        System.out.println(x);
        x += 1;
        System.out.println(x);

        // Comparison Operators
        System.out.println("\nComparison Operators");
        System.out.println(8>9);
        System.out.println(98==98);

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(false || true);

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println(1&0);
        System.out.println(1&1);
        System.out.println(1|0);
        System.out.println(0&1);


    }
}
