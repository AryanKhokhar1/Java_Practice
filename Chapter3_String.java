public class Chapter3_String {
    public static void main(String[] args) {
        // String isn't a Datatype. It's a Class used to create string object
        String name = new String("Aryan Khokhar");

        // printf is special type of print method where we can denote variable in form of %d , %f same as C language
        System.out.printf("Hii %s , Welcome to EduHub",name);

        String religion = "Sanatan";
        System.out.println("\nReligion of "+name+" is "+religion);

        System.out.format("\nReligion of %s is %s",name,religion);  // format printing method is same as prinf method


        float number = 2.48373874f;
        System.out.printf("Float number = %8.2f",number);  // here 8 define number of space taken by number and 2 define number of digit after point
    }
}
