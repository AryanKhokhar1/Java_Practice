
class MyThread1 implements Runnable {
    public void run(){
        int n = 0;
        while(n<10){
            System.out.println("MyThread1 running...");
            n++;
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int n = 0;
        while(n<10){

            System.out.println("Thread 2 running...");
            n++;
        }
    }
}
public class Chapter13_runnable {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread gun1 = new Thread(bullet1);
        
        MyThread2 bullet2 = new MyThread2();
        Thread gun2 = new Thread(bullet2);
        
        // starting thread 
        gun1.start();
        gun2.start();
    }
}
