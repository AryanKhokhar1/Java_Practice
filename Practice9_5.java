import java.lang.Math; 
class Sphere{
    private float radius;
    float pie = (float) Math.PI;
    float getRadius() {
        return radius;
    }
    void setRadius(float radius) {
        this.radius = radius;
    }
    float surfaceArea(){
        return (4.0f*pie*this.radius*this.radius);
    }
    float volume(){
        // (4/3)*pie*r*r*r;
        return ((4/3)*pie*this.radius*this.radius*this.radius);
    }
}

public class Practice9_5 {
  public static void main(String[] args) {
    Sphere cyl = new Sphere();
    cyl.setRadius(3.86f);
    System.out.println("Radius of the Sphere: "+cyl.getRadius());
    System.out.format("\n Total Surface Area of the Sphere: %.3f",cyl.surfaceArea());
    System.out.printf("\n Volume of the Sphere: %.3f",cyl.volume());
  }
}
