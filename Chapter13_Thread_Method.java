
class MyThread1 extends Thread {

    public void run(){
        while(true){
            System.out.println("Thread 1 is running...");
        }
    }
}
class MyThread2 extends Thread {

    public void run(){
        while(true){
            System.out.println("Thread 2 is running...");
        }
    }
}
public class Chapter13_Thread_Method {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt1.start();

        // after appling join method on MyThread1 object . MyThread1 object will run continously without intercepting by MyThread2 object 
        try {
            mt1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        mt2.start();
    }
}
