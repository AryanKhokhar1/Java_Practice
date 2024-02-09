
interface A{
    void A1();
    void A2();
}
interface B extends A{
    void B1();
    void B2();
}
class C implements B{
    public void A1(){
        System.out.println("A1");
    }
    public void A2(){
        System.out.println("A2");
    }
    public void B1(){
        System.out.println("B1");
    }
    public void B2(){
        System.out.println("B2");
    }
}
public class Chapter11_inheritance_in_interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.A1();
        obj.A2();
        obj.B1();
        obj.B2();
    }
}
