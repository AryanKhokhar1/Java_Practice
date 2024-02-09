interface TvRemote{
    String[] channels = {"Zee Cinema","Star Utsav","9xM","Aaj Tak"};
    void menu();
    void nextChannel();
    void previousChannel();
    void channelNumber();
    void volumeUp();
    void volumeDown();
    void currentVolume();
}
interface smartTvRemote extends TvRemote{
    void google(String Phrase);
    void netflix();
    void callAlexa(String Phrase);
}

class Tv implements smartTvRemote{
    int currentChannel;
    int currentVolume;
    Tv(){
        this.currentChannel = 516;
        // Maximum volume = 10
        this.currentVolume = 5;
    }
    public void menu(){
        System.out.println("Channels Name");
        for (String element : this.channels) {
            System.out.println(element);
        }
    }
    public void nextChannel(){
        this.currentChannel += 1;
    }
    public void previousChannel(){
        this.currentChannel -= 1;
    }
    public void channelNumber(){
        System.out.println("Current Channel: "+this.currentChannel);
    }
    public void volumeUp(){
        if(this.currentVolume < 10){
            this.currentVolume += 1;
        }
    }
    public void volumeDown(){
        if(this.currentVolume > 0){
            this.currentVolume -= 1;
        }
    }
    public void currentVolume(){
        System.out.println("Volume: "+this.currentVolume);
    }
    public void google(String Phrase){
        System.out.println("Hey Google , "+Phrase);
        System.out.println("I found this on web");
    }
    public void callAlexa(String Phrase){
        System.out.println("Hey Alexa , "+Phrase);
        System.out.println("I found this on web");
    }
    public void netflix(){
        System.out.println("Netflix..");
    }
}
public class Practice11_7 {
    public static void main(String[] args) {
        smartTvRemote sr1 = new Tv();
        TvRemote tr1 =new Tv();
        Tv LG = new Tv();
        sr1.callAlexa("What's Weather today");
        sr1.netflix();
        sr1.volumeUp();
        sr1.currentVolume();
        tr1.channelNumber();
        tr1.nextChannel();
        tr1.channelNumber();
        tr1.menu();
        LG.netflix();
    }
}
