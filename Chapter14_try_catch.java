public class Chapter14_try_catch {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The Result: "+c);
        }catch(Exception e){ // This catch block will run in every type of exception
            System.out.println("There is some problem in program "+e);
        }
        System.out.println("End of file");
    }
}
