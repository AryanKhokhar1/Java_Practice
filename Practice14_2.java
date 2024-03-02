import java.util.Scanner;

public class Practice14_2 {

    static boolean checkMinor(int age) throws IllegalArgumentException{
        if(age<18){
            
            throw new IllegalArgumentException("Age bellow 18");
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = 5;
        try{
            int b = scan.nextInt();
            System.out.printf("Dividing %d by %d : %d\n",a,b,a/b);
        }catch(ArithmeticException e){
            System.out.println("Haha");
        }
        try{
            boolean val = checkMinor(14);

        }catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
