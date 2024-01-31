class Circle{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    float Perimeter(){
        return (2*22*this.radius)/7;
    }
    float Area(){
        return (22*radius*radius)/7;
    }
}
public class Practice8_6 {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.3f);
        System.out.format("Perimeter of the Circle with "+c1.radius+" Radius : %.2f\n",c1.Perimeter());
        System.out.format("Area of the Circle with "+c1.radius+" Radius : %.2f",c1.Area());
    }
}
