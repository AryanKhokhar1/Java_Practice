import org.w3c.dom.css.Rect;

class Rectangle{
    float length;
    float width;
    Rectangle(float length , float width){
        this.length = length;
        this.width = width;
    }
    float Perimeter(){
        return 2.0f*(this.length + this.width);
    }
    float Area(){
        return this.length*this.width;
    }
}
class Cuboid extends Rectangle{
    
    float length;
    float width;
    float height;
    Cuboid(float length,float width, float height){
        super(length,width);
        this.length = length;
        this.width = width;
        this.height = height;
        
    }
    float CurvedSurfaceArea(){
        return super.Perimeter()*this.height;
    }
    float TotalSurfaceArea(){
        return 2.0f*(super.Area() + this.length*this.height + this.width*this.height);
    }
    float Volume(){
        return super.Area()*this.height;
    }
}

public class Practice10_2 {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(2.3f, 3.4f, 4.2f);
        System.out.println("Curved Surface Area of the Cuboid: "+cuboid1.CurvedSurfaceArea());
        System.out.println("Total Surface Area of the Cuboid: "+cuboid1.TotalSurfaceArea());
        System.out.println("Volume of the Cuboid: "+cuboid1.Volume());
        System.out.println("Perimeter of the Rectangle: "+cuboid1.Perimeter());
        System.out.println("Area of the Rectangle: "+cuboid1.Area());
    }
}