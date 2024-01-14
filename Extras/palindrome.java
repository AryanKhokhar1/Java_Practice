public class palindrome {
    static void check(int num){
        String snum = String.valueOf(num);
        System.out.println(snum);
        String word = "";
        for(int i = 0; i<snum.length();i++){
            char letter = snum.charAt(i);
            word = letter + word;
        }
        System.out.println(word);
        System.out.println("Class of snum ="+ snum.getClass().getSimpleName());
        System.out.println("Class of word ="+ word.getClass().getSimpleName());
        System.out.println(snum.length());
        System.out.println(word.length());
        int word1 = Integer.parseInt(snum);
        int word2 = Integer.parseInt(word);
        if(word1 == word2){
            System.out.println(snum+" is a palindrome number");
        }else{
            System.out.println(snum+" is not a palindrome number");
        }
    }
    public static void main(String[] args){
        check(3333);
  }
}