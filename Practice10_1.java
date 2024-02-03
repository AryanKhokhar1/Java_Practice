
class Circle{
    float radius;
    float pie = (float) Math.PI;
    Circle(float radius){
        this.radius = radius;
    }
    float Perimeter(){
        return 2.0f*pie*this.radius;
    }
    float Area(){
        return pie*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    float pie = (float) Math.PI;
    float radius;
    float height;
    Cylinder(float radius, float height){
        super(radius);
        this.radius = radius;
        this.height = height;
        
    }
    float SurfaceArea(){
        return (super.Area()*2 + super.Perimeter()*this.height);
    }
    float Volume(){
        return super.Area()*this.height;
    }
}

public class Practice10_1 {
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder(2.34f, 10.2f);
        System.out.println("Surface Area of the Cylinder: "+cyl1.SurfaceArea());
        System.out.println("Volume of the Cylinder: "+cyl1.Volume());
        System.out.println("Perimeter of the Circle: "+cyl1.Perimeter());
        System.out.println("Area of the Circle: "+cyl1.Area());
    }
}
