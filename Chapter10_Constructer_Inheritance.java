
class Base{
    // Default Constructor is with out argument Constructor
    Base(){
        System.out.println("I'm Base Class Constructor");
    }
    Base(int x){
        System.out.println("I'm Base Class Constructor with an argument value: "+x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I'm Derived Class Constructor");
    }
    Derived(int x,int y){
        super(x); // It will run int argument constructor from class Base
        System.out.println("I'm Derived Class Constructor with an argument value: "+y);
    }
    void detail(){
        System.out.println("This is detail method of Derived Class");
    }
}

class ChildofDerived extends Derived{
    ChildofDerived(){
        System.out.println("I'm Child of Derived Class Constructor");
    }
    ChildofDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I'm Child of Derived Class Constructor with an argument value: "+z);
    }

    void detail(){
        System.out.println("This is detail method of ChildofDerived class");
        super.detail();
    }
}

public class Chapter10_Constructer_Inheritance {
    public static void main(String[] args) {
        ChildofDerived obj = new ChildofDerived();
        ChildofDerived obj2 = new ChildofDerived(1,2,3);
        obj2.detail();
    }
}
