abstract class abstractexample {
    abstract void function1(int a, int b);
    abstractexample(){
        System.out.println("Welcome");
    }
}
class abstractexp extends abstractexample{
    void function1(int a, int b){
        System.out.println("Multiplication of a and b ="+a*b);
    }
    public static void main(String[] args) {
        abstractexp obj = new abstractexp();
        obj.function1(5, 9);
    }
}