class Animal{
    public void sound(){
        System.out.println("Different type of sound");
    }
}
class dog extends Animal{
    public void sound(){
        super.sound();
        System.out.println("Bow Bow");
    }
}
class german_shephard extends dog{
    public void sound(){
        super.sound();
        System.out.println("Boww Boww");
    }
}
public class inhert {
    public static void main(String[] args){
        german_shephard dog1 = new german_shephard();
        dog1.sound();
    }
}
 