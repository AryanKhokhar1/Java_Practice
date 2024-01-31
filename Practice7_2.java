public class Practice7_2 {
    static String printpattern(int num , int x){
        if(x == 0){
            return "";
        }
        for(int i = 0; i<num; i++){
            System.out.print("* ");
        }
        System.out.println();
        return printpattern(num+1,x-1);
    }
    public static void main(String[] args) {
        int num = 5;
        printpattern(1,num);
    }
}
