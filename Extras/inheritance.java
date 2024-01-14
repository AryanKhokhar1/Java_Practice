import java.util.Scanner;
class inheritance {
    private String name;
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void intro(){
        System.out.println("Hii");
    }
}
class dtail extends inheritance{
    public static void main(String[] args){
        dtail obj = new dtail();
        obj.intro();
        Scanner s1 = new Scanner(System.in);
        System.out.print("Name = ");
        String nam = s1.nextLine();
        obj.setname(nam);
        System.out.println("Hii "+obj.getname()+", Welcome to Boston Dynamic ");
    }
}
