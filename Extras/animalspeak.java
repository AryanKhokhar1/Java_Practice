class animalspeak {
    String voice;

    animalspeak(String voice){
        this.voice = voice;
    }
    
    void printspeak(){
        System.out.println(this.voice);
    }
    public static void main(String[] args){

        // Create an instance named a of animalspeak
        String catvoice = "meow";
        animalspeak a = new animalspeak(catvoice);

        // a.speak();
        a.printspeak();

        String dogvoice = "bowh";
        animalspeak b = new animalspeak(dogvoice);

        // a.speak();
        b.printspeak();
        a.printspeak();
    }
}