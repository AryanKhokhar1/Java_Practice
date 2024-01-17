public class Chapter3_String {
    public static void main(String[] args) {
        // String isn't a Datatype. It's a Class used to create string object
        String name = new String("Aryan Khokhar");

        // printf is special type of print method where we can denote variable in form of %d , %f same as C language
        System.out.printf("Hii %s , Welcome to EduHub",name);

        String religion = "Sanatan";
        System.out.println("\nReligion of "+name+" is "+religion);
    }
}
