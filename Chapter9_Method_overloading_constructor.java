// Method Overloading also applicable on Constructor
/**
 * Employee
 */
class Employee {
    private int id;
    private String name;

    // Method Overloading also applicable on Constructor
    Employee(){

    }
    Employee(int id, String name){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Chapter9_Method_overloading_constructor {
    public static void main(String[] args) {
        Employee emp1 =new Employee(14, "Nishant Tomar");
        Employee emp2 = new Employee();
        emp2.setName("Ryan Rynoald");
        emp2.setId(45);
        System.out.println("Employee 1");
        System.out.println("Id of the Employee: "+emp1.getId());
        System.out.println("Name of the Employee: "+emp1.getName());
        System.out.println("Employee 2");
        System.out.println("Id of the Employee: "+emp2.getId());
        System.out.println("Name of the Employee: "+emp2.getName());
    }
}
