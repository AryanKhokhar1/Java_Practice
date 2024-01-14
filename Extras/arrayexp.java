public class arrayexp {
    public static void main(String[] args) {
        int[] prime;
        prime = new int[3];
        prime[0] = 5;
        prime[1] = 4;
        prime[2] = 3;
        System.out.println(prime.getClass().getSimpleName());
        System.out.println("Array ="+ prime);
        int n = 1;
        for(int i : prime){
            System.out.println("Number at "+n+" index = "+i);
            n++;
        }
    }
}
