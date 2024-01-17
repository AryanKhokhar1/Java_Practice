public class Practice2_2 {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char) (grade + 8); // It's a way to convert integer to Char data type
        System.out.println("Encrypted Grade: "+grade);

        grade = (char) (grade -8);
        System.out.println("Decrypted Grade: "+grade);
    }
}
