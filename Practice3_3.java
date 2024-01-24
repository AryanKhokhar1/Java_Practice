// Replace name 

import java.util.Scanner;

class Practice3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.printf("Hii %s , Thanks a lot",name);
        System.out.println("\nHii "+name.replace(name, "Guddu")+" Thanks a lot");
    }
}