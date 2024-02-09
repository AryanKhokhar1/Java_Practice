
abstract class Pen{
    abstract String write(String Word);
    abstract void refile();
}
class FountainPen extends Pen{
    int refilelimit;
    FountainPen(){
        this.refilelimit = 1000;
    }
    String write(String Word){
        if(this.refilelimit > Word.length()){
            this.refilelimit -= Word.length();
            return Word;
        }else{
            System.out.println("Refile is empty... \n Refile the pen");
            return "";
        }
    }
    void refile(){
        ChangeNib();
        this.refilelimit = 1000;
    }
    private void ChangeNib(){
        System.out.println("New Refil is planted in the Pen");
    }
}
class Practice11_2 {
    public static void main(String[] args) {
        FountainPen spen = new FountainPen();
        spen.write("Hello");
        System.out.println(spen.refilelimit);
        spen.refile();
        System.out.println(spen.refilelimit);

    }
}
