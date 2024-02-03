
class Phone{
    void Greet(){
        System.out.println("Hii, Aryan \n\t\t--Phone");
    }
    void On(){
        System.out.println("Phone On");
    }
}
class SmartPhone extends Phone{
    void Swagat(){
        System.out.println("Hii, Aryan \n\t\t--SmartPhone");
    }
    void On(){
        System.out.println("SmartPhone On");
    }
}

public class Chapter10_Dynamic_method_dispatch {
    public static void main(String[] args) {
        
        // Super obj = new sub
        // Dynamic Method Dispatch
        Phone obj = new SmartPhone(); // Here obj obj contain reference of Phone and it's object of SmartPhone

        obj.Greet();
        obj.On();
        // obj.Swagat(); // We Cann't call methods present in smartphone class only
    }
}
