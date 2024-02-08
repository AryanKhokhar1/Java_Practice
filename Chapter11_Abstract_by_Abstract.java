abstract class Phone{
    Phone(){
        System.out.println("Hii! ");
    }

    abstract void Ringtone();
    abstract void name();
    abstract void os();
}

abstract class ipad extends Phone{
    abstract void greet();
}

class realme extends ipad{
    // In realme class I must to add all abstract method from parent and grandparent classes
    void Ringtone(){
        System.out.println("Tiu Tiu Tiu....");
    }
    void name(){
        System.out.println("Realme 12 pro +");
    }
    void os(){
        System.out.println("Funtouch OS");
    }
    void greet(){
        System.out.println("Hii, Aryan welcome to Funtouch Ai");
    }
}


public class Chapter11_Abstract_by_Abstract {
    public static void main(String[] args) {
        realme twele12pro = new realme();
        twele12pro.greet();
        twele12pro.name();
        twele12pro.os();
        twele12pro.Ringtone();
    }
}
