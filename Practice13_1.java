class MynewThread1 extends Thread {
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
class MynewThread2 extends Thread {
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
public class Practice13_1 {
    public static void main(String[] args) {
        MynewThread1 mt1 = new MynewThread1();
        MynewThread2 mt2 = new MynewThread2();
        mt1.start();
        mt2.start();
    }
}
