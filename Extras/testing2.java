public class testing2 {
    public static void main(String[] args) {
        // int a= 0;
        StringBuffer obj1 = new StringBuffer("Aryan Khokhar");
        
        obj1.append(".");
        obj1.insert(0,"Mr ");
        // obj1.replace(6, -1, null);
        obj1.delete(0, 3);
        obj1.reverse();
        // obj1 = "Guddu Khokhar";
        System.out.println(obj1);
    }
}
