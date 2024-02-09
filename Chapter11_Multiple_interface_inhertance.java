interface A {
    void A1();
} 
interface B{
    void B1();
}

abstract class C{
    C(){
        System.out.println("This is Constructor of Class C");
    }
    abstract void C1();
}
class child extends C implements A,B{
    public void A1(){
        System.out.println("This is A1 method");
    }
    public void B1(){
        System.out.println("This is B1 method");
    }
    void C1(){
        System.out.println("This is C1 method");
    }
}
public class Chapter11_Multiple_interface_inhertance {
    public static void main(String[] args) {
        C obj = new child();
        child obj2 = new child();
        obj.C1();
        obj2.A1();
        obj2.B1();
    }
}
