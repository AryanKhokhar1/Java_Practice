class Employee{
    int id;
    String name;
    int salary;
    void Printdetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary+"k");
    }
}
public class Chapter8_Custom_class {
    public static void main(String[] args) {
        Employee securityguard = new Employee();

        // Setting attribute for Securityguard
        securityguard.id = 01;
        securityguard.name = "Harsh Rathi";
        securityguard.salary = 34;
        securityguard.Printdetails();
    }
}
