class Chapter2_resultant_datatype {
    public static void main(String[] args) {

        // Resultant datatype after operation performed on different different datatypes

        int i = 4;
        float f = 3.4f;
        byte b = 1;
        long l = 1948;
        double d = 9.2;
        char c = 'a';
        System.out.println(i+c);  // It'will return an integer
        System.out.println(i+f);  // It'will return a float number
        System.out.println(l+f);  // It'will return a float number
        System.out.println(d+f);  // It'will return a double number
        System.out.println(l+b);  // It'will return a long number
        // System.out.println((i+i).getClass().getName());

        
        // Increment and Decrement Operators
        int x = 4;
        int y = 8;
        // int z =18;
        char character = 'a';
        System.out.println(x++); // print first then increment
        System.out.println(x);
        System.out.println(++y); // first increment then print
        System.out.println(y);
        System.out.println(y++*9);
        System.out.println(++character);

    }
}