class Chapter2_resultant_datatype {
    public static void main(String[] args) {
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
    }
}