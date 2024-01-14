// In this program we will learn about enum . It's often used in switch statement.
enum Level {
    LOW,
    MEDIUM,
    LARGE
}

public class learning {
    public static void main(String[] args) {
        Level mylevel = Level.MEDIUM;
        switch (mylevel) {
            case LOW:
                System.out.println("The mylevel value is Low");
                break;
            case MEDIUM:
                System.out.println("The mylevel value is Medium");
                break;
            case LARGE:
                System.out.println("The mylevel value is Large");
                break;
            // default:
            //     System.out.println("None of this case work");
            //     break;
        }
    }
}
