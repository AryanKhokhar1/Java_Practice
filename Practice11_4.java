abstract class TelePhone{
    abstract void ring();
    abstract void pickup();
    abstract void disconnect();
}
class smartTelePhone extends TelePhone{

    void ring(){
        System.out.println("Tring.. Tring.. Tring...");
    }
    void pickup(){
        System.out.println("TelePhone is Connected");
    }
    void disconnect(){
        System.out.println("Call is Disconnected");
    }
    void currentLocation(){
        System.out.println("Current Location: Gamma2, Noida");
    }
}
class Practice11_4 {
    public static void main(String[] args) {
        TelePhone t1 = new smartTelePhone();
        t1.ring();
        t1.pickup();
        t1.disconnect();
        // t1.currentLocation(); //
    }
}