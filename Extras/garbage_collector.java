public class garbage_collector {
    public void finalize(){
        System.out.println("Finalize function run Successfully!");
    }
    public static void main(String[] args) {
        garbage_collector obj1 = new garbage_collector();
        garbage_collector obj2 = new garbage_collector();
        garbage_collector obj3 = new garbage_collector();
        garbage_collector obj4 = new garbage_collector();
        obj1 = null;
        obj2 = null;
        obj3 = obj4;
        System.gc();
        
    }
}
