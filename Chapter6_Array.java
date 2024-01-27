public class Chapter6_Array {
    public static void main(String[] args) {


        // An array is a collection of similar elements stored at contiguous memory locations
        // Array is an object
        
        int[] marks = new int[5];
        // int marks[] = new int[5];   // Both are similar
        marks[0] = 34;
        marks[1] = 54;
        marks[2] = 64;
        marks[3] = 74;
        marks[4] = 84;
        
        int value[] = {45,68,24,76};
        System.out.println(marks);
        System.out.println(value);
        System.out.println(marks.length);
        System.out.println(value.length);
        System.out.println(marks.getClass());

        String[] Students = {"Aaryan","Lavish","Siddhant","Mannny"};
        System.out.println(Students.length);
        System.out.println(Students[0]);

        // It's also called array traversal
        for(int i = 0; i<Students.length; i++){
            System.out.println(Students[i]);
        }
    }
}
