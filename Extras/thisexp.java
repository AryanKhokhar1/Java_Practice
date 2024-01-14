public class thisexp {
    int a;
    thisexp(int a){
        this.a = a;
        System.out.println("The value of a ="+this.a);
    }
    thisexp(){
        this(899);
        System.out.println("Empty Constructor");
    }
    void a(){
        System.out.println("A");
    }
    void b(){
        System.out.println("B");
        this.a();
    }
    public static void main(String[] args) {
        thisexp obj = new thisexp();
        obj.b();
    }
}
