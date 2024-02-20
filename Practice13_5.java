
class MyThread3 extends Thread {
    public void run(){
        System.out.println("Thread 3");
    }
}
class MyThread4 extends Thread {
    public void run(){
        System.out.println("Thread 4");
    }
}



public class Practice13_5 {
    public static void main(String[] args) {
        MyThread3 mt3 = new MyThread3();
        MyThread4 mt4 = new MyThread4();
        // Thread m = Thread.currentThread();
        mt3.start();
        mt4.start();
        System.out.println(mt3.currentThread());
    }
}
