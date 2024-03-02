class NegativeDimentionException extends Exception{
     @Override
     public String toString() {
         return "Dimention can't be negative";
     }
     @Override
     public String getMessage() {
         return "Dimension can't be negative";
     }
}

class Rectangle{

    // throws keyword used to declare that this method can throw a particular Exception handle it
    double Area(double length, double width) throws NegativeDimentionException{
        if(length<0 || width <0){
            NegativeDimentionException child = new NegativeDimentionException();
            throw child;
        }
        double area = length * width;
        return area;
    }
}
public class Chapter14_throws {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        try{
            double value = rec.Area(5, -7);
            System.out.printf("Area of Rectangle: %.2f ",value);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
