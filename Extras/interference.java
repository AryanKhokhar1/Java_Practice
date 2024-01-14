// It's a another way to achieve abstraction.

interface Animal{
    public void animalSound();
    public void physical();
}
class Dog implements Animal{
    public void animalSound(){
        System.out.println("Boww Boww");
    }
    public void physical(){
        System.out.println("Flexible");
    }
}
class interference extends Dog {
    public static void main(String[] args) {
        interference i1 = new interference();
        i1.animalSound();
        i1.physical();
    }
}
