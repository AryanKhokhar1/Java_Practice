class TommyVecetti{

    void hitting(){
        System.out.println("hitting...");
    }
    void running(){
        System.out.println("Runnning...");
    }
    void firing(){
        System.out.println("firing...");
    }
    void sleep(){
        System.out.println("sleeping...");
    }
}
public class Practice8_5 {
    public static void main(String[] args) {
        TommyVecetti player1 = new TommyVecetti();
        player1.sleep();
        player1.hitting();
        player1.running();
        player1.firing();
    }
}
