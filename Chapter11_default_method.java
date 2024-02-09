import java.util.Scanner;

interface Camera{
    void takePicture();
    void takeVideo();
    void takeSelfie();

    // defautl method
    default void switchto4k(){
        currentformat();
        System.out.println("Switched to 4k");
    }
    // Can make private method but private method can be called within interface only
    private void currentformat(){
        System.out.println("Current format: 1080p");
    }
}
interface MediaPlayer{
    void mediaplay();
    void mediacheckFormat();
    void mediastop();
}
interface GPS{
    void currentLocation();
    void Route();
}
class cellPhone{
    void Call(String name){
        System.out.println("Calling to "+name);
    }
    void pickCall(String name){
        System.out.println(name+ " is Calling you!");
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Pick Call \n 2. Cancel Call");
        int response = scan.nextInt();
        if(response == 1){
            System.out.println(name +" is on the line");
        }else if(response == 2){
            System.out.println(name + " call disconnected");
        }
    }
}
class SmartPhone extends cellPhone implements Camera,MediaPlayer,GPS{
    public void takePicture(){
        System.out.println("Chickkk \n Picture is taken");
    }
    public void takeSelfie(){
        System.out.println("Chickkk \n Selfie is taken");
    }
    public void takeVideo(){
        System.out.println("Tiuu \n Video is recording...");
    }
    public void mediacheckFormat(){
        System.out.println("Format is Valid");
    }
    public void mediaplay(){
        System.out.println("Media start playing..");
    }
    public void mediastop(){
        System.out.println("Media Stop playing...");
    }
    public void currentLocation(){
        System.out.println("Current Location: Mukandpur");
    }
    public void Route(){
        System.out.println("Here is the Route");
    }
}

public class Chapter11_default_method {
    public static void main(String[] args) {
        Camera phonecam = new SmartPhone();
        GPS phonegps = new SmartPhone();
        MediaPlayer phonemedia = new SmartPhone();
        SmartPhone pocoPhone = new SmartPhone();
        phonecam.takePicture();
        phonecam.takeSelfie();
        phonecam.takeVideo();
        pocoPhone.switchto4k();
        phonegps.currentLocation();
        phonegps.Route();
        phonemedia.mediacheckFormat();
        phonemedia.mediaplay();
        phonemedia.mediastop();
        pocoPhone.Call("Sonu");
        pocoPhone.pickCall("Vaani");
    }
}
