interface TvRemote{
    void menu();
    void nextChannel();
    void previousChannel();
    void volumeUp();
    void volumeDown();
}
interface smartTvRemote extends TvRemote{
    void google();
    void netflix();
    void callAlexa();
}
public class Practice11_6 {
    public static void main(String[] args) {
        
    }
}
