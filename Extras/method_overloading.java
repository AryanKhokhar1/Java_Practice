public class method_overloading {
    static int func(int a, int b){
        return a+b;
    }
    static String func(String a, String b){
        return a+b;
    }
    public static void main(String[] args){
        int addition = func(3,5);
        String concatination = func("Aryan","Khokhar");
        System.out.println("Calling using int: "+addition);
        System.out.println("Calling using String: "+concatination);
    }
}
