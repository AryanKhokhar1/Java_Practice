
class Base{
    // Default Constructor is with out argument Constructor
    int x;
    Base(int x){
        this.x = x;
        System.out.println("I'm Base Class Constructor");
    }
}
class Derived extends Base{
    Derived(int x){
        super(x);
    }
    void detail(){
        System.out.println("This is detail method of Derived Class");
        System.out.println("Value of x = "+super.x);
    }
}
class Chapter10_super_keyword{
public static void main(String[] args) {
    Derived obj = new Derived(58);
    obj.detail();
}
}