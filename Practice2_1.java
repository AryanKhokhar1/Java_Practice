public class Practice2_1 {
    public static void main(String[] args) {
        System.out.println("Expression evaluation");
        float a = 7/4.0f * 9/2.0f;
        // Answer different because of resultant data type 
        System.out.println(7/4*9/2); // here when 7 is divided by 4 it will result a integer number
        System.out.println("Expression result: "+a); // here after divind number it provide answer in float
    }
}
