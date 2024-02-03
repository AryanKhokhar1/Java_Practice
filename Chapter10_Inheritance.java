class Cat{
    void structure(){
        System.out.println("4 Legs");
    }
    public void Voice(){
        System.out.println("Meow.. Meow..");
    }
}
class Dog extends Cat{
    public void Voice(){
        System.out.println("Bohhh... Bohh..");
    }
}
public class Chapter10_Inheritance extends Dog{
    public static void main(String[] args) {
        Chapter10_Inheritance obj = new Chapter10_Inheritance();
        obj.Voice();
        obj.structure();
    }
}
