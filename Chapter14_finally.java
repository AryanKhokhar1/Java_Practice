public class Chapter14_finally {
    public static void main(String[] args) {
        

        for(int i = 1; i<10; i++){
            if(i%4 == 0){
                try{
                    System.out.println(i);
                    break;
                }catch(Exception e){
                    System.out.println(e);
                }finally{ // Finally block contain essential code so finally code must be run
                    System.out.println("Cleanning up resources...");
                }
            }
            System.out.println(i);
        }
    }
}
