
public class bike {
    private String name;
    private String subname;
    private int speed;

    
    
    void run(){
        System.out.println("Running...");
        System.out.println("Fetching details...");
    }

    void details(String name, String subname, int speed){
        String type = "two-wheeler";
        
        this.name = name;
        this.subname = subname;
        this.speed = speed;
        System.out.println(this.name + " " + this.subname);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + this.speed+"km/h");
        return ;
    }
}

class meteor extends bike{
    meteor(){

    }
    void putdetails(){
        meteor m = new meteor();
        m.details("Royal Enfield", "Meteor", 180);
    }

    public static void main(String[] args){
        System.out.println("Welcome to Khokhar bike Management Site");

        meteor m = new meteor();
        m.putdetails();
    }
}