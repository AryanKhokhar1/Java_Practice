public class returnnullexp {
    public void function1(String a){
        System.out.println(a);
        // return;
    }
    public static void main(String[] args) {
        String a = "Done";
        returnnullexp obj = new returnnullexp();
        obj.function1(a);

    }
}
