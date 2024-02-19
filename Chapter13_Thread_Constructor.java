
class MyThread extends Thread {
    MyThread(String name){
        super(name);
    }
    public void run(){
        int n = 0;
        while(n<10){
            System.out.println("Run method running...");
            n++;
        }
    }
}

public class Chapter13_Thread_Constructor {
    public static void main(String[] args) {
        MyThread obj = new MyThread("Aryan");
        obj.start();
        System.out.println("Id of the thread = "+obj.getId());
        System.out.println("Name of the thread = "+obj.getName());
        System.out.println("Cheking Priority of the thread = "+obj.getPriority());
    }
}
