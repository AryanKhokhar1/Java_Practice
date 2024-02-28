class Cat{
    int a = 5;
    Cat(){
        System.out.println("Cat:");
    }
    void structure(){
        System.out.println("4 Legs"+a);
    }
    public void Voice(){
        System.out.println("Meow.. Meow..");
    }
}
class Dog extends Cat{
    Dog(){
        System.out.println("Dog:");
    }
    public void Voice(){
        System.out.println("Bohhh... Bohh..");
    }
}
public class Chapter10_Inheritance extends Dog{
    public static void main(String[] args) {
        Chapter10_Inheritance obj = new Chapter10_Inheritance();
        obj.Voice();
        obj.structure();
        obj.a = 67;
        System.out.println("Value of a="+obj.a);
        Chapter10_Inheritance obj2 = new Chapter10_Inheritance();
        System.out.println("Value of a="+obj2.a);
    }
}
