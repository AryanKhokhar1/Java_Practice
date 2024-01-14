import PROGRAMS.Constructor.*;
class Calling_another_Program{
    public static void main(String[] args){
        Constructor newobj = new Constructor(17);
        System.out.println("First variable ="+newobj.a+". Second Variable ="+newobj.ag);
    }
}
