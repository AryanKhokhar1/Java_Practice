class Square{
    float sidelength;
    Square(float side){
        this.sidelength = side;
    }
    float Perimeter(){
        return 4*this.sidelength;
    }
    float Area(){
        return this.sidelength*this.sidelength;
    }
}

public class Practice8_3 {
    public static void main(String[] args) {
        Square s1 = new Square(4.5f);
        System.out.println("Perimeter of the square: "+s1.Perimeter());
        System.out.println("Area of the square: "+s1.Area());
    }
}
