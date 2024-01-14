class testing{
    public static void main(String[] args) {
        String s1 = "Aryan";
        // int num = 5;
        // s1 = s1.toLowerCase();
        // s1 = s1.startsWith("Mr");
        // System.out.println(s1.endsWith("yan"));
        s1 = s1.replace("n", "p");
        String s2 = s1.substring(0,3);
        s2 = "Ayan";
        System.out.println(s1.equals(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1);
        System.out.println("The substring ="+s2);
    }
}