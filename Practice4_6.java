// Find out type of website

public class Practice4_6 {
    public static void main(String[] args) {
        String url = "www.google.com";
        System.out.println("Type of Website");
        System.out.println("URL: "+url);
        if (url.contains(".com")) {
            System.out.println("It's a global site");
        }else if(url.contains(".in")){
            System.out.println("This website is only for indians");
        }else if(url.contains(".org")){
            System.out.println("This site run by an Organization");
        }
    }
}
