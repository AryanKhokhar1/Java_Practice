class Cylinder{
    private float height;
    private float radius;
    float getHeight() {
        return height;
    }
    float getRadius() {
        return radius;
    }
    void setHeight(float height) {
        this.height = height;
    }
    void setRadius(float radius) {
        this.radius = radius;
    }
    float surfaceArea(){
        return ((2*22*this.radius*this.radius)/7.0f) + ((2*22*this.radius*this.height)/7.0f);
    }
    float volume(){
        return (22*this.radius*this.radius*this.height)/7.0f;
    }
}

public class Practice9_2 {
  public static void main(String[] args) {
    Cylinder cyl = new Cylinder();
    cyl.setHeight(10.56f);
    cyl.setRadius(3.86f);
    System.out.println("Height of the Cylinder: "+cyl.getHeight());
    System.out.println("Radius of the Cylinder: "+cyl.getRadius());
    System.out.format("\n Total Surface Area of the Cylinder: %.3f",cyl.surfaceArea());
    System.out.printf("\n Volume of the Cylinder: %.3f",cyl.volume());
  }
}