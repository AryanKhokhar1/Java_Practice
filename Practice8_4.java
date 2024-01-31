class Rectangle{
    float length , breath;
    Rectangle(float length, float breath){
        this.length = length;
        this.breath = breath;
    }
    float Perimeter(){
        return (this.length + this.breath)*2;
    }
    float Area(){
        return (this.length*this.breath);
    }
}
public class Practice8_4 {
    public static void main(String[] args) {
        Rectangle re1 = new Rectangle(4.23f, 4.10f);
        System.out.println("Perimeter of the Rectangle: "+re1.Perimeter());
        System.out.println("Area of the Rectangle: "+re1.Area());
    }
}
