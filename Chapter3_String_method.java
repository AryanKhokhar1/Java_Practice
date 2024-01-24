public class Chapter3_String_method {
    public static void main(String[] args) {
        String name = "Aryan Khokhar";
        String nonTrimmedString = "    Aryan Khokhar   ";

        /*
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nonTrimmedString.trim());

        String firstname = name.substring(0,5);
        System.out.println("First Name: "+firstname);
        System.out.println("Last Name: "+name.substring(6));

        System.out.println(name.replace('r','R')); // Replace in whole string 
        System.out.println(name.replace("ry","RY"));  
        // Remember in Java single comma used for character and double comma used for String 
        */
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("har"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("Kh",2)); // indexof function works on both char and str

        System.out.println(name.lastIndexOf("r")); // It start finding from backward

        System.out.println(name.equals("Aryan Khokhar")); // It check given string is same as defined string

        System.out.println(name.equalsIgnoreCase("aryan khokhar")); // Check here isn't case sensitive

    }
}
