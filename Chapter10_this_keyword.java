class Base{
    Base(){
        System.out.println("It's a non argument Constructor");
    }
    Base(int a){
        this();
        System.out.println("It's an argument based Constructor value: "+a);
    }
}


public class Chapter10_this_keyword {
    public static void main(String[] args) {
        Base obj = new Base(5);
    }
}
