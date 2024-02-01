class Employee{
    private int id;
    private String name;

    void setName(String gname){ // This is setter function for Name
        this.name = gname;
    }
    String getName(){ // This is a getter function for Name
        return this.name;
    }

    void setId(int id){ 
        this.id = id;
    }
    int getId(){
        return this.id;
    }
}

public class Chapter9_getter_setter {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Rohit Panwar");
        System.out.println("Id of the Employee: "+emp1.getId());
        System.out.println("The Name of the Employee: "+emp1.getName());
    }
}
