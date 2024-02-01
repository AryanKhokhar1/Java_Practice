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
}

public class Practice9_1 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setHeight(100.56f);
        cyl.setRadius(78.86f);
        System.out.println("Height of the Cylinder: "+cyl.getHeight());
        System.out.println("Radius of the Cylinder: "+cyl.getRadius());
    }
}
