
class Access_Modifier_Learn{
    public int x = 45;
    protected int y = 23;
    int z = 34;
    private int a = 23;
    void detailsinMain(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class derivedClass extends Access_Modifier_Learn{
    void details(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a);
    }
}
public class Chapter12_Access_Modifier {
    public static void main(String[] args) {
        derivedClass obj = new derivedClass();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
    }
}