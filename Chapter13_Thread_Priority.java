
class Thread1 implements Runnable {

    public void run(){

        while(true){
            System.out.println("Thread 1");
        }
    }
}
class Thread2 implements Runnable {

    public void run(){
        while(true){
            System.out.println("Thread 2");
        }
    }
}

public class Chapter13_Thread_Priority {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread tt1 = new Thread(t1);
        
        Thread2 t2= new Thread2();
        Thread tt2 = new Thread(t2);
        tt2.setPriority(5);
        tt1.setPriority(3);
        tt1.start();
        tt2.start();

    }
}
