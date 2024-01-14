abstract class class1{
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Class 1");
    }
}
class class2 extends class1{
    public void animalSound(){
        System.out.println("Class 2");
    }
}
class check extends class2 {
    public void animalSound(){
        System.out.println("Main Class");
        super.animalSound();
    }
    public static void main(String[] args) {
        check c1 = new check();
        c1.animalSound();
        c1.sleep();
    }
}