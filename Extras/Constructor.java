import java.util.*;;
public class Constructor {
    int a;
    int ag;
    // Here below code is used to generate Constructor in java . Which name's define same as class name.
    public Constructor(int age){
        a = 5;
        ag = age;
    }
    public static void main(String[] args){
        System.out.print("Age = ");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        Constructor obj = new Constructor(a);
        System.out.println("Value of a = "+obj.a);
        System.out.println("Value of ag = "+obj.ag);
    }
}
