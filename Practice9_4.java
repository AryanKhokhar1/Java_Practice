
/**
 * Rectangle
 */
class Rectangle {
    private float height;
    private float breadth;
    Rectangle(){
        this.height = 4;
        this.breadth = 5;
    }
    Rectangle(float height, float breadth){
        this.height = height;
        this.breadth = breadth;
    }
    float Parameter(){
        return 2*(this.height + this.breadth);
    }
    float Area(){
        return this.height*this.breadth;
    }
}

public class Practice9_4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(34.9f, 12.1f);
        System.out.println("Parameter of the Rectangle: "+rec.Parameter());
        System.out.println("Area of the Rectangle: "+rec.Area());
    }
}