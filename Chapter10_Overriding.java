class Base{

    void detail(){
        System.out.println("This detail method of Class Base");
    }
    void detail2(){
        System.out.println("This detail2 method of Class Base");
    }
}
class Derived extends Base{

    // Here we override method detail in Derived Class
    @Override // It's Annotation used to indicate method override here (It's optional)
    void detail(){
        System.out.println("This detail method of Class Derived");
    }

    // detail2 isn't overriding
    void detail2( int a){
        System.out.println("This detail2 method of Class Derived");
    }
}

public class Chapter10_Overriding {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.detail();
        obj.detail2();
        obj.detail2(5);
    }
}
