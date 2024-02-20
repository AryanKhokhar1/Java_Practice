
class Thre1 extends Thread {
    public void run(){
        int n = 0;
        while(n<50){
            System.out.println("Thread 1 is running");
            n++;
        }
    }
}
class Thre2 extends Thread {
    public void run(){
        int n = 0;
        while(n<50){
            System.out.println("Thread 2 is running");
            n++;
        }
    }
}

public class Practice13_4 {
    public static void main(String[] args) {
        Thre1 t1 = new Thre1();
        Thre2 t2 = new Thre2();
        try {
            System.out.println(t1.getState());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        t1.start();
        // t2.start();
        try {
            System.out.println(t1.getState());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        t1.stop();
        try {
            System.out.println(t1.getState());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
