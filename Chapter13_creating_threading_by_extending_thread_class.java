
class Chatting extends Thread{
    @Override
    public void run(){
        while(true){
        System.out.println("Chatting...");
        }
    }
}
class Coding extends Thread {
    @Override
    public void run() {
        int a = 1;
        while(true){
            System.out.println(a+" Coding...");
            a++;
        }
    }
}
public class Chapter13_creating_threading_by_extending_thread_class {
    public static void main(String[] args) {
        Thread sonuChatting = new Chatting();
        Thread sonuCoding = new Coding();
        sonuChatting.start();
        sonuCoding.start();
    }
}
