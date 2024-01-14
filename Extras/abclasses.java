class A{

    String functionA(){
        return "Function A runs";
    }
}
class B extends A{

    String functionB(){
        return "Function B runs";
    }
}

public class abclasses extends B {
    public static void main(String[] args) {
        B ab = new B();
        System.out.println(ab.functionB());
        System.out.println(ab.functionA());


    }
}
