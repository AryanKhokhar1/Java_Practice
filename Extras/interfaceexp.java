interface example{
    void func();
}
public class interfaceexp implements example {
    public void func(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        interfaceexp obj = new interfaceexp();
        obj.func();
    }
}
