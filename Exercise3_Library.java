import java.util.Scanner;

class Library{
    
    // We Created a Library of 100 Books Storage
    String[] Available_Book = new String[100];
    Library(String ...arr){

        String[] bydefaultbooks = {"Harry Poter", "Gullivan Travel", "Rich Dad Poor Dad"};
        for(int i = 0; i< bydefaultbooks.length; i++){
            this.Available_Book[i] = bydefaultbooks[i];
            // System.out.println(this.Available_Book[i]);
        }
        for(int i = bydefaultbooks.length; i<(bydefaultbooks.length+arr.length); i++){
            this.Available_Book[i] = arr[i-bydefaultbooks.length];
            // System.out.println(this.Available_Book[i]);
        }
        
        
    }
    void showAvailableBooks(){
        System.out.print("Available Books: ");
        for(String book:  this.Available_Book){
            if(book != null){
                System.out.print(book+", ");
            }
        }
    }

    void issueBook(String bookName){
        int presence = 1;
        for(int i = 0; i < this.Available_Book.length; i++){
            if(this.Available_Book[i] != null){
                if(this.Available_Book[i].equalsIgnoreCase(bookName)){
                    this.Available_Book[i] = null;
                    presence = -1;
                    break;
                }
            }
        }
        if(presence == -1){
            System.out.println(bookName+" named Book issued Succefully");
        }else{
            System.out.println(bookName + " named Book not available in Library");
        }
    }
    void returnBook(String bookName){
        for(int i = 0; i < this.Available_Book.length; i++){
            if(this.Available_Book[i] == null){
                this.Available_Book[i] = bookName;
                System.out.println(bookName+" named Book returned Successfully");
                break;
            }
        }
    }
}

public class Exercise3_Library {
    public static void main(String[] args) {
        Library library1 = new Library("Satya Mai Jai te", "Alfaz", "Chakitsa");
        library1.showAvailableBooks();
        // library1.issueBook("Alfaz");
        // library1.issueBook("Ravan");
        // library1.returnBook("Alfaz");
    }
}
