class Employee{
    int salary;
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
}
public class Practice8_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Aryan Khokhar");
        e1.salary = 100000;
        System.out.println("Name of the Employee: "+e1.getName());
        System.out.println("Salary of the Employee: "+e1.getSalary());
    }
}
