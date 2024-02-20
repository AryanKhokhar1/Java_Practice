
class welcome implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome to Khokhar Program");
        }
    }
    
}
class greeting implements Runnable {

    @Override
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}
public class Practice13_2 {
    public static void main(String[] args) {
        welcome w = new welcome();
        Thread t1 = new Thread(w);

        t1.start();
        try{
            t1.sleep(200);
        }catch(Exception e){
            System.out.println(e);
        }
        greeting g = new greeting();
        Thread t2 = new Thread(g);

        t2.start();
    }
}
