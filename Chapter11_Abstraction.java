abstract class Phone{
    Phone(){
        System.out.println("Hii!, This is Phone Class");
    }
    abstract String welcome();
}
class Poco extends Phone{

    @Override
    String welcome(){
        return "Poco by Xiaomi";
    }
}
class Chapter11_Abstraction{
    public static void main(String[] args) {
        // Phone p1 = new Phone();  // Can't make Phone instance because it's an abstract class
        Phone x6 = new Poco();
        System.out.println(x6.welcome());
    }
}