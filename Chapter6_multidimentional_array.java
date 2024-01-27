// MultiDimentional Array

public class Chapter6_multidimentional_array {
    public static void main(String[] args) {
        int marks[][][] = new int[2][5][6];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                for(int k=0; k<6; k++){
                    marks[i][j][k] = i+j+k;
                }
            }
        }
        System.out.println(marks.length);
        System.out.println(marks[0].length);
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
                for(int k=0; k<6; k++){
                    System.out.print(marks[i][j][k]+", ");
                }
                System.out.println();
            }
        }
    }

}
