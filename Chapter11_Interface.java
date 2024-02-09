// Interface is group of related methods with empty bodies
// Interface must have all methods abstract

interface Bicycle{

    // All properties in an interface are final
    int a = 45;
    float applyBrake(int decrement);
    float applyAccelerate(int increment);
    void showSpeed();
}

class AvonCycle implements Bicycle{
    float speed;
    AvonCycle(float speed){
        this.speed = speed;
    }
    public float applyAccelerate(int increment){
        System.out.println("Current Speed: "+this.speed);
        this.speed = this.speed + increment;
        System.out.println("Speed after "+increment+" increment: "+this.speed);
        return this.speed;
    }
    public float applyBrake(int decrement){
        System.out.println("Current Speed: "+this.speed);
        this.speed = this.speed - decrement;
        if(this.speed<0){
            System.out.println("Speed after "+decrement+" decrement: "+this.speed);
            this.speed = 0;
            return this.speed;
        }else{
            System.out.println("Speed after "+decrement+" decrement: "+this.speed);
            return this.speed;
        }   
    }
    public void showSpeed(){
        System.out.println("Current Speed: "+this.speed);
    }
}
class heroCycle implements Bicycle{
    float speed;
    heroCycle(float speed){
        this.speed = speed;
    }
    public float applyAccelerate(int increment){
        System.out.println("Current Speed: "+this.speed);
        this.speed = this.speed + increment;
        System.out.println("Speed after "+increment+" increment: "+this.speed);
        return this.speed;
    }
    public float applyBrake(int decrement){
        System.out.println("Current Speed: "+this.speed);
        this.speed = this.speed - decrement;
        if(this.speed<0){
            this.speed = 0;
            System.out.println("Speed after "+decrement+" decrement: "+this.speed);
            return this.speed;
        }else{
            System.out.println("Speed after "+decrement+" decrement: "+this.speed);
            return this.speed;
        }   
    }
    public void showSpeed(){
        System.out.println("Current Speed: "+this.speed);
    }
}

public class Chapter11_Interface {
    public static void main(String[] args) {
        AvonCycle avon1 = new AvonCycle(20);
        heroCycle hero1 = new heroCycle(19);
        avon1.applyAccelerate(20);
        avon1.applyBrake(31);
        avon1.showSpeed();
        // You can create properties in interface
        System.out.println("Value of a ="+avon1.a);
        // You can't modify properties of an interface
    }
}
