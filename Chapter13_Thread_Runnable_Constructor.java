
class MyThread implements Runnable {
    // String name;
    public void run(){
        int n = 0;
        while(n<10){
            System.out.println("Run method running...");
            n++;
        }
    }
}

public class Chapter13_Thread_Runnable_Constructor {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj,"Aaryan Khokhar");
        t1.start();
        System.out.println("\n"+t1.getId());
        System.out.println("\n"+t1.getName());
    }
}
