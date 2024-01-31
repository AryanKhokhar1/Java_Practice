public class Practice7_7{
    static String printpattern(int x){
        if (x == 0) {
            return "";
        }
        for(int i = 0; i<x; i++){
            System.out.print("*");
        }
        System.out.println();
        return printpattern(x-1);
    }
    public static void main(String[] args) {
        printpattern(5);
    }
}