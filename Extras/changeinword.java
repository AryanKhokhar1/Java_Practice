import java.util.Scanner;
class changeinword{
    static String Refined(String name){
        String pre = "";
        for(char i:name.toCharArray()){
            if(Character.isUpperCase(i)){
                // System.out.print(i);
                pre = pre + i;
            }
        }
        return pre;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = s1.nextLine();
        String result = Refined(name);
        System.out.println("The answer ="+result);
    }
}