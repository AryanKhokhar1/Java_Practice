interface BasicAnimal{
    void eat();
    void step();
}
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
class Human extends Monkey implements BasicAnimal{
    int step;
    Human(){
        this.step = 0;
    }
    void jump(){
        System.out.println("Jumpingg...");
    }
    void bite(){
        System.out.println("I'm biting on the apple to eat it");
    }
    public void eat(){
        bite();
        System.out.println("I'm eating the Apple");
    }
    public void step(){
        System.out.println("I'm walking \n Current Step: "+this.step);
        this.step += 1;
    }
}
public class Practice11_3 {
    public static void main(String[] args) {
        Human Aryan = new Human();
        Aryan.step();
        Aryan.step();
        Aryan.step();
        Aryan.step();
        Aryan.eat();
        Aryan.jump();
    }
}
