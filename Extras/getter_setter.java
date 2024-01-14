// getter and setter is used for take and set the value of 
public class getter_setter {
    private String name;
    // public getter_setter(){
    // }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public static void main(String[] args){
        getter_setter obj = new getter_setter();
        obj.setname("Aryan");
        System.out.println("Name = "+obj.getname());
    }
}
