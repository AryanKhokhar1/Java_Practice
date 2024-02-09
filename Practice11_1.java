
abstract class Pen{
    abstract String write(String Word);
    abstract void refile();
}
class Student extends Pen{
    int refilelimit;
    Student(){
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
        this.refilelimit = 1000;
    }
}
class Practice11_1 {
    public static void main(String[] args) {
        Student spen = new Student();
        spen.write("Hello");
        System.out.println(spen.refilelimit);
        spen.refile();
        System.out.println(spen.refilelimit);

    }
}
