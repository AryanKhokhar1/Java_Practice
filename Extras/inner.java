class outsider{
    String fname = "Aryan";
    // Here insider class can't use properties of outsider class.
    class insider{
        String lname = "Khokhar";
    }
}
class inner{
    public static void main(String[] args){
        outsider o1 = new outsider();
        outsider.insider i1 = o1.new insider();
        System.out.println("Name = "+o1.fname+" "+i1.lname);
        System.out.println(i1.lname);
    }
}