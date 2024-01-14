import java.util.*;
class OOPS{
    int age;
    String name;
    String cfm;
    public static void main(String[] args){
        OOPS obj1 = new OOPS();
        Scanner s1 = new Scanner(System.in);
        System.out.print("Name =");
        obj1.name = s1.nextLine();
        System.out.print("Age =");
        obj1.age = s1.nextInt();
        System.out.println("Is your age ="+obj1.age);
        System.out.print("Confirm :");
        obj1.cfm = s1.nextLine();
        obj1.cfm = obj1.cfm.toLowerCase();
        if(obj1.cfm == "y" || obj1.cfm == "yes"){
            System.out.println("Hii,"+obj1.name+". Welcome to Boston Dynamic");
        }else{
            System.out.println("Unsuccessfull");
        }

    }
}