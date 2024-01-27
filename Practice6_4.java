import java.util.Scanner;

public class Practice6_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] class_marks =new int [2][3];

        // For intake
        for(int i = 0; i<class_marks.length; i++){
            for(int j= 0; j<class_marks[i].length; j++){
                System.out.printf("Matrix %d x %d:",i,j);
                class_marks[i][j] = scan.nextInt();

            }
        }

        // For Printing
        for(int i = 0; i<class_marks.length; i++){
            for(int j= 0; j<class_marks[i].length; j++){
                System.out.printf("%d ",class_marks[i][j]);
            }
            System.out.println();
        }
    }
}
