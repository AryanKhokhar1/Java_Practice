class cellphone{
    String mode = "Speaker";
    String call(){
        if(mode.equalsIgnoreCase("vibrate")){
            return "vibrating...";
        }else if(mode.equalsIgnoreCase("silent")){
            return "";

        }else{
            return "ringing....\nvibrating...";
        }
    }
}
public class Practice8_2 {
    public static void main(String[] args) {
        cellphone c1 = new cellphone();
        System.out.println(c1.call());
    }
}
