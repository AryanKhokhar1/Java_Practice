import java.util.Scanner;
class Balance{
    
    int balance;
    Balance(){
        this.balance = 0;
    }
    int getBalance(){
        return this.balance;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
}
class Transaction extends Balance{
    void Deposit(int amount){
        int balance = this.getBalance() + amount;
        this.setBalance(balance);
    }
    int Withdrawal(int amount){
        if(amount <= this.getBalance()){
            int balance = this.getBalance() - amount;
            this.setBalance(balance);
            return 1;
        }else{
            System.out.println("\nALERT! \"Unsufficient balance\"\n");
            return 0;
        }
    }
}
public class BankSystem extends Transaction {
    public static void main(String[] args) {
        // System.out.println("Balance: "+Customer1.getBalance());
        // Customer1.Deposit(10000);
        // System.out.println("Deposit: $10,000");
        // System.out.println("Balance: "+Customer1.getBalance());
        // Customer1.Withdrawal(11000);
        // // System.out.println("Withdraw: $11,000");
        // System.out.println("Balance: "+Customer1.getBalance());
        
        
        BankSystem Customer1 = new BankSystem();
        Scanner s1 = new Scanner(System.in);
        int user_input;
        while (true) {
            System.out.print("\n1: Balance\n2: Deposit\n3: Withdraw\n4: Exit\nPress input to get services: ");
            user_input = s1.nextInt();
            if(user_input == 1){
                System.out.println("Balance: $"+Customer1.getBalance());
            }else if(user_input == 2){
                int dep ;
                System.out.print("Deposit Amount: $");
                dep = s1.nextInt();
                Customer1.Deposit(dep);
                System.out.println("Deposited: $"+ dep);
            }else if(user_input == 3){
                int withd;
                System.out.print("Withdrawal Amount: $");
                withd = s1.nextInt();
                int ans = Customer1.Withdrawal(withd);
                if(ans == 1){
                    System.out.println("Withdraw : $"+ withd);
                }
            }else if(user_input == 4){
                break;
            }else{
                System.out.println("Wrong Input");
            }
        }
    }
}
