// Average marks in Physics
public class Practice6_3 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 89;
        marks[1] = 79;
        marks[2] = 56;
        marks[3] = 35;
        marks[4] = 48;

        float sum = 0.0f;
        for(int physics_mark: marks){
            sum += physics_mark;
        }
        double Average = sum/marks.length;
        System.out.printf("Average marks of Physics: %.1f ",(Average));
    }
}
