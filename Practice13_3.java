
class Thr1 extends Thread {
    public void run(){
        while(true){
            System.out.println("Thread 1 is running");
        }
    }
}
class Thr2 extends Thread {
    public void run(){
        while(true){
            System.out.println("Thread 2 is running");
        }
    }
}

public class Practice13_3 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.setPriority(3);
        t2.setPriority(6);
        t1.start();
        t2.start();
    }
}
