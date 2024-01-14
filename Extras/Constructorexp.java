public class Constructorexp {
    Constructorexp(){
        System.out.println("No Value is passed ");
    }
    Constructorexp(int a, int b){
        System.out.println("Multiplication of a and b = "+a*b);
    }
    public static void main(String[] args) {
        Constructorexp obj = new Constructorexp(5,7);
        Constructorexp obj2 = new Constructorexp();

    }
}
